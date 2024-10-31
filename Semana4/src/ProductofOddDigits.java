import java.util.Scanner;

class ProductofOddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int alg;
        int multimpares = 1;
        int cont=0;

        if(numero>=0) {
            do {
                alg = numero % 10;
                numero /= 10;
                if (alg % 2 != 0) {
                    multimpares *= alg;
                    cont += 1;
                }
            } while (numero != 0);
            if (cont == 0) {
                System.out.println("no odd digits");
            } else {
                System.out.println(multimpares);
            }
        }
    }
}
