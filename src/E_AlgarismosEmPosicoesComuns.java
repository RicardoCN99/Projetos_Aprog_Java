import java.util.Scanner;

public class E_AlgarismosEmPosicoesComuns {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        int alg=0;
        int n=0;

        while(x!=0){
            alg=x%10;
            n=n*10+alg;
            x=x/10;
        }
        System.out.println(n);
    }
}
