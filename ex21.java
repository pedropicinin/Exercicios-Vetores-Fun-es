import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double entrada[] = new double[5];
        double saida[] = new double[5];

        double somaentrada = 0, somasaida = 0;

        for (int i = 0; i < entrada.length; i++) {
            System.out.println("Digite o valor da "+ (i + 1) + "º entrada:");
            entrada[i] = input.nextInt();

            somaentrada += entrada[i];
        }

        for (int i = 0; i < saida.length; i++) {
            System.out.println("Digite o valor da "+ (i + 1) + "º saida:");
            saida[i] = input.nextInt();

            somasaida += saida[i];
        }

        double saldo = somaentrada - somasaida;

        System.out.println("O saldo final e: R$"+saldo);

        input.close();
    }
}
