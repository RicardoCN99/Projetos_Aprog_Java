import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int somadiv = 0;
        int cont2=0;
        int i;
        int j;
        for ( i = 2; cont2!=n; i++) {
            do{
            for ( j = 1; j < i; j++) {

                if (i % j == 0) {
                    somadiv += j;
                }
            }
            }while(i>j);

            if (somadiv == i) {
                System.out.println(i);
                cont2+=1;}
                somadiv=0;
        }
    }
}
