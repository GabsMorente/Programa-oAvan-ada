// Implementações das estratégias de pagamento
class PixPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Pix realizado. Código: " + Math.random());
    }
}