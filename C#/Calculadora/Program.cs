using System;

abstract class Calculadora{
    public abstract double fazerConta (double num1, double num2);
}

class Soma : Calculadora {
    public override double fazerConta (double num1, double num2) {
        return num1 + num2;
    }
}

class Subtracao : Calculadora {
    public override double fazerConta (double num1, double num2) {
        return num1 - num2;
    }
}

class Divisao : Calculadora {
    public override double fazerConta (double num1, double num2) {
        return num1 / num2;
    }
}

class Multiplicacao : Calculadora {
   public override double fazerConta (double num1, double num2) {
        return num1 * num2;
    }
}

class Program {
    static void Main() {

        Console.WriteLine("(1) Soma");
        Console.WriteLine("(2) Subtração");
        Console.WriteLine("(3) Divisão");
        Console.WriteLine("(4) Multiplicação");
        Console.Write("Digite qual operação deseja fazer: ");
        int escolha = int.Parse(Console.ReadLine());

        Console.Write("Digite o primeiro número: ");
        double num1 = double.Parse(Console.ReadLine());
        Console.Write("Digite o segundo número: ");
        double num2 = double.Parse(Console.ReadLine());

        Calculadora calc = null;

        switch (escolha) {
            case 1:
                calc = new Soma();
                break;
            case 2:
                calc = new Subtracao();
                break;
            case 3:
                calc = new Divisao();
                break;
            case 4:
                calc = new Multiplicacao();
                break;
            default:
                Console.WriteLine("Opção inválida");
                break;
        } 
        double resultado = calc.fazerConta(num1, num2);
        Console.WriteLine($"Resultado: {resultado}");
    }
}