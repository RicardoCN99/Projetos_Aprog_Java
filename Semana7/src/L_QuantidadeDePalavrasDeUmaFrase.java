import java.util.Scanner;

public class L_QuantidadeDePalavrasDeUmaFrase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String frase= sc.nextLine();

        System.out.println(numeroDePalavras(frase));

    }

    public static int numeroDePalavras(String frase){

        frase= frase.trim();
        int quantidadeDeCaracteres=frase.length();
        int cont=0;
        char c=0;
        char b=0;

        for (int i = 0; i <quantidadeDeCaracteres ; i++) {

            c = frase.charAt(i);

            if (c != ' ' && (b == ' ' || b==0)) {
                cont++;

            }b = c;
        }


        return cont;
    }
}
