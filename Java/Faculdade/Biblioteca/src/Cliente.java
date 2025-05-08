import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private String codigo;
    private String titulo;
    private boolean emprestado;

    public Livro(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
        System.out.println("---------------------------");
    }
}

class Prateleira {
    private String identificacao;
    private ArrayList<Livro> livros;

    public Prateleira(String identificacao) {
        this.identificacao = identificacao;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public String getIdentificacao() {
        return identificacao;
    }
}

class Biblioteca {
    private String nome;
    private ArrayList<Prateleira> prateleiras;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }

    public void listarLivros() {
        System.out.println("Biblioteca: " + nome);
        for (Prateleira prateleira : prateleiras) {
            System.out.println("Prateleira: " + prateleira.getIdentificacao());
            for (Livro livro : prateleira.getLivros()) {
                livro.exibirInformacoes();
            }
        }
    }

    public Livro buscarLivroPorCodigo(String codigo) {
        for (Prateleira prateleira : prateleiras) {
            for (Livro livro : prateleira.getLivros()) {
                if (livro.getCodigo().equalsIgnoreCase(codigo)) {
                    return livro;
                }
            }
        }
        return null;
    }
}

public class Cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Biblioteca biblio1 = new Biblioteca("Biblioteca Principal");
        Prateleira prateleira1 = new Prateleira("P1");
        prateleira1.adicionarLivro(new Livro("L001", "Java Básico"));
        prateleira1.adicionarLivro(new Livro("L002", "Estruturas de Dados"));
        prateleira1.adicionarLivro(new Livro("L003", "Algoritmos"));
        biblio1.adicionarPrateleira(prateleira1);

        Prateleira prateleira2 = new Prateleira("P2");
        prateleira2.adicionarLivro(new Livro("L004", "Bancos de Dados"));
        prateleira2.adicionarLivro(new Livro("L005", "Sistemas Operacionais"));
        prateleira2.adicionarLivro(new Livro("L006", "Redes de Computadores"));
        biblio1.adicionarPrateleira(prateleira2);

        Biblioteca biblio2 = new Biblioteca("Biblioteca Secundária");
        Prateleira prateleira3 = new Prateleira("P3");
        prateleira3.adicionarLivro(new Livro("L007", "Inteligência Artificial"));
        prateleira3.adicionarLivro(new Livro("L008", "Aprendizado de Máquina"));
        prateleira3.adicionarLivro(new Livro("L009", "Deep Learning"));
        biblio2.adicionarPrateleira(prateleira3);

        Prateleira prateleira4 = new Prateleira("P4");
        prateleira4.adicionarLivro(new Livro("L010", "Segurança da Informação"));
        prateleira4.adicionarLivro(new Livro("L011", "Computação em Nuvem"));
        prateleira4.adicionarLivro(new Livro("L012", "Big Data"));
        biblio2.adicionarPrateleira(prateleira4);

        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
        bibliotecas.add(biblio1);
        bibliotecas.add(biblio2);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Listar livros");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                for (Biblioteca biblio : bibliotecas) {
                    biblio.listarLivros();
                }
            } else if (opcao == 2) {
                System.out.print("Digite o código do livro: ");
                String codigo = entrada.nextLine();
                Livro livroEncontrado = null;

                for (Biblioteca biblio : bibliotecas) {
                    livroEncontrado = biblio.buscarLivroPorCodigo(codigo);
                    if (livroEncontrado != null) {
                        break;
                    }
                }

                if (livroEncontrado == null) {
                    System.out.println("Livro não encontrado.");
                } else {
                    System.out.println("Deseja emprestar este livro?");
                    livroEncontrado.exibirInformacoes();
                    System.out.print("Digite 'sim' para confirmar: ");
                    String confirmacao = entrada.nextLine();

                    if (confirmacao.equalsIgnoreCase("sim")) {
                        if (!livroEncontrado.isEmprestado()) {
                            livroEncontrado.emprestar();
                            System.out.println("Livro emprestado com sucesso.");
                        } else {
                            System.out.println("Livro já está emprestado.");
                        }
                    } else {
                        System.out.println("Empréstimo cancelado.");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}
