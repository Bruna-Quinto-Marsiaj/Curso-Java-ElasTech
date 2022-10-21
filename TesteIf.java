import java.util.Scanner;
public class TesteIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double n1, n2, me;
        System.out.print("Digite a N1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextDouble();

        me = (n1 + n2)/2;

        System.out.println("Sua média final vale "+me);

        if (me >= 6) {
            System.out.println("Parabéns vocês está aprovado!");
        }

        else{
            System.out.println("Nos vemos no próximo período!");
        }
     
        System.out.println("Fim do programa!");





        teclado.close();
    }
}
