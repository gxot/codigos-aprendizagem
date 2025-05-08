import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    protected String nome;
    protected int idade;
    protected String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String email, String matricula, String curso) {
        super(nome, idade, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String email, String disciplina, double salario) {
        super(nome, idade, email);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Disciplina: " + disciplina);
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}

class Funcionario extends Pessoa {
    private String setor;
    private int horas;
    private double salarioHora;

    public Funcionario(String nome, int idade, String email, String setor, int horas, double salarioHora) {
        super(nome, idade, email);
        this.setor = setor;
        this.horas = horas;
        this.salarioHora = salarioHora;
    }

    public double calcularPagamento() {
        return horas * salarioHora;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Setor: " + setor);
        System.out.println("Horas Trabalhadas: " + horas);
        System.out.println("Salário Hora: " + salarioHora);
    }
}

class Monitor extends Aluno {
    private int horasMonitoria;

    public Monitor(String nome, int idade, String email, String matricula, String curso, int horasMonitoria) {
        super(nome, idade, email, matricula, curso);
        this.horasMonitoria = horasMonitoria;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Horas de Monitoria: " + horasMonitoria);
    }

    public double calcularPagamento() {
        return horasMonitoria * 15.0;
    }
}

public class EscolaDeDanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("João", 18, "joao@escola.com", "A001", "Ballet"));
        pessoas.add(new Aluno("Maria", 20, "maria@escola.com", "A002", "Jazz"));
        pessoas.add(new Professor("Carlos", 40, "carlos@escola.com", "Ballet", 4000.0));
        pessoas.add(new Funcionario("Ana", 30, "ana@escola.com", "Secretaria", 160, 25.0));
        pessoas.add(new Monitor("Lucas", 19, "lucas@escola.com", "A003", "Ballet", 30));

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Listar pessoas");
            System.out.println("2. Detalhes de uma pessoa");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                for (Pessoa pessoa : pessoas) {
                    pessoa.apresentar();
                    System.out.println("------------------");
                }
            } else if (escolha == 2) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                Pessoa encontrada = null;
                for (Pessoa pessoa : pessoas) {
                    if (pessoa.nome.equalsIgnoreCase(nome)) {
                        encontrada = pessoa;
                        break;
                    }
                }

                if (encontrada != null) {
                    encontrada.apresentar();
                    if (encontrada instanceof Professor) {
                        System.out.println("Bônus: " + ((Professor) encontrada).calcularBonus());
                    } else if (encontrada instanceof Funcionario) {
                        System.out.println("Pagamento: " + ((Funcionario) encontrada).calcularPagamento());
                    } else if (encontrada instanceof Monitor) {
                        System.out.println("Pagamento Monitoria: " + ((Monitor) encontrada).calcularPagamento());
                    }
                } else {
                    System.out.println("Pessoa não encontrada.");
                }
            } else if (escolha == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
