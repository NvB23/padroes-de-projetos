package factory;

public class Main {
    public static void main(String[] args) {
        FactoryTransporte caminhaoFactory = new FactoryCaminhao();
        FactoryTransporte navioFactory = new FactoryNavio();

        Transporte caminhao = caminhaoFactory.create();
        Transporte navio = navioFactory.create();
    }
}
