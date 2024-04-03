import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String modelo[] = new String[5];
        double consumo[] = new double[5];

        for (int i = 0; i < modelo.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º modelo de carro:");
            modelo[i] = input.nextLine();
        }

        for (int i = 0; i < consumo.length; i++) {
            System.out.println("Digite o consumo do " + (i + 1) + "º modelo de carro:");
            consumo[i] = input.nextDouble();
        }

        int indexeconomico = 0;
        for (int i = 1; i < modelo.length; i++) {
            if (consumo[i] > consumo[indexeconomico]) {
                indexeconomico = i;
            }
        }

        System.out.println("O carro mais economico é o " + modelo[indexeconomico]);

        for (int i = 1; i < consumo.length; i++) {
            double litros = 1000 / consumo[i];
            System.out.println(modelo[i] + ": " + litros + " litros");
        }

        input.close();
    }
}
