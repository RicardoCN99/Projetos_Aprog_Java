import java.util.Scanner;

public class ConvertFromBase8to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int alg = 0;
        int numdec = 0;
        int cont = 0;

        while (numero >= 0) {
            while (numero != 0) {
                alg = numero % 10;
                numero /= 10;
                numdec = (int) (numdec + alg * (Math.pow(8, cont)));
                cont += 1;
            }
                System.out.println(numdec);
            numero=sc.nextInt();
            cont=0;
            numdec=0;
        }
    }
}
