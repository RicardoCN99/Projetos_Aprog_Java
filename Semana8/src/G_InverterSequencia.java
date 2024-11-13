import java.util.Scanner;

public class G_InverterSequencia {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int[] seqNumeros= new int[n];
        preencheArray(sc,seqNumeros,n);
        inverteSequencia(seqNumeros,n);
    }
    public static void preencheArray(Scanner sc,int[] seqNumeros, int n){

        for (int i = 0; i < n; i++) {
            seqNumeros[i]= sc.nextInt();
        }
    }

    public static void inverteSequencia(int[] seqNumeros, int n){
        for (int i = n-1; i >=0 ; i--) {
            System.out.println(seqNumeros[i]);
        }
    }
}
