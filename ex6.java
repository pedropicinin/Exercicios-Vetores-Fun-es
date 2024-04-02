import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        Random r = new Random();

        ArrayList<Integer> vetor = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            vetor.add(r.nextInt(100) + 1);
        }

        System.out.println("Vetor: " + vetor);

        System.out.println("Digite um valor a ser removido:");
        int valor = input.nextInt();

        if (vetor.contains(valor)) {
            vetor.remove(Integer.valueOf(valor));
            System.out.println("O valor "+valor+" foi removido do vetor: " + vetor);
        }
        else{
            System.out.println("O valor " + valor + " não foi encontrado no vetor.");
        }
        

        input.close();
    }
}
