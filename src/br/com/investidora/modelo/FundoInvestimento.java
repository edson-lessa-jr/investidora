package br.com.investidora.modelo;

public class FundoInvestimento extends ContaInvestimento {
    public FundoInvestimento(int numeroConta, int numeroInvestidor, Investidor investidor) {
        super(numeroConta, numeroInvestidor, investidor);
    }

    @Override
    public void adicionarInvestimento(double valor) {
        valor = valor*1.06;
        super.adicionarInvestimento(valor);
    }

    @Override
    public void resgatarInvestimento(double valor) {
        double valorAResgatar = valor * 1.35;
        if (this.getSalvoInvestido() < valorAResgatar) {
            System.out.println("Saldo investido: " + this.getSalvoInvestido() + ", Valor a ser resgatado: " + valor);
        } else
            this.setReduzirSaldo(valorAResgatar);
    }
}
