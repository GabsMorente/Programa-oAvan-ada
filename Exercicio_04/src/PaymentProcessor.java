// Classe que processa os pagamentos
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount) {
        paymentStrategy.processPayment(amount);
    }
}