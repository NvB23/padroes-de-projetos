package factory;

public class FactoryNavio extends FactoryTransporte {
    @Override
    public Transporte create() {
        return new Navio();
    }
}
