import java.util.Scanner;
public class ex15 {
    public static int sequencia(int n){
        if (n <= 1){
            return n;
        }
        else {
            return sequencia(n - 1) + sequencia(n - 2);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite um numero inteiro:  ");
        int n = input.nextInt();

        System.out.println("Os numeros da sequencia de fibonacci ate "+n+" : ");

        for (int i = 0; i < n; i++) {
            System.out.println(sequencia(i) + " ");
        }

        input.close();
    }
}
