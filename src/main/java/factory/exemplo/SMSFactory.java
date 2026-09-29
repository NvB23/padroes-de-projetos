package factory.exemplo;

public class SMSFactory extends FactoryNotificacao {
    @Override
    public void enviarNotificacao(String msg) {
        SMS sms = new SMS();
        sms.msg = msg;
        System.out.println("Enviando notificação por meio do SMS: " + sms.msg);
    }

    @Override
    public Notificacao create() {
        return new SMS();
    }
}
