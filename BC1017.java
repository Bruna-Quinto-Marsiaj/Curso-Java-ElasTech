import java.util.Scanner;

public class BC1017{   //BC exige que o nome da classe seja "Main"

    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        int tempoH;
        int velocM;

        int distancia;
        double consumo;

        //ENTRADA
        tempoH = teclado.nextInt();
        velocM = teclado.nextInt();

        //PROCESSAMENTO
        distancia = tempoH * velocM;
        consumo = distancia / 12.0; //pq 12km/l segundo o exercício. Aqui considerar 12.0 pq todas variaveis da conta foram declaradas inteiras e dará erro ao calcular a distancia, dará 70,000 e n 70,833. No BC em função do idiota não dará problema a vírgula

        //SAÍDA
        System.out.printf("%.3f\n", consumo);



    teclado.close();
    }
}