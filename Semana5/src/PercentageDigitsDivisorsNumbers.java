import java.util.Scanner;

public class PercentageDigitsDivisorsNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int quantnum=sc.nextInt();
        int alg=0;
        int num=0;
        int cont2=0;
        int cont1=0;
        double maxper=0.00;

        if(quantnum>0) {
            for (int i = quantnum; i > 0; i--) {
                num = sc.nextInt();
                int a = num;
                while (a != 0) {
                    alg = a % 10;
                    cont1 += 1;

                    if (alg == 0) {

                    } else if (num % alg == 0) {
                        cont2 += 1;
                    }

                    a /= 10;
                }
                double percentagem = ((double) cont2 / cont1) * 100;
                if (maxper < percentagem) {
                    maxper = percentagem;
                }
                System.out.printf("%.2f%%%n", percentagem);
                cont1 = 0;
                cont2 = 0;
            }
            System.out.printf("(%.2f%%)%n", maxper);
        }else {

        }
    }
}
