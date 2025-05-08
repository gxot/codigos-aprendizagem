import java.util.HashMap;
import java.util.Map;

class Banco {
    private Map<Integer, Conta> contas = new HashMap<>();

    public void criar_conta(int numeroConta, String senha, double saldo) {
        contas.put(numeroConta, new Conta(senha, saldo));
    }

    public void sacar(int numeroConta, String senha, double valor) throws ExcecaoContaInvalida, ExcecaoSenhaInvalida, ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido {
        Conta conta = contas.get(numeroConta);

        if (conta == null) {
            throw new ExcecaoContaInvalida();
        }

        if (!conta.senha.equals(senha)) {
            throw new ExcecaoSenhaInvalida();
        }

        if (conta.saldo < valor) {
            throw new ExcecaoSaldoInsuficiente();
        }

        if (!validarHorario()) {
            throw new ExcecaoHorarioInvalido();
        }

        conta.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado. Saldo: " + conta.saldo);
    }

    private boolean validarHorario() {
        int horaAtual = java.time.LocalTime.now().getHour();
        return horaAtual >= 6 && horaAtual <= 18;
    }
}

class Conta {
    String senha;
    double saldo;

    public Conta(String senha, double saldo) {
        this.senha = senha;
        this.saldo = saldo;
    }
}

class ExcecaoContaInvalida extends Exception {
    public ExcecaoContaInvalida() {
        super("Conta inválida");
    }
}

class ExcecaoSenhaInvalida extends Exception {
    public ExcecaoSenhaInvalida() {
        super("Senha inválida");
    }
}

class ExcecaoSaldoInsuficiente extends Exception {
    public ExcecaoSaldoInsuficiente() {
        super("Saldo insuficiente");
    }
}

class ExcecaoHorarioInvalido extends Exception {
    public ExcecaoHorarioInvalido() {
        super("Saque permitido apenas entre 6h e 18h");
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.criar_conta(12345, "senha123", 1000.00);
        banco.criar_conta(67890, "senha456", 500.00);

        try {
            banco.sacar(12345, "senha123", 200.00);
        } catch (ExcecaoContaInvalida | ExcecaoSenhaInvalida | ExcecaoSaldoInsuficiente | ExcecaoHorarioInvalido e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.sacar(12345, "senha1234", 200.00);
        } catch (ExcecaoContaInvalida | ExcecaoSenhaInvalida | ExcecaoSaldoInsuficiente | ExcecaoHorarioInvalido e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.sacar(67890, "senha456", 600.00);
        } catch (ExcecaoContaInvalida | ExcecaoSenhaInvalida | ExcecaoSaldoInsuficiente | ExcecaoHorarioInvalido e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.sacar(99999, "senha123", 100.00);
        } catch (ExcecaoContaInvalida | ExcecaoSenhaInvalida | ExcecaoSaldoInsuficiente | ExcecaoHorarioInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}
