import java.util.Scanner;
public class Exercicio02h {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        double raio, altura, V;

        //ENTRADA
        System.out.print("Digite o raio do cilindro:");
        raio = teclado.nextDouble();
        System.out.print("Digite a altura do cilindro:");
        altura = teclado.nextDouble();

        //PROCESSAMENTO
        V = 3.14 * raio * raio * altura;

        //SAÍDA FORMATADA
        System.out.printf("O Volume do cilindro vale %.3f cm3\n" , V);
       

        teclado.close();
    }
}