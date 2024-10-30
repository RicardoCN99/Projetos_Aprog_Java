import java.util.Scanner;

public class M_FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int cont=2;
        int a=1,b=0,c=0;

        if (n==1) {
            System.out.println("0");
        }else if(n==2) {
            System.out.println("0");
            System.out.println("1");
        }else {
            System.out.println("0");
            System.out.println("1");
            do {
                c = a + b;
                System.out.println(c);
                b = a;
                a = c;
                cont += 1;
            } while (cont != n);
        }
    }
}
