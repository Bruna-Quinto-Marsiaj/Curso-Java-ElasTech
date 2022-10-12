/* 
    100 kw = 1/7 salario mínimo
    1   kw = x

    x * 100 = salarioMinimo/7 ==> x = salarioMinimo / 7 / 100


*/

import java.util.Scanner;
public class Exercicio03 {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        double salarioMinimo, valor1Kw, qtdKw, valorTotal, valorComDesconto;

        //ENTRADA
        System.out.print("Digite o valor do salario mínimo:");
        salarioMinimo = teclado.nextDouble();
        System.out.print("Digite a quantidade de Kw gastos:");
        qtdKw = teclado.nextDouble();

        //PROCESSAMENTO

        //parte 1 -  saber quanto custa 1kw
        valor1Kw = salarioMinimo / 7 / 100;
        //parte 2 - saber o valor da conta total
        valorTotal = qtdKw * valor1Kw;
        //parte 3 - saber o valor com desconto
        valorComDesconto = valorTotal * 0.9;

        //SAÍDA
        System.out.printf("O valor de 1 Kw R$ %.2f\n" , valor1Kw);
        System.out.printf("O valor total da conta R$ %.2f\n", valorTotal);
        System.out.printf("O valor com desconto R$ %.2f\n", valorComDesconto);



        teclado.close();
    }
}
