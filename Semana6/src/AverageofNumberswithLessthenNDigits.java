import java.util.Scanner;

public class AverageofNumberswithLessthenNDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDigits = sc.nextInt();
        int soma = 0;
        int nnumeros = 0;
        final int K = 5;
        int numero;
        int cont=0;

        while (nnumeros < K) {
            numero = sc.nextInt();
            if (QtdDigitos(numero) < maxDigits) {
                soma += numero;
                cont++;
                nnumeros++;
            } else {
                nnumeros=5;
            }
        }

        if (cont!= 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("0.00");
        }

        sc.close();
    }

    public static int QtdDigitos(int numero) {
        if (numero == 0) return 1;
        int count = 0;
        while (numero > 0) {
            count++;
            numero /= 10;
        }
        return count;
    }
}
