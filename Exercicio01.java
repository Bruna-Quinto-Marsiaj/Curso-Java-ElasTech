/* Entrar com um numero de 3 digitos e inverte-los, ex: 123 para 321 */

import java.util.Scanner;                /*comentário em bloco */
public class Exercicio01{
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        int numeroOriginal, c, d, u, resto;
        int novoNumero;

        //ENTRADA DE DADOS
        System.out.println("Digite um numero inteiro de 3 digitos");
        numeroOriginal = teclado.nextInt();

        //PROCESSAMENTO
        c = numeroOriginal / 100;    // ex: 234/100 = 2, portanto c = 2
        resto = numeroOriginal % 100; // ex: 234 % 100 = 34, portanto resto = 34 NÃO ENTENDI OS PORCENTO***
        d =  resto / 10;             // ex: 34 / 10 = 3, portanto d = 3
        u = resto % 10;              // ex: 34 % 10 = 4, portanto u = 4

        novoNumero = u * 100 + d * 10 + c;

        //SAÍDA
        System.out.println ("O novo numero vale ="+novoNumero);

        teclado.close();
    }

 }