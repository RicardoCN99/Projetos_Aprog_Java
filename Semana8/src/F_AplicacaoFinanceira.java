import java.util.Scanner;

public class F_AplicacaoFinanceira {
    final static int MAXMESES=6;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] taxaDeJuro= new double[MAXMESES];
        preencheArrayTaxaDeJuros(sc,taxaDeJuro);

        double valorDepositoInicial=sc.nextDouble();
        exibeResultados(valorDepositoInicial,taxaDeJuro);
    }

    public static double[] preencheArrayTaxaDeJuros(Scanner sc,double[] taxaDEJuros){
        for (int i = 0; i < MAXMESES; i++) {
            taxaDEJuros[i]=sc.nextDouble();
        }
        return taxaDEJuros;
    }

    public static void exibeResultados(double valorDepositoInicial,double[] taxaDeJuros){
        double valorFinal=valorDepositoInicial;
        double acrescimoPorMes=0;

        for (int i = 0; i < MAXMESES; i++) {
            acrescimoPorMes=valorFinal*taxaDeJuros[i];
            valorFinal+=acrescimoPorMes;
        }
        System.out.printf("final value=%.2f%n",valorFinal);
    }
}
