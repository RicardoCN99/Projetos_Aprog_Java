import java.util.Scanner;

public class I_ElementoDeFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero= sc.nextInt();

        if(NumeroFibonacci(numero) || numero==0){
            System.out.println("is a Fibonacci number");
        }else{
            System.out.println("is not a Fibonacci number");
        }


    }
    public static boolean NumeroFibonacci(int numero){
        int a=1,b=0,c=0;

        do {
            c = a + b;
            b = a;
            a = c;
        }while(a<numero);

        return a==numero;

    }
}
