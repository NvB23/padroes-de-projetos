package factory.exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção para envio de notificação: ");
        System.out.println("1 - Push;");
        System.out.println("2 - SMS;");
        System.out.println("3 - Email;");
        System.out.print(">>> ");
        int opcao = scanner.nextInt();

        FactoryNotificacao factoryNotificacao;
        if (opcao == 1) {
            factoryNotificacao = new PushFactory();
            factoryNotificacao.enviarNotificacao("Opa!!!");
        }
        else if (opcao == 2) {
            factoryNotificacao = new SMSFactory();
            factoryNotificacao.enviarNotificacao("Opa!!!");
        }
        else if (opcao == 3) {
            factoryNotificacao = new EmailFactory();
            factoryNotificacao.enviarNotificacao("Opa!!!");
        }
    }
}
