import java.util.Objects;
import java.util.Scanner;

public class F_VolumeDeSolidos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio = 0;
        double height = 0;

        String objeto = null;

        while (!Objects.equals(objeto, "end")) {
         objeto = sc.nextLine();

        if (Objects.equals(objeto, "sphere")) {
            raio = sc.nextDouble();
            sc.nextLine();
            System.out.printf("%.2f%n",VolumeSphere(raio));
        }else if (Objects.equals(objeto, "cylinder")){
            raio=sc.nextDouble();
            height=sc.nextDouble();
            sc.nextLine();
            System.out.printf("%.2f%n",VolumeCylinder(raio,height));
        }else if (Objects.equals(objeto, "cone")){
            raio=sc.nextDouble();
            height=sc.nextDouble();
            sc.nextLine();
            System.out.printf("%.2f%n",VolumeCone(raio,height));
        }
    }
    }
    public static double VolumeSphere(double raio){
        double pi = Math.PI;
        double volume= ((4*pi*Math.pow(raio,3))/3);
        return volume;
    }

    public static double VolumeCylinder(double raio, double height){
        double pi= Math.PI;
        double volume=pi*Math.pow(raio,2)*height;
        return volume;
    }

    public static double VolumeCone(double raio,double height){
        double pi= Math.PI;
        double volume=(pi*Math.pow(raio,2)*height)/3;
        return volume;
    }
}
