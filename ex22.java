import java.util.Scanner;
public class ex22 {
    public static void somanumeros(double num1, double num2){
        double soma = num1 + num2;
        System.out.println("A soma dos numeros é: " + soma);
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o 1º numero:");
        double num1 = input.nextDouble();
        System.out.println("Digite o 2º numero:");
        double num2 = input.nextDouble();

        somanumeros(num1, num2);
        

        input.close();
    }
}
