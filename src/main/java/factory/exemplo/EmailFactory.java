package factory.exemplo;

public class EmailFactory extends FactoryNotificacao {
    @Override
    public void enviarNotificacao(String msg) {
        Email email = new Email();
        email.msg = msg;
        System.out.println("Enviando notificação por meio do Email: " + email.msg);
    }

    @Override
    public Notificacao create() {
        return new Email();
    }
}
