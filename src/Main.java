public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, "João Silva", 1000.0, 500.0);
        System.out.println("\n--- Testando Conta Corrente ---");
        contaCorrente.exibirInformacoes();
        contaCorrente.sacar(800.0);
        contaCorrente.exibirInformacoes();
        contaCorrente.sacar(600.0);
        contaCorrente.exibirInformacoes();
        contaCorrente.sacar(200.0);
        contaCorrente.exibirInformacoes();

        ContaPoupanca contaPoupanca = new ContaPoupanca(456, "Maria Souza", 1500.0);
        System.out.println("\n--- Testando Conta Poupança ---");
        contaPoupanca.exibirInformacoes();
        contaPoupanca.sacar(500.0);
        contaPoupanca.exibirInformacoes();
        contaPoupanca.sacar(1200.0);
        contaPoupanca.exibirInformacoes();

        ContaInvestimentos contaInvestimentos = new ContaInvestimentos(789, "Carlos Oliveira", 2000.0);
        System.out.println("\n--- Testando Conta Investimentos ---");
        contaInvestimentos.exibirInformacoes();
        contaInvestimentos.sacar(500.0);
        contaInvestimentos.exibirInformacoes();
        contaInvestimentos.sacar(1600.0);
        contaInvestimentos.exibirInformacoes();

        ContaSalario contaSalario = new ContaSalario(101, "Ana Costa", 3000.0, 1000.0);
        System.out.println("\n--- Testando Conta Salário ---");
        contaSalario.exibirInformacoes();
        contaSalario.sacar(500.0);
        contaSalario.exibirInformacoes();
        contaSalario.sacar(200.0);
        contaSalario.exibirInformacoes();

        ContaInvestimentoAltoRisco contaAltoRisco = new ContaInvestimentoAltoRisco(202, "Pedro Santos", 15000.0);
        System.out.println("\n--- Testando Conta Investimento de Alto Risco ---");
        contaAltoRisco.exibirInformacoes();
        contaAltoRisco.sacar(5000.0);
        contaAltoRisco.exibirInformacoes();
        contaAltoRisco.sacar(11000.0);
        contaAltoRisco.exibirInformacoes();
    }

}