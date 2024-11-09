import java.util.Scanner;

public class APAGAR_EXAME2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        while (n<1 || n>10){
            n= sc.nextInt();
        }

    analiseProdutores(sc,n);
    }

    public  static void analiseProdutores(Scanner sc, int nProdutores) {
        final int MINUVAS = 5;
        final int MAXUVAS = 5000;
        final int MAXCAPACIDADEUVAS = 4000;
        int quantidadeDeUvas = 0;
        int tempoDetransporte = 0;
        int tempoDePesagem = 0;
        int maiorTempoProcessamento = 0;
        int nProdComMesmoTempProc = 0;
        int totalQuantidadeDeuvas = 0;
        int produtoresRejeitados = 0;
        double percentagemDeUvasRejeidadas = 0;
        int quantidadeDeUvasRejeidadas=0;

        for (int i = 0; i < nProdutores; i++) {

            while (quantidadeDeUvas < MINUVAS || quantidadeDeUvas > MAXUVAS) {
                quantidadeDeUvas = sc.nextInt();
            }
            while (tempoDetransporte < 60 || tempoDetransporte > 3600) {
                tempoDetransporte = sc.nextInt();
            }
            while (tempoDePesagem < 60 || tempoDePesagem > 1800) {
                tempoDePesagem = sc.nextInt();
            }


            int tempoProcessamento = tempoDePesagem + tempoDetransporte;

            if (quantidadeDeUvas > 4000) {
                produtoresRejeitados++;
                quantidadeDeUvasRejeidadas=quantidadeDeUvas;
            }else {
                if (maiorTempoProcessamento < tempoProcessamento) {
                    maiorTempoProcessamento = tempoProcessamento;
                    nProdComMesmoTempProc = 1;
                } else if (maiorTempoProcessamento == tempoProcessamento) {
                    nProdComMesmoTempProc++;
                }
            }

            totalQuantidadeDeuvas = totalQuantidadeDeuvas + quantidadeDeUvas;

            quantidadeDeUvas=0;
            tempoDetransporte=0;
            tempoDePesagem=0;
        }
        percentagemDeUvasRejeidadas=((double) quantidadeDeUvasRejeidadas/totalQuantidadeDeuvas)*100;


        exibeResultados(maiorTempoProcessamento,nProdComMesmoTempProc,percentagemDeUvasRejeidadas,produtoresRejeitados,nProdutores);

    }

    public static void exibeResultados(int maiorTempoProcessamento, int nProdComMesmoTempProc, double percentagemDeUvasRejeidadas, int produtoresRejeitados,int nProdutores){
        if (nProdutores!=produtoresRejeitados){
            System.out.println("Maior tempo de processamento: "+maiorTempoProcessamento+" segundos , "+nProdComMesmoTempProc+" produtores");
            System.out.printf("Rejeitados: uvas=%.2f%% , produtores=%.2f%%", percentagemDeUvasRejeidadas,(double) produtoresRejeitados/nProdutores*100);
        }else{
            System.out.println("não foram aceites produtores");
        }

    }
}
