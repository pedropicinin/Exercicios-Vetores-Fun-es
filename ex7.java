import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double vetor[] = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = input.nextDouble();
        }


        double maior = vetor[0];
        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior: " + maior);
        System.out.println("O menor: " + menor);

        input.close();
    }
}
