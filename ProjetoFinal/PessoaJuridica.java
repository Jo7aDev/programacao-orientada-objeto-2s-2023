package br.com.projeto2.projeto2;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Pessoa Juridica (%d) Cnpj: %s - Nome: %s - Idade: %d", id,cnpj,getNome(),getIdade());
    }
}
