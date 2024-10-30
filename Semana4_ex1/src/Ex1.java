import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alg=0;

        int num = sc.nextInt();
        do{
            alg= num% 10;
            num=num/10;
            System.out.println(alg);
        }while(num!=0);

    }
}
