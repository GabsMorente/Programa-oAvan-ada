public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente. Limite de cheque especial excedido.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite de Cheque Especial: " + limiteChequeEspecial);
    }
}
