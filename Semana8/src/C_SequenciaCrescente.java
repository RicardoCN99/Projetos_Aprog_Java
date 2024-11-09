import java.util.Scanner;

public class C_SequenciaCrescente {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int quantNumeros=sc.nextInt();
        int[] arr=new int[quantNumeros];
        preencheArray(sc,quantNumeros,arr);

        System.out.println("always ascending = "+verificaSeCrescente(arr,quantNumeros));
    }

    public static int[] preencheArray(Scanner sc,int quantnumeros, int[] arr){
        for (int i = 0; i < quantnumeros; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static boolean verificaSeCrescente(int[] arr,int quantNumeros){
        boolean verificador=true;
        for (int i = 0; i < quantNumeros-1 ; i++) {
            if (arr[i]<arr[i+1]){
            }else {
                return false;
            }
        }
        return verificador;
    }
}
