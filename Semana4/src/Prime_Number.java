import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        int numver;
        int cont=0, a=0;

        for (int i = num; i>=1 ; i--) {
            if(num%i==0){
                cont+=1;
            }
        }
        if(cont==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
