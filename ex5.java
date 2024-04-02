import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[15];
        int indice = -1;
        boolean certo = false;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            int num = input.nextInt();

            if (num >= 1 && num <= 50) {
                vetor[i] = num;
            }
            else {
                System.out.println("Por favor, digite um número entre 1 e 50.");
                i--;
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 20) {
                certo = true;
                indice = i;
                break;
            }
        }

        if (certo) {
            System.out.println("O número 20 existe no vetor, no indice: " + indice);
        } else {
            System.out.println("O número 20 não existe no vetor.");
        }


        input.close();
    }
}
