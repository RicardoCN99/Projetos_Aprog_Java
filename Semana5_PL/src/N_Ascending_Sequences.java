import java.util.Scanner;

public class N_Ascending_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int alg1=0;
        int a=0;
        int n= sc.nextInt();
        int ninicial=0;
        int alg2=0;
        int cont=0;
        int cont1=0;


        while(n>=0) {
            cont1++;


            if (n > ninicial || cont1==1) {
                a = n;
                 do{

                    alg2 = alg1;
                    alg1 = a % 10;
                    a /= 10;
                    cont++;
                }while (alg1 < alg2 && a > 0 || cont==1);
            }

            if (cont1!=1){
                if (a==0 && alg1 < alg2 ){
                    System.out.println(n);
                }
                else{
                }
            }

            ninicial=n;
            n= sc.nextInt();
            alg1=0;
            alg2=0;
            cont=0;
        }


    }
}
