import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tentativas = 1;
        int numero = sc.nextInt();
        int MAX_TENTATIVAS = 5;

        while (!isPalindrome(numero) && tentativas < MAX_TENTATIVAS) {
            tentativas++;
            numero = sc.nextInt();
        }

        if (tentativas < MAX_TENTATIVAS) {
            System.out.println("palindrome");
        } else
            System.out.println("attempts exceeded");
    }

    public static boolean isPalindrome(int numero) {
        int aux = numero;
        int result = 0;
        while (aux > 0) {
            int algarismo = aux % 10;
            result=result*10+algarismo;
            aux = aux / 10;
        }
        return(result==numero); //retorna falso se result!=numero
    }
}
