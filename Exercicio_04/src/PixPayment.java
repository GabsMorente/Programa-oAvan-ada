// Implementação do pagamento via Pix
import java.util.Random;
class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random rand = new Random();
        String pixCode = String.valueOf(rand.nextInt(900000) + 100000);
        System.out.println("Pagamento via Pix processado. Código: " + pixCode);
    }
}