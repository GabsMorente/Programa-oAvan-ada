public class ContaInvestimentos extends ContaBancaria {
    public ContaInvestimentos(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        if (saldo >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.println("Saque realizado com taxa de 2%: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Conta: Investimento");
    }
}
