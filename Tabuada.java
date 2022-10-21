import java.util.Scanner;

public class Tabuada{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int numero = teclado.nextInt();
        int contador;

        contador = 1;
        while (contador <= 10){
            System.out.println(numero + "x" + contador + "=" + (numero*contador));
            contador = contador + 1; // ou contador ++ ouuuuuu contador += 1
        }



        teclado.close();
    }
}