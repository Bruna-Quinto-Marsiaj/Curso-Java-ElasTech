import java.util.Scanner;

public class DiversasLeituras{
    public static void main (String args []){
       // Scanner teclado = new Scanner (System.in);
       // String texto;
        //System.out.println("Digite seu nome");
       // texto = teclado.nextLine(); //nextLine aceita o fim somente o enter, já o next espaço e enter, se fosse nome composto o next não pegaria//
       // System.out.println("Seu nome = "+texto);
     
       // Scanner teclado = new Scanner (System.in);
        //int codigo;
       // double preco;
       // String nome;
       // System.out.print("Digite o código: ");
        //codigo = teclado.nextInt();
        //System.out.print("Digite o nome  : ");
        //nome = teclado.nextLine();
       // System.out.print("Digite o preco : ");
        //preco = teclado.nextDouble();

       // System.out.println("Você Digitou " +codigo+ " - " + nome + " R$ "+preco); //deu erro, assim não aparece o "nome". Parece que o problema está em ser tipos diferentes (numeros/texto). Solução: ler tudo como texto e o que achar necessário se faz a conversão
       

        Scanner teclado = new Scanner (System.in);
        int codigo;
        double preco;
        String nome, texto;
        System.out.print("Digite o código: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto); //"o texto que eu digitei se corresponder a número, converter para texto"

        System.out.print("Digite o nome  : ");
        nome = teclado.nextLine();

        System.out.print("Digite o preco : ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto); //ver diferença nas conversões. Usar ponto na numeração e n virgula, pq é a notação internacional e está convertido em texto, senão usariamos virgula e na tela apareceria ponto

        System.out.println("Você Digitou " +codigo+ " - " + nome + " R$ "+preco);

        System.out.printf("Você digitou %d - %s R$ %f", codigo, nome, preco );   //%d significa numero inteiro no printf, %S texto, %f float mesma indicação de %d. printf impressão formatada. Se eu colocar %10.2f significa dizer que tenho 10 caracteres no total no preço, contando com o ponto e as 2 casas decimais, poderia botar somente %.2f, que seria o mesmo que definir somente o numero de casas decimais


       
    }
}