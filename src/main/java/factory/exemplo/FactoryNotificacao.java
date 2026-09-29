package factory.exemplo;

public abstract class FactoryNotificacao {
    public abstract void enviarNotificacao(String msg);
    public abstract Notificacao create();
}
