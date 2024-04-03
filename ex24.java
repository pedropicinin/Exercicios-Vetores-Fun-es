import java.util.Scanner;
public class ex24 {
    public static boolean ParOuImpar(int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        boolean resultado = ParOuImpar(numero);

        if (resultado) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        input.close();
    }
}
