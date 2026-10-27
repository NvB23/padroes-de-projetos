package adapter;

public class EntradaUSB extends Entrada {

    public EntradaUSB() {
        super.nome = "Entrada USB";
    }

    public void conectarUSB() {
        System.out.println("Conectado na Entrada USB");
    }
}