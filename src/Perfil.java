import java.util.Scanner;

public class Perfil {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Qual o seu nome?");
         String name = input.nextLine();
         String greeting = String.format("Olá, %s!", name);
         System.out.println(greeting);
         System.out.println("Tudo bem?");
     }
}
