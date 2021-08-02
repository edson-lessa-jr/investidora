package br.com.investidora.modelo;


public class Investidor {

    private String nome;
    private String cpf;

    public Investidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

}
