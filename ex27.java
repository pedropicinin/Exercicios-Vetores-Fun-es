import java.util.Scanner;
public class ex27 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int vet[] = new int[5];
        boolean mod[] = new boolean[vet.length];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vet[i] = input.nextInt();
        }

        for (int i = 0; i <mod.length; i++) {
            mod[i] = true;
        }

    while (true) {
            
        System.out.println("Escolha uma opção:");
        System.out.println("1. Modificar um elemento");
        System.out.println("2. Parar o programa");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        if (opcao ==1) { 
            System.out.println("Digite o indice do elemento que quer modificar: ");
            int index = input.nextInt();

            if (index >= 0 && index < vet.length && mod[index]) {
                System.out.println("Digite o novo numero: ");
                vet[index] = input.nextInt();
                mod[index] = false;
                System.out.println("Elemento Modificado: ");
            }
            else {
                System.out.println("Elemento ja foi modificado");
            }
        }
        else if (opcao == 2){
            System.out.println("Programa encerrado.");
            break;
        }
        else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Elemento " + i + ": " + vet[i]);
        }

    }

        input.close();
    }
}
