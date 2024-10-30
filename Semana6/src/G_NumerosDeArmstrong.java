import java.util.Scanner;

public class G_NumerosDeArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {

            if (NumeroArmstrong(i) == i) {
                System.out.println(i);
            }
        }

    }

    public static int NumeroArmstrong(int numero) {
        int a = numero;
        int alg = 0;
        int cont1 = 0;
        int somaalgarismos = 0;

        while (a > 0) {
            a = a / 10;
            cont1++;
        }

        a = numero;

        while (a > 0) {
            alg = a % 10;
            somaalgarismos += Math.pow(alg, cont1);
            a /= 10;
        }

        return somaalgarismos;
    }
}
