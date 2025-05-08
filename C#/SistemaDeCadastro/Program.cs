class Pessoa {
    public string Nome { get; set; }
    public int Idade { get; set; }
    public string Email { get; set; }

    public Pessoa (String nome, int idade, String email){
        Nome = nome;
        Idade = idade;
        Email = email;
    }
}


class Program {
    static void Main() {

        List<Pessoa> pessoas = new List<Pessoa>();
        int i = 0;
        while (true) {

            Console.WriteLine("\n(1) Criar Usuário\n(2) Mostrar Usuários\n(3) Sair");
            Console.Write("Digite uma opção: ");
            int escolha = int.Parse(Console.ReadLine());

            switch (escolha) {
                case 1:
                    Console.Write("\nDigite seu nome: ");
                    string nome = Console.ReadLine();
                    Console.Write("Digite sua idade: ");
                    int idade = int.Parse(Console.ReadLine());
                    Console.Write("Digite seu email: ");
                    string email = Console.ReadLine();
                    Pessoa novaPessoa = new Pessoa(nome, idade, email);
                    pessoas.Add(novaPessoa);
                    i += 1;
                    break;
                case 2:
                    Console.WriteLine("\nLista de Usuários");
                    foreach (Pessoa pessoa in pessoas) {
                        Console.WriteLine($"ID: {i}\nNome {pessoa.Nome}\nIdade {pessoa.Idade}\nEmail {pessoa.Email}");
                    }
                    break;
                case 3:
                    return;
            }
        }

    }
}
