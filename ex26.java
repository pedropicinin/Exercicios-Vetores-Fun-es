import java.util.Scanner;
public class ex26 {
    public static void Media(double vet[]){
        double soma = 0;
        for(int i=0; i<vet.length; i++){
            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.println("A media das notas e: " + media);
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double notas[] = new double[10];

        for(int i=0; i<notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota:");
            notas[i] = input.nextDouble();
        }

        Media(notas);

        input.close();
    }
}
