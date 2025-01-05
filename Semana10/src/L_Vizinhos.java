import java.util.Scanner;

public class L_Vizinhos {
    final static int MAXNUMEROS=30;

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] numeros= new int[MAXNUMEROS];

        preencherArray(numeros,sc);
        exibirResultados(numeros);
    }

    public static void preencherArray(int[] numeros, Scanner sc) {
        int numero=0;
        int i=0;
        while(numero>=0 && i<MAXNUMEROS){
            numero=sc.nextInt();
            numeros[i++]=numero;
        }
    }

    public static void exibirResultados(int[] numeros){
        for(int i=0; i<numeros.length; i++){
            if(verificaSeExibe(i,numeros))
                System.out.println(numeros[i]);
        }
    }

    public static boolean verificaSeExibe(int i, int[] numeros) {
        if(i!=0 && i!=29){
            if(numeros[i]>numeros[i-1] && numeros[i]>numeros[i+1] && numeros[i+1]>=0)
                return true;
        }
        return false;
    }
}
