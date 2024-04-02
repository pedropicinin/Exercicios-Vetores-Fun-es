import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int par = 0;

        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);

            i += par;
        }

        input.close();
    }
}