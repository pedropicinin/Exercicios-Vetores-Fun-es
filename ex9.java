import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite a quantidade de recibos: ");
        int qtdrecibo = input.nextInt();

        int recibos[] = new int[qtdrecibo];

        for (int i =0; i < qtdrecibo; i++){
            recibos[i] = i + 1;
        }

        System.out.println("Imprimindo recibos:");

        for (int recibo : recibos) {
            System.out.println("Recibo #" + recibo);
        }

        input.close();
    }
}