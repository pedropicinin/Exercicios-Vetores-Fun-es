import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[5];
        int vetorinvertido[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º resposta:");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            vetorinvertido[i] = vetor[vetor.length - 1 - i];
        }

        System.out.println("Respostas invertidas:");
        for (int num : vetorinvertido) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
