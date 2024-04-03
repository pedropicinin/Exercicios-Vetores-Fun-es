import java.util.Scanner;
public class ex25 {
    public static void CalcularPerimetro(double raio){
        double pi = 3.14159;
        double perimetro = 2 * raio * pi;
        System.out.println("O perimetro: " + perimetro);
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o raio  do circulo: ");
        double raio = input.nextDouble();

        CalcularPerimetro(raio);

        input.close();
    }
}
