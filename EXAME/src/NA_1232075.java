import java.util.Scanner;

public class NA_1232075 {
    final static int MAXMOEDAS = 10;
    final static int MINMOEDAS = 2;
    final static int MAXMAQUINA = 20;
    final static int MINMAQUINA = 1;
    final static int MAXBOLAS = 5;
    final static int MINBOLAS = 2;
    final static int MAXVALORMOEDA = 2;
    final static int MINVALORMOEDA = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDeMoedas = sc.nextInt();
        while (numeroDeMoedas < MINMOEDAS || numeroDeMoedas > MAXMOEDAS) {
            numeroDeMoedas = sc.nextInt();
        }
        CalculaValorBolas(sc, numeroDeMoedas);
    }

    public static void CalculaValorBolas(Scanner sc, int numeroDeMoedas) {
        int numeroDaMaquina = 0;
        int valorDaMoeda = 0;
        int numeroDeBolasAzuis = 0;
        int numeroDeBolasVermelhas = 0;
        int somaDoValorDasMoedasAzuis=0;
        int somaDoValorDasMoedasVermelhas=0;

        for (int i = 0; i < numeroDeMoedas; i++) {

            while (numeroDaMaquina < MINMAQUINA || numeroDaMaquina > MAXMAQUINA) {
                numeroDaMaquina = sc.nextInt();
            }
            while (valorDaMoeda < MINVALORMOEDA || numeroDaMaquina > MAXVALORMOEDA) {
                valorDaMoeda = sc.nextInt();
            }
            if (numeroDaMaquina % 2 == 0) {
                numeroDeBolasAzuis += verificaNumeroDeBolas(valorDaMoeda);
                somaDoValorDasMoedasAzuis+=valorDaMoeda;
            } else {
                numeroDeBolasVermelhas += verificaNumeroDeBolas(valorDaMoeda);
                somaDoValorDasMoedasVermelhas+=valorDaMoeda;
            }

            valorDaMoeda = 0;
            numeroDaMaquina = 0;
        }
        double valorMedioDasBolasAzuis=calculaValorMediaDasBolas(somaDoValorDasMoedasAzuis,numeroDeBolasAzuis);
        double valorMedioDasBolasVermelhas= calculaValorMediaDasBolas(somaDoValorDasMoedasVermelhas,numeroDeBolasVermelhas);
        exibeValores(numeroDeBolasVermelhas, numeroDeBolasAzuis,valorMedioDasBolasAzuis,valorMedioDasBolasVermelhas);
    }

    public static int verificaNumeroDeBolas(int valordaMoeda) {

        int quantidadeDeBolas = 0;
        if (valordaMoeda == MINVALORMOEDA) {
            quantidadeDeBolas = MINBOLAS;
        } else {
            quantidadeDeBolas = MAXBOLAS;
        }
        return quantidadeDeBolas;
    }

    public static double calculaValorMediaDasBolas(int somaDoValor,int numeroDeBolas ){
        double valorMedio=(double) somaDoValor/numeroDeBolas;
        return valorMedio;
    }

    public static void exibeValores(int numeroDeBolasVermelhas, int numeroDeBolasAzuis,double valorMedioBolasAzuis, double valorMedioBolasVermelhas) {
        System.out.println("Saíram " + numeroDeBolasVermelhas + " bolas vermelhas e " + numeroDeBolasAzuis + " bolas azuis");
        System.out.printf("Valor médio das bolas vermelhas/azuis: %.2f/%.2f%n",valorMedioBolasVermelhas,valorMedioBolasAzuis);
        if (valorMedioBolasAzuis>valorMedioBolasVermelhas){
            System.out.println("Valem mais as bolas vermelhas");
        }else if(valorMedioBolasAzuis<valorMedioBolasVermelhas){
            System.out.println("Valem mais as bolas azuis");
        }else{
            System.out.println("Valem o mesmo");
        }

    }


}


