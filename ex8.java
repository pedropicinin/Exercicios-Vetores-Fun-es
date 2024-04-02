import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vetor[] = new int[15];
        int vetorinvertido[] = new int[15];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            vetorinvertido[i] = vetor[vetor.length - 1 - i];
        }

        System.out.println("Vetor invertido:");
        for (int num : vetorinvertido) {
            System.out.print(num + " ");
        }
        

        input.close();
    }
}
