import java.util.Scanner;

public class K_Sem_Repeticoes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrayN=new int[n];

        preencheArray(n,arrayN,sc);
        exibirResultados(arrayN);
    }

    public static void preencheArray(int n,int[] arrayN,Scanner sc){
        for(int i=0; i<n; i++){
            arrayN[i]=sc.nextInt();
        }
    }

    public static void exibirResultados(int[] arrayN){
        for(int i=0; i<arrayN.length; i++){
            if(!verificaSeRepetido(i,arrayN,arrayN[i])){
                System.out.println(arrayN[i]);
            }
        }
    }

    public static boolean verificaSeRepetido(int indice, int[] arr, int valor){
        for(int i=0; i<indice; i++){
            if(valor==arr[i])
                return true;
        }
        return false;
    }

}
