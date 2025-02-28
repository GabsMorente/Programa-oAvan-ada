
public class ContaInvestimentoAltoRisco extends ContaInvestimentos {
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05;
        if (saldo >= valor + taxa && saldo > 10000) {
            saldo -= (valor + taxa);
            System.out.println("Saque realizado com taxa de 5%: " + valor);
        } else {
            System.out.println("Saldo insuficiente ou abaixo do mínimo exigido.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Conta: Investimento de Alto Risco");
    }
}


