import java.util.Scanner;
public class BC1115{   
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, y;

        do{
            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if ( x > 0 && y < 0){
                System.out.println("quarto");
            }

            /*if (X == 0 || y == 0){ eu posso inserir isso e dentro do while botar true que o resultado será o mesmo. aqui é uma condição de parada
                break;
            }*/
           
        } while( x != 0 && y != 0); // aqui condição de continuidade

        teclado.close();

    }
}