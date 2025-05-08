class Funcionario {
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private String setor;

    Funcionario(String nome, int idade, String setor) {
        this.nome = nome;
        this.cargo = "Auxiliar";
        this.idade = idade;
        this.salario = 2000.00;
        this.setor = setor;
    }

    Funcionario(String nome, String cargo, int idade, String setor) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = 4000.00;
        this.setor = setor;
    }

    Funcionario(String nome, String cargo, int idade, double salario, String setor) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
    }

    double getSalario() {
        return salario;
    }

    void mostrarDados() {
        System.out.printf("Nome: %s\nCargo: %s\nIdade: %d\nSalário: R$%.2f\nSetor: %s\n\n",
                nome, cargo, idade, salario, setor);
    }
}

public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos Silva", 25, "Financeiro");
        Funcionario f2 = new Funcionario("Maria Oliveira", "Analista", 30, "RH");
        Funcionario f3 = new Funcionario("Ana Souza", "Gerente", 45, 8000.00, "Vendas");
        Funcionario f4 = new Funcionario("Pedro Santos", 22, "Operações");
        Funcionario f5 = new Funcionario("Fernanda Lima", "Diretora", 50, 15000.00, "Executivo");

        f1.mostrarDados();
        f2.mostrarDados();
        f3.mostrarDados();
        f4.mostrarDados();
        f5.mostrarDados();

        double totalSalarios = f1.getSalario() + f2.getSalario() + f3.getSalario() + f4.getSalario() + f5.getSalario();
        System.out.printf("Total a ser pago pela companhia: R$%.2f\n", totalSalarios);
    }
}
