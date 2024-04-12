import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int secret = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;
        String status;

        while ( attempts > 0 ) {
            System.out.println("Adivinhe o número secreto entre 0 e 100! Qual o seu palpite? (tentativas restantes: " + attempts + ")");
            int shot = scanner.nextInt();

            if (shot == secret) {
                System.out.println("Parabéns! Você acertou o número secreto (" + secret + ") com " + (5 - attempts) + "tentativas.");
                break;
            }

            if (shot > secret) {
                status = "menor";
            } else {
                status = "maior";
            }

            System.out.println("O número secreto é " + status + " que " + shot +".");
            attempts--;
        }

        if ( attempts == 0 ) {
            System.out.println("Que pena, você perdeu. O número secreto era: " + secret);
        }

    }
}
