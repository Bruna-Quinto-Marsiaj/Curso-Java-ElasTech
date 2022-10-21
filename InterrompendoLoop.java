import java.util.Scanner;

public class InterrompendoLoop{
    public static void main (String args[]){

        /*for (int contador=1; contador <=10; contador++){ //no for o contador++ sempre é executado após as "condições abaixo"
            if (contador == 5){
                continue; //o continue ignora o restante das instruções e volta pro loop. No caso ele ignorou o 5 e seguiu até o 10.
            }
            System.out.println("Contador = "+contador);
        } */

        /*for (int contador = 1; contador <=10; contador++){ // um desses 3 elementos pode ser omitido
            System.out.println("contador = "+contador);
            if (contador == 5){
                break;
            }
            //se eu botar aqui e tirar ali de cima o: "System.out.println("contador = "+contador);" ele vai até o 4 só
        }*/

        /*int contador = 1; // vai até o 4 e para
        while (true){
            if (contador ==5){
                break;
            }
            System.out.println("Contador = "+contador);
            contador++;
        }*/

        int contador = 1; 
        while (contador <= 10){
            if (contador ==5){
                continue;
            }
            System.out.println("Contador = "+contador);// essa instruções e a de baixo são ignoradas, vai até o 4 e volta para o loop, o computador "trava" dar o ctrl c
            contador++;
        }


        System.out.println("Fim do programa");
    }
}