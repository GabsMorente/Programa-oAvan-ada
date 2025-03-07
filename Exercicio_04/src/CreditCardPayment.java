// Implementação do pagamento via Cartão de Crédito
import java.util.Scanner;
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito (fictício): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " realizado com sucesso no cartão " + cardNumber);
    }
}