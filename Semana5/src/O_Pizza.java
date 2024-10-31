import java.util.Scanner;

public class O_Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ingredientesAIgnorar= sc.nextInt();
        int nDePizzas= sc.nextInt();
        int ingaig=0;
        int nDaPizza=0;
        int alg1;
        int alg2;
        int cont1=0;
        int cont2=0;

        for (int i = 0; i < nDePizzas ; i++) {

            nDaPizza= sc.nextInt();
            ingaig=ingredientesAIgnorar;
            int a=0;

            if (ingaig!=0) {
                while (ingaig > 0) {
                    alg1 = ingaig % 10;
                    ingaig /= 10;
                    a=nDaPizza;

                    while (a > 0) {
                        alg2 = a % 10;
                        if (alg2 == alg1) {
                            cont1++;
                        }
                        a /= 10;
                    }
                }
            }else {
                alg1 = 0;
                a=nDaPizza;
                while (a > 0) {
                    alg2 = a % 10;
                    if (alg2 == alg1) {
                        cont1++;
                    }
                    a /= 10;
                }
            }

            if(cont1==0){
                    cont2++;
                    System.out.println("Suggestion #"+cont2+":"+nDaPizza);
            }
            cont1=0;
            alg1=0;
            alg2=0;
        }
    }
}
