import java.util.Scanner;

public class E_AlgarismosEmPosicoesComuns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int paresdenumeros= sc.nextInt();
        int n1;
        int n2;

        int paresComMaisPosComuns=0;
        int num1maisposcomuns=0;
        int num2maisposcomuns=0;


        for (int i = 0; i <paresdenumeros ; i++) {
            n1=sc.nextInt();
            n2=sc.nextInt();

            if (n1>0 && n2>0) {
                if (PosicaoComum(n1, n2) > paresComMaisPosComuns) {

                    paresComMaisPosComuns = PosicaoComum(n1, n2);
                    num1maisposcomuns = n1;
                    num2maisposcomuns = n2;
                }
            }
        }

        if (paresComMaisPosComuns==0){
            System.out.println("no results");
        }else {
            System.out.println(num1maisposcomuns + "/" + num2maisposcomuns);
        }
    }

    public static int PosicaoComum(int n1, int n2){
        int alg1=0;
        int alg2=0;
        int cont1=0;
        int a=n1;
        int b= n2;
        int cont2=0;
        int cont3=0;

        while(a>0){
            alg1=a%10;
                cont2++;
            a/=10;
        }

        while(b>0){
            alg1=b%10;
            cont3++;
            b/=10;
        }

        while(n1>0 && n2>0){
            alg1= (int) (n1/Math.pow(10,cont2-1));
            alg2= (int) (n2/Math.pow(10,cont3-1));
            if (alg1 == alg2){
                cont1++;
            }
            n1/=10;
            n2/=10;
            cont2-=1;
            cont3-=1;
        }
        return cont1;
    }
}
