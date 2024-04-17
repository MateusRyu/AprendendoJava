import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        positive();
        equals();
        calculateArea();
    }

    // Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
    // caso contrário, exiba "Número negativo".
    static void positive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        float number = scanner.nextFloat();

        if (number >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }

    // Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
    // iguais, diferentes, o primeiro é maior ou o segundo é maior.
    static void equals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite outro número inteiro:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("O primeiro número (" + firstNumber + ") é maior que o segundo (" + secondNumber + ").");
        } else if (secondNumber > firstNumber) {
            System.out.println("O segundo número (" + secondNumber + ") é maior que o primeiro (" + firstNumber + ").");
        } else {
            System.out.println("Os dois números são iguais (" + firstNumber + ")!!!");
        }
    }

    // Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente à ação que deseja executar:\n1. Calcular área do quadrado\n2. Calcular área do círculo\n\nSua opção:");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Qual o tamanho de cada lada do quadrado?");
            float size = scanner.nextFloat();
            System.out.println("A área desse quadrado é igual à: " + size * size);
        } else if (option == 2) {
            System.out.println("Qual o tamanho do raio do círculo?");
            float radius = scanner.nextFloat();
            System.out.println("A área desse círculo é igual à: " + Math.PI * radius * radius);
        } else {
            System.out.println("Opção inválida!!!");
        }
    }

    // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

    // Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
    // exiba uma mensagem correspondente.

    // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
}
