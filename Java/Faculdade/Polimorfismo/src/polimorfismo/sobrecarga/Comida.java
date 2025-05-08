package polimorfismo.sobrecarga;

class Pizza {
    private String sabor;

    public Pizza(String sabor) {
        this.sabor = sabor;
    }

    public void mostrarMensagem() {
        System.out.printf("Pizza de sabor %s\n", sabor);
    }
}

class Carne {
    private String tipo;

    public Carne(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarMensagem() {
        System.out.printf("Carne tipo %s\n", tipo);
    }
}

class Pao {
    private String tipo;

    public Pao(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarMensagem() {
        System.out.printf("Pão tipo %s\n", tipo);
    }
}

public class Comida {
    public static void main(String[] args) {
        Carne carne1 = new Carne("Mignon");
        Carne carne2 = new Carne("Picanha");
        Pizza pizza1 = new Pizza("Quatro queijos");
        Pizza pizza2 = new Pizza("Margherita");
        Pao pao1 = new Pao("Queijo");
        Pao pao2 = new Pao("Francês");

        assar(pizza1);
        assar(pizza2);
        assar(carne1);
        assar(carne2);
        assar(pao1);
        assar(pao2);
    }

    public static void assar(Pizza pizza) {
        System.out.println("Assando pizza");
        pizza.mostrarMensagem();
    }

    public static void assar(Carne carne) {
        System.out.println("Assando carne");
        carne.mostrarMensagem();
    }

    public static void assar(Pao pao) {
        System.out.println("Assando pão");
        pao.mostrarMensagem();
    }
}

