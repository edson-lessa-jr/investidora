package br.com.investidora.modelo;


public class ContaInvestimento {

    private int numeroConta;
    private int numeroInvestidor;
    private Investidor investidor;
    private double salvoInvestido;


    public ContaInvestimento(int numeroConta, int numeroInvestidor, Investidor investidor) {
        this.setNumeroConta(numeroConta);
        this.setNumeroInvestidor(numeroInvestidor);
        this.investidor = investidor;
        this.salvoInvestido = 0;
    }

    public void adicionarInvestimento(double valor) {
        this.setAdicionaSaldo(valor);
    }

    public void resgatarInvestimento(double valor){
        this.setReduzirSaldo(valor);
    }

    public void transfereInvestimento(double valor, ContaInvestimento destino) {
        this.resgatarInvestimento(valor);
        destino.adicionarInvestimento(valor);
    }

    protected void setReduzirSaldo(double valor) {
        this.salvoInvestido -= valor;
    }

    protected void setAdicionaSaldo(double saldo) {
        this.salvoInvestido += saldo;
    }

    public double getSalvoInvestido() {
        return this.salvoInvestido;
    }

    public int getNumeroInvestidor() {
        return this.numeroInvestidor;
    }

    public void setNumeroInvestidor(int numeroInvestidor) {
        if (numeroInvestidor <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
        } else {
            this.numeroInvestidor = numeroInvestidor;
        }
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numeroConta = numeroConta;
    }

    public Investidor getSetor() {
        return this.investidor;
    }


}