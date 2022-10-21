import java.util.Scanner;

public class Tabuada3{
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        
        int numero = teclado.nextInt();

        for (int contador=1 ; contador <= 10 ; contador++){ //USAR O FOR QUANDO TENHO O NÚMERO DE REPETIÇÕES PRÉ DEFINIDO, JÁ WHILE E DO WHILE EX: VAI CALCULANDO ATÉ EU DIGITAR UM NUM NEGATIVO, EU POSSO N DIGITAR...GERALMENTE O DO WHILE É PARA MENU DE OPÇÕES
            System.out.println(numero + "x" + contador + "=" + (numero * contador));
        }




        teclado.close();

    }
}