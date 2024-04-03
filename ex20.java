import java.util.Arrays;
import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double precos[] = new double[10];

        for (int i = 0; i < precos.length; i++){
            System.out.println("Digite o " + (i + 1) + "º preco:");
            precos[i] = input.nextInt();
        }

        for(int i=0;i<precos.length;i++) {

            precos[i]=-precos[i];
        }

        Arrays.sort(precos);

        for(int i=0;i<precos.length;i++) {

            precos[i]=-precos[i]; 
        }

        System.out.println("Os preços em ordem decrescente são:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(precos[i]);
        }

        input.close();
    }
}
