import java.util.Locale;
import java.util.Scanner;

public class C_CalculateTheAnglesOfATriangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        double angulo1=0;
        double angulo2=0;
        double angulo3=0;

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
             angulo1 = AnguloInterno(lado1, lado2, lado3);
             angulo2 = AnguloInterno(lado2, lado3, lado1);
             angulo3 = AnguloInterno(lado3, lado1, lado2);
             System.out.printf("a=%.2f%nb=%.2f%nc=%.2f%n", lado1, lado2, lado3);
             System.out.printf("ang(a,b)=%.2f%nang(a,c)=%.2f%nang(b,c)=%.2f%n", angulo1,angulo3,angulo2);
        }
        else{
            System.out.println("impossible");
        }


    }
    public static double AnguloInterno(double a, double b,double c){
        double anguloInt=Math.toDegrees( Math.acos( ((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2) )/(2*a*b))));
        return anguloInt;
    }
}
