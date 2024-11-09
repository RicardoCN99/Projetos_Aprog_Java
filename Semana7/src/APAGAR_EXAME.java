import java.util.Scanner;

public class APAGAR_EXAME {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        if (n < 5 || n > 50) {
            while (n < 5 || n > 50) {
                n = sc.nextInt();
            }
        }
        processarProdutos(sc,n);

    }

    public static void processarProdutos(Scanner sc, int n) {
        int quantidadeDeProdutosAprovados = 0;
        int maiorSeqNumAprov = 0;
        int cont = 0;
        int quantidadeDeProdutos = 0;
        int SomaQualidadeProdutos = 0;
        int quantidadeDeProdutosRejeitados = 0;

        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if (q <= 100 && q >= 0) {
                quantidadeDeProdutos++;
                SomaQualidadeProdutos += q;

                if (q >= 50 && q <= 90) {
                    cont++;
                    quantidadeDeProdutosAprovados++;
                } else {
                    cont = 0;

                }
                if (maiorSeqNumAprov < cont) {
                    maiorSeqNumAprov = cont;
                }

                if (q < 50) {
                    quantidadeDeProdutosRejeitados++;
                }

            } else {
                i--;
            }
        }
        exibeResultados(quantidadeDeProdutosAprovados, maiorSeqNumAprov, SomaQualidadeProdutos, quantidadeDeProdutos, quantidadeDeProdutosRejeitados);

    }

    public static void exibeResultados(int quantidadeDeProdutosAprovados, int maiorSeqNumAprov, int SomaQualidadeProdutos, int quantidadeDeProdutos, int quantidadeDeProdutosRejeitados) {
        if (quantidadeDeProdutosAprovados > 0) {
            System.out.println("Número de produtos aprovados = " + quantidadeDeProdutosAprovados);
            System.out.println("Maior sequência de produtos aprovados = " + maiorSeqNumAprov);
        } else {
            System.out.println("Nenhum produto foi aprovado");
        }
        System.out.printf("Valor médio da qualidade dos produtos = %.2f%n", (double) SomaQualidadeProdutos / quantidadeDeProdutos);
        System.out.printf("Rejected (low) = %.2f%%%n", ((double) quantidadeDeProdutosRejeitados / quantidadeDeProdutos) * 100);

    }
}

