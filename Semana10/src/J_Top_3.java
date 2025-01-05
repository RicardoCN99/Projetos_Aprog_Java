import java.util.Objects;
import java.util.Scanner;

public class J_Top_3 {
    final static int MAXEXEMPLOS = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[MAXEXEMPLOS];
        int[] salario = new int[MAXEXEMPLOS];

        preencherArrayNomes(sc, nomes, salario);
        ordenarSalariosENomes(nomes, salario);
        exibirResultados(nomes,salario);
    }

    public static void preencherArrayNomes(Scanner sc, String[] nomes, int[] salario) {
        int j = 0;
        int i = 0;
        String nome = sc.nextLine();
        while (!Objects.equals(nome, "END")) {
            nomes[i++] = nome;
            salario[j++] = sc.nextInt();
            sc.nextLine();
            nome = sc.nextLine();
        }
    }

    public static void ordenarSalariosENomes(String[] nomes, int[] salarios) {
        for (int i = 0; i < salarios.length; i++) {
            for (int j = i + 1; j < salarios.length; j++) {
                if (salarios[i] < salarios[j]) {
                    int aux = salarios[i];
                    salarios[i] = salarios[j];
                    salarios[j] = aux;

                    String nomeaux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = nomeaux;
                }
                if(Objects.isNull(nomes[j]) || Objects.isNull(nomes[i])) {
                }
                else{
                    if (salarios[i] == salarios[j] && nomes[i].compareTo(nomes[j])>0) {
                        int aux = salarios[i];
                        salarios[i] = salarios[j];
                        salarios[j] = aux;

                        String nomeaux = nomes[i];
                        nomes[i] = nomes[j];
                        nomes[j] = nomeaux;
                    }
                }
            }
        }
    }
    
    public static void exibirResultados(String[] nomes, int[] salarios){
        for(int i=0; i<3; i++){
            if(!Objects.isNull(nomes[i]))
            System.out.printf("#%d:%s:%d%n",i+1,nomes[i],salarios[i]);
        }
    }
}