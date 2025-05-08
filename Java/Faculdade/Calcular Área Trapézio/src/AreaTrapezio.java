import java.util.Scanner;

public class AreaTrapezio {
    public static double f(double x) {
        return 2 * Math.sin(x) + Math.cos(x) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a, b e n: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        if (a >= b || n <= 0) {
            System.out.println("Erro: verifique os valores de a, b e n");
        } else {
            double h = (b - a) / n, soma = 0, x = a;
            for (int i = 0; i < n; i++) {
                soma += (f(x) + f(x + h)) / 2 * h;
                x += h;
            }
            System.out.println("Integral aproximada: " + soma);
        }

        scanner.close();
    }
}
