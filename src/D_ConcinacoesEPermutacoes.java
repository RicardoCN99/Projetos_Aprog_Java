import java.util.Scanner;

public class D_ConcinacoesEPermutacoes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n= sc.nextInt();
        int comb=0;
        int perm=0;
        int mn=m-n;

        if(m>=n){
            System.out.println("C("+m+","+n+")="+Combinations(m,n));
            System.out.println("P("+m+","+n+")="+Permutations(m,n));
        }else{

        }

    }

    public static int Fatorial(int x){
        int fator=1;
        while(x>0){
            fator*=x;
            x-=1;
        }
        return fator;
    }

    public static int Combinations(int m,int n){
        int comb=0;
        comb= Fatorial(m)/(Fatorial(n)*Fatorial(m-n));
        return comb;
    }

    public static int Permutations(int m,int n){
        int perm=0;
        perm= Fatorial(m)/Fatorial(m-n);
        return perm;
    }
}
