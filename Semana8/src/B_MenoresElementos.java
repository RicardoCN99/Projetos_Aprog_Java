import java.util.Scanner;

public class B_MenoresElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        preencheArray(sc, arr);
        int menorElem=determinMenorElemento(arr);

        if (arr[0]==0) {

        }else{
        System.out.println("min="+menorElem);
        System.out.println("occurrences="+somaMenorElemento(menorElem,arr));
    }
    }

    public static int[] preencheArray(Scanner sc, int[] arr) {
        int i;
        int valoraColocarNoArray;

            for ( i = 0; i < 100; i++) {
                valoraColocarNoArray=sc.nextInt();
                if(valoraColocarNoArray<0){
                    i=100;
                }else{
                    arr[i] = valoraColocarNoArray;
                }
            }

        int menorElem=determinMenorElemento(arr);

        return arr;
    }

    public static int determinMenorElemento(int[] arr) {
        int menorElemento = arr[0];
        for (int i = 0; i < 100; i++) {
            if (arr[i] < menorElemento && arr[i]>0) {
                menorElemento = arr[i];
            }
        }
        return menorElemento;
    }

    public static int somaMenorElemento(int menorElem, int[] arr){
        int numeroDeMenoresElementos=0;
        for (int i = 0; i < 100; i++) {
            if (menorElem==arr[i]){
                numeroDeMenoresElementos++;
            }
        }
        return numeroDeMenoresElementos;
    }
}