import java.util.Scanner;

public class J_SomaTripla {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("triples="+NumeroDeTriplas(n));
    }


    public static int NumeroDeTriplas(int numero){
        int primeironumero =numero-2;
        int terceironumero =1;
        int segundonumero =1;
        int cont1=0;
        int cont2=0;

        while(cont2==0) {
                int segnumero=segundonumero;

                while (primeironumero >= segundonumero && terceironumero <= segundonumero && primeironumero + segundonumero + terceironumero == numero) {
                    System.out.println(primeironumero + " + " + segundonumero + " + " + terceironumero);
                    cont1++;
                    segundonumero--;
                    terceironumero++;
                }

                primeironumero--;
                int b=primeironumero;
                segundonumero=segnumero+1;
                int c=segundonumero;
                terceironumero=1;

                if(primeironumero<=segundonumero){
                    segundonumero=primeironumero;
                    terceironumero=numero-(segundonumero+primeironumero);
                    if (terceironumero<=segundonumero) {

                        while (primeironumero >= segundonumero && terceironumero <= segundonumero && primeironumero + segundonumero + terceironumero == numero) {
                            System.out.println(primeironumero + " + " + segundonumero + " + " + terceironumero);
                            cont1++;
                            segundonumero--;
                            terceironumero++;
                        }
                    }else{
                        cont2=1;
                    }
                }
                primeironumero=b;
                segundonumero=c;
        }
        return cont1;
    }
}
