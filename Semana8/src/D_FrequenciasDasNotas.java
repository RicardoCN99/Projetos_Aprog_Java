import java.util.Scanner;

public class D_FrequenciasDasNotas {
    final static int MAXNOTA=20;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int nAlunos= sc.nextInt();
        int[] notasAlunos= new int[nAlunos];

        preencheNotas(sc,notasAlunos,nAlunos);

        int[] arrayComFreqAbsNotas=new int[MAXNOTA+1];
        calculaFreqAbs(nAlunos,notasAlunos,arrayComFreqAbsNotas);

        exibeResultados(arrayComFreqAbsNotas);

    }

    public static void preencheNotas(Scanner sc, int[] notasAlunos, int nAlunos){
        for (int i = 0; i < nAlunos; i++) {
            notasAlunos[i]= sc.nextInt();
        }

    }

    public static void calculaFreqAbs(int nAlunos,int[] notasAlunos, int[] arrayComFReqAbsNotas){
        int nota=0;
        for (int i = 0; i < nAlunos; i++) {
            nota=notasAlunos[i];
            arrayComFReqAbsNotas[nota]+=1;
        }
    }

    public static void exibeResultados(int[] arrayComFreqAbs){
        for (int i = 0; i <= MAXNOTA; i++) {
            System.out.println(i+" "+arrayComFreqAbs[i]);
        }
    }
}
