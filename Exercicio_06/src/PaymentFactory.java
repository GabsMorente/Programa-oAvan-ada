class PaymentFactory {
    public static PaymentStrategy createPayment(PaymentType type) {
        switch (type) {
            case PIX:
                return new PixPayment();
            case CREDIT_CARD:
                return new CreditCardPayment();
            case BOLETO:
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Método de pagamento inválido");
        }
    }
}