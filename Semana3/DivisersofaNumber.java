import java.util.Scanner;

public class DivisersofaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int numero= sc.nextInt();
        int cont=0;

        for (int i =1; i <=numero ; i++) {
            if(numero%i==0){
                System.out.println(i);
                cont+=1;
            }
        }
        System.out.println("("+cont+")");
    }
}
