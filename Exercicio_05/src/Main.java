
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a escolha da notificação
        System.out.println("Escolha o tipo de notificação (email, SMS, Push): ");
        String opcao = scanner.nextLine();  // Captura a entrada do usuário para o tipo de notificação

        // Solicitar ao usuário a mensagem a ser enviada
        System.out.println("Digite a mensagem que deseja enviar: ");
        String mensagem = scanner.nextLine();  // Captura a entrada do usuário para a mensagem

        Notification notification = null;

        // Usando switch case para criar a notificação com base na opção fornecida
        switch (opcao) {
            case "email":
                notification = new EmailNotification();
                break;
            case "SMS":
                notification = new SMSNotification();
                break;
            case "Push":
                notification = new PushNotification();
                break;
            default:
                System.out.println("Tipo de notificação desconhecido.");
                return;  // Retorna para evitar execução de código quando tipo não for válido
        }

        // Envia a notificação com a mensagem fornecida pelo usuário
        notification.send(mensagem);
    }
}