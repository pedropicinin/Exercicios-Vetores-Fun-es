import java.util.Scanner;
public class ex28 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        double precos[] = new double[10];
        int quantidade[] = new int[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o valor do " + (i + 1) + "º produto:");
            precos[i] = input.nextDouble();
        }

        for (int i = 0; i < quantidade.length; i++) {
            System.out.println("Digite a quantidade compradas do " + (i + 1) + "º produto:");
            quantidade[i] = input.nextInt();
        }   

        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            total += precos[i] * quantidade[i];
        }        

        double comissao = total * 0.05;

        double salario = 545;
        double salarioTotal = salario + comissao;

        System.out.println("Relatorio de Vendas:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Produto " + (i + 1) + ": Quantidade vendida: " + quantidade[i] +
                               ", Valor unitário: R$" + precos[i] +
                               ", Valor total: R$" + (precos[i] * quantidade[i]));
        }

        int index = 0;
        int maisvendido = quantidade[0];
        for (int i = 1; i < quantidade.length; i++){
            if (quantidade[i] > maisvendido){
                maisvendido = quantidade[i];
                index = i;
            }
        }

        System.out.println("A comissao do vendedor e : R$" + comissao + " e o salario final: R$"+salarioTotal);
        System.out.println("O produto mais vendido: " + maisvendido + " unidades na " + (index + 1) + "º posicao");

        input.close();
    }
}
