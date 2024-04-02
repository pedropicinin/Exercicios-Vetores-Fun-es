import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[10];

        int soma = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println("A media e: " + media);

        input.close();
    }
}
