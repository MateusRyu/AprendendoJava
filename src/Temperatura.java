import java.util.Scanner;

/*
    Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar
    os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
    Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para
    exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting
    de valores.
*/

public class Temperatura {
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus Celsius que gostaria de converter para Fahrenheit?");
        double celsius = Double.parseDouble(input.nextLine());
        double fahrenheit = (celsius * 1.8) + 32;
        String convertResult = String.format("%.2fºC é igual à %.2fºF.", celsius, fahrenheit);
        System.out.println(convertResult);
        int intergerFahrenheit = (int) fahrenheit;
        String integer = String.format("Aproximadamente: %dºF.",  intergerFahrenheit);
        System.out.println(integer);
    }
}
