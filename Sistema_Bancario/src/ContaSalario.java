public class ContaSalario extends ContaCorrente {
    private int quantSaques = 0;

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
    }

    @Override
    public void sacar(double valor) {
        if (quantSaques == 0) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            quantSaques++;
        } else {
            saldo -= (valor + 5);
            System.out.println("Saque realizado com taxa de R$ 5,00: " + valor);
            quantSaques++;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Conta: Salário");
    }
}