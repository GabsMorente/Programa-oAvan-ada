public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Conta: Poupança");
    }
}
