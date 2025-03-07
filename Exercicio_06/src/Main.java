// Classe principal com interação via terminal
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");

        int escolha = scanner.nextInt();
        System.out.println("Digite o valor do pagamento:");
        double valor = scanner.nextDouble();

        PaymentType type;
        switch (escolha) {
            case 1: type = PaymentType.PIX; break;
            case 2: type = PaymentType.CREDIT_CARD; break;
            case 3: type = PaymentType.BOLETO; break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        PaymentStrategy strategy = PaymentFactory.createPayment(type);
        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(valor);

        scanner.close();
    }
}