import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            boolean primo = true;

            if (vetor[i] <= 1) {
                primo = false;
            }
            else{
                for (int j = 2; j <= Math.sqrt(vetor[i]); j++) {
                    if (vetor[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("Número primo: " + vetor[i] + " na posição: " + i);
            }
        }

        input.close();
    }
}
