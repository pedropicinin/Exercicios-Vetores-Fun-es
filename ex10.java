import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o numero: ");
        int num = input.nextInt();

        int tabuada[] = new int[10];

        for (int i = 0; i < tabuada.length; i++) {
            tabuada[i] = num * (i + 1);
        }

        System.out.println("Taabuada do numero " + num + ":");
        for (int i = 0; i < tabuada.length; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + tabuada[i]);
        }

        input.close();
    }
}