class BoletoPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Boleto gerado. Código: 123456789");
    }
}