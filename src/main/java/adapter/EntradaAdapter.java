package adapter;

public class EntradaAdapter extends Conector {

    private final EntradaUSB entradaUSB;

    public EntradaAdapter(EntradaUSB entradaUSB) {
        this.entradaUSB = entradaUSB;
    }

    @Override
    public void conectar(Entrada entrada) {
        if (entrada instanceof EntradaC) {
            System.out.println("Adaptando Entrada C para Entrada USB");
            entradaUSB.conectarUSB();
        } else {
            throw new IllegalArgumentException("Entrada incompatível");
        }
    }
}