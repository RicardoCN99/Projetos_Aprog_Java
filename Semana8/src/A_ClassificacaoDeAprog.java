import java.util.Scanner;

public class A_ClassificacaoDeAprog {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int nAlunos= sc.nextInt();
        int[] notasAlunos= new int[nAlunos];
        preencheArray(sc,nAlunos,notasAlunos);


        System.out.printf("average=%.1f%n",calculaMediaDaTurma(notasAlunos,nAlunos));
        System.out.println("failures="+somaReprovados(notasAlunos,nAlunos));


    }
    public static int[] preencheArray(Scanner sc,int nalunos,int[] notasAlunos){

        for (int i = 0; i < nalunos; i++) {
            notasAlunos[i]=sc.nextInt();
        }
        return notasAlunos;
    }

    public static double calculaMediaDaTurma(int[] notasAlunos,int nAlunos){
        double mediaDaTurma=0;
        int somaDasNotas=0;
        for (int i = 0; i < nAlunos; i++) {
            somaDasNotas+=notasAlunos[i];
        }
        mediaDaTurma=(double) somaDasNotas/nAlunos;

        return mediaDaTurma;
    }

    public static int somaReprovados(int[] notasAlunos,int nAlunos){
        int reprovados=0;
        for (int i = 0; i < nAlunos; i++) {
            if (notasAlunos[i]<10){
                reprovados++;
            }
        }
        return reprovados;
    }
}
