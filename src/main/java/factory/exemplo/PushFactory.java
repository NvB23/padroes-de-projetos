package factory.exemplo;

public class PushFactory extends FactoryNotificacao {
    public void enviarNotificacao(String msg) {
        Push push = new Push();
        push.msg = msg;
        System.out.println("Enviando notificação por meio do Push: " + push.msg);
    }
    @Override
    public Notificacao create() {
        return new Push();
    }
}
