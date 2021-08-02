package br.com.investidora;

import br.com.investidora.modelo.Investidor;
import br.com.investidora.modelo.FundoInvestimento;
import br.com.investidora.modelo.TesouroDireto;

public class Principal {

    public static void main(String[] args) {
        Investidor investidor = new Investidor("José", "010101010101");

        TesouroDireto tesouroDireto = new TesouroDireto(111, 111, investidor);
        tesouroDireto.adicionarInvestimento(1000.0);

        FundoInvestimento fundoInvestimento = new FundoInvestimento(300, 111, investidor);
        fundoInvestimento.adicionarInvestimento(1000.0);

        exibirDados(tesouroDireto, fundoInvestimento);

        System.out.println("Transferir R$ 100,00 do Tesouro Direto (desconta 10% do resgate) para Fundo de investimento (adiciona 6% no investimento)");
        tesouroDireto.transfereInvestimento(100.0, fundoInvestimento);
        exibirDados(tesouroDireto, fundoInvestimento);
    }

    private static void exibirDados(TesouroDireto tesouroDireto, FundoInvestimento fundoInvestimento) {
        System.out.println("Tesouro direto: \n" +
                "Nome: " + tesouroDireto.getSetor().getNome() + "\n" +
                "CPF: " + tesouroDireto.getSetor().getCpf() + "\n" +
                "Número da Conta: " + tesouroDireto.getNumeroConta() + "\n" +
                "Número do Investidor: " + tesouroDireto.getNumeroInvestidor() + "\n" +
                "Saldo em Custódia " + tesouroDireto.getSalvoInvestido() + "\n" +
                "");
        System.out.println("Fundo de Investimento: \n" +
                "Nome: " + fundoInvestimento.getSetor().getNome() + "\n" +
                "CPF: " + fundoInvestimento.getSetor().getCpf() + "\n" +
                "Número da Conta: " + fundoInvestimento.getNumeroConta() + "\n" +
                "Número do Investidor: " + fundoInvestimento.getNumeroInvestidor() + "\n" +
                "Saldo em Custódia " + fundoInvestimento.getSalvoInvestido() + "\n" +
                "");
    }

}
