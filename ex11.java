import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int temperatura[] = new int[10];

        int soma = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            temperatura[i] = input.nextInt();

            soma += temperatura[i];
        }

        double media = soma / temperatura.length;

        System.out.println("A temperatura media = " + media);

        input.close();
    }
}
