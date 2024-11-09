import java.util.Scanner;

public class APAGAR_EXAME3 {
    final static int MAXCLIENTES=10;
    final static int MINCLIENTES=0;
    final static int MINCHAPEU=37;
    final static int MAXCHAPEU=56;
    final static int MINCASACO=40;
    final static int MAXCASACO =74;
    final static int MINCALCAS=18;
    final static int MAXCALCAS =54;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int numeroClientes=nClientes(sc);

        maiorReferencia(sc,numeroClientes);
    }


    public static void maiorReferencia(Scanner sc, int numeroClientes){

        int refMayor=0;
        int tamanhoChapeu=sc.nextInt();
        int tamanhoCasaco= sc.nextInt();
        int tamanhoCalcas = sc.nextInt();
        int clientesComMaiorReferencia=0;

        for (int i = 0; i < numeroClientes; i++) {

            while(tamanhoChapeu<MINCHAPEU ||tamanhoChapeu>MAXCHAPEU){
                tamanhoChapeu= sc.nextInt();
            }
            while(tamanhoCasaco<MINCASACO || tamanhoCasaco>MAXCASACO){
                tamanhoCasaco= sc.nextInt();
            }
            while(tamanhoCalcas <MINCALCAS || tamanhoCalcas> MAXCALCAS){
                tamanhoCalcas = sc.nextInt();
            }

            if (Juntar(tamanhoChapeu,tamanhoCasaco,tamanhoCalcas)>refMayor){
                refMayor=Juntar(tamanhoChapeu,tamanhoCasaco,tamanhoCalcas);
            }
            if ((Juntar(tamanhoChapeu,tamanhoCasaco,tamanhoCalcas)==refMayor)){
                clientesComMaiorReferencia++;
            }

            tamanhoCasaco=0;
            tamanhoChapeu=0;
            tamanhoCalcas=0;
        }

        exibirResultado(refMayor,clientesComMaiorReferencia);
    }

    public static int Juntar(int tamanoChapeu, int tamanhoCasaco, int tamanhoCalcas){

        return tamanoChapeu*10000+tamanhoCasaco*100+tamanhoCalcas;
    }

    public static void exibirResultado(int refMayor,int clientesComMaiorRef){
        if (refMayor==0){
            System.out.println("sem informação");
        }else {
            System.out.println("maior referência: "+refMayor);
            System.out.println("clientes com a maior referência: "+clientesComMaiorRef);
        }
    }

    public static int nClientes(Scanner sc){
        int nClientes = sc.nextInt();
        while(nClientes <MINCLIENTES || nClientes >MAXCLIENTES){
            nClientes = sc.nextInt();
        }
        return nClientes;
    }
}

