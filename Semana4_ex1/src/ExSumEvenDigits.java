import java.util.Scanner;

public class ExSumEvenDigits {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int numero= sc.nextInt();
        int alg=0;
        int somapares=0;

        do{
            alg=numero%10;
            numero/=10;
        if(alg%2==0){
            somapares += alg;
        }
        }  while(numero!=0);
        System.out.println(somapares);
    }
}