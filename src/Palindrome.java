import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int alg = 0;
        int cont = 0;
        int numinverso = 0;
        int num=numero,num2=numero;

        while (num != 0) {
            cont += 1;
            num/=10;
        }


        for (int i = cont-1; i>=0 ; i--) {
            alg = num2 % 10;
            numinverso = (int) (numinverso + alg*(Math.pow(10, i)));
            num2=num2/10;
        }

        if(numero==numinverso){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

