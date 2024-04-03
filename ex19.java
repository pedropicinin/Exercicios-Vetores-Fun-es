import java.util.Scanner;
import java.util.Random;
public class ex19 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        Random r = new Random();

        int codigos[] = new int[10];

        for (int i = 0; i < codigos.length; i++){
            codigos[i] = r.nextInt();
        }

        System.out.println("Digite o codigo: ");
        int codigoInserido = input.nextInt();

        boolean procurar = false;

        for ( int codigo : codigos ) {
            if (codigo == codigoInserido) {
                procurar = true;
                break;
            }
        }

        if (procurar) {
            System.out.println("O codigo inserido "+codigoInserido+" esta presente");
        }
        else {System.out.println("O codigo inserido "+codigoInserido+" nao esta no codigo");}
        

        input.close();
    }
}
