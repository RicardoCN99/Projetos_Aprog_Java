import java.util.Scanner;

public class ConvertFromBase8to10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int alg = 0;
        int numdecimal = 0, cont = 0;

        while(num>=0) {
            while (num != 0) {
                alg = num % 10;
                num /= 10;
                numdecimal += (int) (alg * Math.pow(8, cont));
                cont += 1;
            }
            System.out.println(numdecimal);
            num=sc.nextInt();
        }
    }
}
