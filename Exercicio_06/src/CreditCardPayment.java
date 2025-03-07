class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Cartão de Crédito confirmado.");
    }
}