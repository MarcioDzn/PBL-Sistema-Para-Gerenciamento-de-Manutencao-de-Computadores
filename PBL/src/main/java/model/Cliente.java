package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente extends Pessoa{
    private String endereco;
    private String telefone;
    private String cpf;

    private List<OrdemServico> ordensServico;

    public Cliente(String nome, String email, String endereco, String telefone, String cpf){
        super(nome, email);
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;

        this.ordensServico = new LinkedList<OrdemServico>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<OrdemServico> getOrdensServico() {
        return ordensServico;
    }

    public void setOrdensServico(OrdemServico ordemServico) {
        this.ordensServico.add(ordemServico);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", ordensServico=" + ordensServico +
                '}';
    }
}
