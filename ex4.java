import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[20];
        boolean certo = false;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            int num = input.nextInt();

            if (num >= 1 && num <= 30) {
                vetor[i] = num;
            }
            else {
                System.out.println("Por favor, digite um número entre 1 e 30.");
                i--;
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 25) {
                certo = true;
                break;
            }
        }

        if (certo) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }


        input.close();
    }
}