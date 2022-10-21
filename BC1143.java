/*Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.*/



import java.util.Scanner;
public class BC1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        for (int num=1; num <= N; num++){
            System.out.println(num + " " +(num*num) + " " + (num*num*num));
        }

        teclado.close();
    }
}