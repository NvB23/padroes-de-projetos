package adapter;

public class Main {

    public static void main(String[] args) {

        EntradaC entradaC = new EntradaC();
        EntradaUSB entradaUSB = new EntradaUSB();

        Conector adaptador = new EntradaAdapter(entradaUSB);

        adaptador.conectar(entradaC);
    }
}