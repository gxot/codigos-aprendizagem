class Cliente {
    private String nome;
    private double saldo;

    Cliente(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    void retirar(double valor) {
        if (valor > 0 && saldo >= valor) saldo -= valor;
    }

    void imprimirDados() {
        System.out.printf("Nome: %s\nSaldo: R$%.2f\n", nome, saldo);
    }
}

public class Banco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucia Martins", 1500);
        Cliente c2 = new Cliente("Carla Maria", 1700);
        Cliente c3 = new Cliente("Sabrina Silva", 1900);

        c1.imprimirDados();
        c2.imprimirDados();
        c3.imprimirDados();

        c1.retirar(1000);
        c1.imprimirDados();

        c2.retirar(2000);
        c2.depositar(500);
        c2.imprimirDados();

        c3.depositar(1000);
        c3.imprimirDados();
    }
}
