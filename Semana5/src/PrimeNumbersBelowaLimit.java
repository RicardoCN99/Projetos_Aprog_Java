import java.util.Scanner;

public class PrimeNumbersBelowaLimit {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        int cont1=0;
        int cont2=2;

        for (int i = 2; i < num; i++) {
            while(i>=cont2){
                if(i%cont2==0){
                    cont1+=1;
                    cont2+=1;
                }else{
                    cont2+=1;
                }
            }
            cont2=2;

            if(cont1==1){
                System.out.println(i);
            }
            cont1 = 0;
        }
    }
}
