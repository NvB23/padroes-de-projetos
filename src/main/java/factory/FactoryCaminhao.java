package factory;

public class FactoryCaminhao extends FactoryTransporte {
    @Override
    public Transporte create() {
        return new Caminhao();
    }
}
