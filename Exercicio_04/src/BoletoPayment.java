// Implementação do pagamento via Boleto
import java.util.UUID;
class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Pagamento via Boleto gerado. Código: " + boletoCode);
    }
}