import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista:");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio = random.nextInt(100);

            if (numeroAleatorio % 2 == 0) {
                System.out.println(numeroAleatorio + " É par");
            } else if (numeroAleatorio % 3 == 0) {
                System.out.println(numeroAleatorio + " É múltiplo de 3");
            } else {
                System.out.println(numeroAleatorio + " É ímpar");
            }
        }
    }
}
