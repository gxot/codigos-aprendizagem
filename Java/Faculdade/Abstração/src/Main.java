abstract class Personagem {
    boolean vivo;
    float posicao_x;
    float posicao_y;
    float posicao_z;
    int cor;
    SuperHeroi heroi;

    public Personagem() {
        this.vivo = true;
        this.posicao_x = 0;
        this.posicao_y = 0;
        this.posicao_z = 0;
        this.cor = 0;
    }

    public abstract void correr(float x, float y);
    public abstract void saltar(float z);
    public abstract void atirar();
    public abstract void morrer();
    public abstract void camuflar(int cor);
    public abstract void personificar(SuperHeroi h);
}

class SuperHeroi extends Personagem {

    @Override
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("SuperHeroi correndo ...");
    }

    @Override
    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("SuperHeroi saltando ...");
    }

    @Override
    public void atirar() {
        System.out.println("SuperHeroi atirando ...");
    }

    @Override
    public void morrer() {
        this.vivo = false;
        System.out.println("Morto");
    }

    @Override
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("SuperHeroi camuflando ...");
    }

    @Override
    public void personificar(SuperHeroi h) {
        this.heroi = h;
        System.out.println("Personificando");
    }
}

class Batman extends Personagem {

    @Override
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Batman correndo ...");
    }

    @Override
    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Batman saltando ...");
    }

    @Override
    public void atirar() {
        System.out.println("Batman atirando ...");
    }

    @Override
    public void morrer() {
        this.vivo = false;
        System.out.println("Morto");
    }

    @Override
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Batman camuflando ...");
    }

    @Override
    public void personificar(SuperHeroi h) {
        this.heroi = h;
        System.out.println("Personificando");
    }
}

public class Main {
    public static void main(String[] args) {
        SuperHeroi superHeroi = new SuperHeroi();
        Batman batman = new Batman();

        superHeroi.correr(10, 20);
        superHeroi.saltar(5);
        superHeroi.atirar();
        superHeroi.morrer();
        superHeroi.camuflar(1);
        superHeroi.personificar(superHeroi);

        System.out.println("------------");

        batman.correr(15, 25);
        batman.saltar(10);
        batman.atirar();
        batman.morrer();
        batman.camuflar(2);
        batman.personificar(superHeroi);
    }
}
