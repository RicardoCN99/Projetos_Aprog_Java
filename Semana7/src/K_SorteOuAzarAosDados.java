import java.util.Scanner;

public class K_SorteOuAzarAosDados {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("points="+pontuacao(n));
    }

    public static int pontuacao(int numeroDePontos){
        int ponto =0;
        int somaDosPontos=0;
        int comparaalg=0;
        int a=numeroDePontos;


        String b=Integer.toString(numeroDePontos);

        int c= b.length();


        while(numeroDePontos>0){
            ponto= (int) (numeroDePontos/Math.pow(10,c));

            if(ponto !=comparaalg){
                somaDosPontos+=ponto;
            }else if(somaDosPontos>0){
                somaDosPontos*=(-1);
                somaDosPontos-=ponto;
            }else{
                somaDosPontos-=ponto;
            }

            comparaalg=ponto;
            numeroDePontos%= (int) Math.pow(10,c);
            c--;
        }
        return somaDosPontos;
    }
}
