import java.util.Scanner; // EXERCÍCIO DE DO WHILE

public class Tabuada2{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int numero = teclado.nextInt();
        int contador;

        contador = 1;
        do { // PRIMEIRO EU FAÇO, DEPOIS EU TESTO
            System.out.println(numero + "x" + contador + "=" + (numero*contador));
            contador = contador + 1; // ou contador ++ ouuuuuu contador += 1
        } while (contador <= 10); //CONDIÇÃO VEM NO FIM

        teclado.close();
    }
} //DIFERENTE DA  WHILE, SE A CONDIÇÃO DA FALSA DE CARA, ELE EXECUTA O CODIGO AO MENOS UMA VEZ. por ex se eu mudo o contador pra 100, que é maior que 10, n poderia...