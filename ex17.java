import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double notas[] = new double[10];

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota:");
            notas[i] = input.nextDouble();

            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A media das notas e: "+ media);

        input.close();
    }
}
