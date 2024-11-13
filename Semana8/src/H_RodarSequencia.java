import java.util.Scanner;

public class H_RodarSequencia {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int[] seqNumeros=new int[n];
        int[] rodaNumero=new int[n];

        preencheArray(sc,n,seqNumeros);

        String rodar= sc.next();
        while(!rodar.equals("exit") ) {
            if (rodar.equals("left") || rodar.equals("right")) {
                rodaONumero(seqNumeros, rodar, rodaNumero, n);
                exibeValores(rodaNumero, n);
            }
            rodar= sc.next();
        }
    }

    public static void preencheArray(Scanner sc,int n,int[] seqNumeros){
        for (int i = 0; i < n; i++) {
            seqNumeros[i]= sc.nextInt();
        }
    }

    public static void rodaONumero(int[] seqNumeros,String rodar,int[] rodaNumero,int n){
        if (rodar.equals("right")){
            for (int i = 0; i < n-1; i++) {
                rodaNumero[i+1]=seqNumeros[i];
            }
            rodaNumero[0]=seqNumeros[n-1];
            for (int i = 0; i < n; i++) {
                seqNumeros[i]=rodaNumero[i];
            }
        }
        else {
            if (rodar.equals("left")) {
                for (int i = 0; i < n - 1; i++) {
                    rodaNumero[i] = seqNumeros[i + 1];
                }
                rodaNumero[n - 1] = seqNumeros[0];
                for (int i = 0; i < n; i++) {
                    seqNumeros[i]=rodaNumero[i];
                }
            }
        }
    }

    public static void exibeValores(int[] rodaNumero,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+rodaNumero[i]+"]");
        }
        System.out.println();
    }
}
