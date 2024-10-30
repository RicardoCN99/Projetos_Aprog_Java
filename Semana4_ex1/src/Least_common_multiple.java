import java.util.Scanner;

public class Least_common_multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int a=num1,b=num2,cont1=0,cont2=0;

        while(a!=b) {
            if (num1 < num2) {
                a *= num1 * cont1;
            } else {
                b = num2 * cont2;
            }
        }
    }
}
