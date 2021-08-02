package br.com.investidora.modelo;

public class TesouroDireto extends ContaInvestimento {

    public TesouroDireto(int numeroConta, int numeroInvestidor, Investidor investidor) {
        super(numeroConta, numeroInvestidor, investidor);
    }

    @Override
    public void adicionarInvestimento(double valor) {
        valor= valor*1.04;
        super.adicionarInvestimento(valor);
    }

    @Override
    public void resgatarInvestimento(double valor) {
        double valorAResgatar = valor * 1.1;
        if (this.getSalvoInvestido() < valorAResgatar) {
            System.out.println("Saldo em custódia: " + this.getSalvoInvestido() + ", Valor a ser resgatado: " + valorAResgatar);
        } else
            this.setReduzirSaldo(valorAResgatar);
    }
}
