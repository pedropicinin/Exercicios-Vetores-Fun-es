import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o valor de N:");
        int N = input.nextInt();

        System.out.println("Números primos menores ou iguais a " + N + ":");

        for (int num = 2; num <= N; num++) {
            boolean ehPrimo = true;

            // Verifica se o número é primo
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(num);
            }
        }
                

            input.close();
    }
}
