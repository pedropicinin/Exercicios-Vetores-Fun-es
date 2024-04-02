import java.util.Scanner;
import java.util.ArrayList;
public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double vetor1[] = new double[10];
        double vetor2[] = new double[10];
        ArrayList<Double> vetorintersecao = new ArrayList<>();

        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número PRIMEIRA:");
            vetor1[i] = input.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número da SEGUNDA:");
            vetor2[i] = input.nextInt();
        }

        for ( int i = 0; i < vetor1.length; i++){
            for (int j = 0; j < vetor2.length; j++){
                if (vetor1[i] == vetor2[j]) {
                    vetorintersecao.add(vetor1[i]);
                    break;
                }
            }
        }

        System.out.println("Numeros da intersecao: ");
        System.out.println(vetorintersecao);

        input.close();
    }
}
