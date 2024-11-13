import java.util.Scanner;

public class I__Condominio {
    final static int MAXPISOS=4;
    final static int MAXENTRADAS=3;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[][] proprietarioDeCadaApart= new String[MAXPISOS][MAXENTRADAS];
        preencheArrayProprietarios(sc,proprietarioDeCadaApart);
        String nomeAProcurar=sc.nextLine();
        exibirResultados(proprietarioDeCadaApart,nomeAProcurar);
    }

    public static void preencheArrayProprietarios(Scanner sc,String[][] arr){
        for (int i = 0; i < MAXENTRADAS; i++) {
            for (int j = 0; j < MAXPISOS; j++) {
                arr[j][i]=sc.nextLine();
            }
        }
    }

    public static void exibirResultados(String[][] arr,String nome){
        if(!verificaSeExisteproprietario(arr,nome)) {
            System.out.println("Do not live in the building");
        }else{
        for (int i = 0; i < MAXENTRADAS; i++) {
            for (int j = 0; j < MAXPISOS; j++) {
                if(arr[j][i].equals(nome)) {
                    System.out.println("name=" + nome);
                    System.out.println("entrance=" + i);
                    System.out.println("floor=" + j);
                }
                }
            }
        }
    }

    public static boolean verificaSeExisteproprietario(String[][] arr,String nome){
        for (int i = 0; i < MAXENTRADAS; i++) {
            for (int j = 0; j < MAXPISOS; j++) {
                if(arr[j][i].equals(nome)) {
                    return true;
                }
            }
        }
       return false;
    }
}
