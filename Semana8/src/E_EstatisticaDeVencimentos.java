import java.util.Objects;
import java.util.Scanner;

public class E_EstatisticaDeVencimentos {
    final static int MAXFUNCIONARIOS=20;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] salarioFuncionarios = new double[MAXFUNCIONARIOS];
        String[] nomeFuncionarios= new String[MAXFUNCIONARIOS];

        leSalarioENomeDeFuncionarios(sc, salarioFuncionarios,nomeFuncionarios);
        double mediaVencimentos=calculaMediaDosVencimentos(salarioFuncionarios);
        exibeResultados(mediaVencimentos,salarioFuncionarios,nomeFuncionarios);
    }

    public static void leSalarioENomeDeFuncionarios(Scanner sc,double[] salarioFuncionarios, String[] nomeFuncionarios){
        for (int i = 0; i <= MAXFUNCIONARIOS; i++) {
            nomeFuncionarios[i]=sc.next();
            if (nomeFuncionarios[i].equals("end")){
                i=MAXFUNCIONARIOS+1;
            }else {
                salarioFuncionarios[i] = sc.nextDouble();
            }
        }
    }

    public static double calculaMediaDosVencimentos(double[] salarioFuncionarios) {
        double mediaVencimentos;
        double somaVencimentos = 0;
        int cont = 0;
        while (salarioFuncionarios[cont] != 0) {
            somaVencimentos += salarioFuncionarios[cont];
            cont++;
        }

        mediaVencimentos = (double) somaVencimentos / cont;

        return mediaVencimentos;
    }


    public static void exibeResultados(double mediaVencimentos,double[] salarioFuncionarios, String[] nomeFuncionarios){
        System.out.printf("%.1f%n",mediaVencimentos);
        for (int i = 0; i < MAXFUNCIONARIOS; i++) {
            if (salarioFuncionarios[i]!=0){
                if (salarioFuncionarios[i]<mediaVencimentos){
                    System.out.println(nomeFuncionarios[i]);
                }else {
                    i=MAXFUNCIONARIOS;
                }
            }
        }
    }
}
