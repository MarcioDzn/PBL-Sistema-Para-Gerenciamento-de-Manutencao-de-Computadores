package model;

public class Tecnico extends Pessoa{
    private OrdemServico ordemServico;

    public Tecnico(String nome, String email) {
        super(nome, email);

        this.ordemServico = null;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public void atualizarStatusOrdemServico(String status){

    }


}
