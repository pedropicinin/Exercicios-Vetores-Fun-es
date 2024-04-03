import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite a quantidade de produtos: ");
        int qtdprodutos = input.nextInt();

        int vetor[] = new int[qtdprodutos];

        for (int i =0; i < qtdprodutos; i++){
            System.out.println("Digite a quantidade de etapas do "+ (i + 1) + "º produto:");
            vetor[i] = input.nextInt();
        }

        System.out.println("Imprimindo produtos:");


        for (int i = 0; i < qtdprodutos; i++) {
            int tempo = vetor[i] * 30;
            System.out.println("O tempo de producao do " + (i + 1) + "º produto tem " + tempo+ " minutos");
        }

        input.close();
    }
}

