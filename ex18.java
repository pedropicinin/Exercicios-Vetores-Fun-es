import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int temperaturas[] = new int[8];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º temperatura:");
            temperaturas[i] = input.nextInt();
        }

        int maior = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.println("A maior temperatura e: " + maior);

        input.close();
    }
}
