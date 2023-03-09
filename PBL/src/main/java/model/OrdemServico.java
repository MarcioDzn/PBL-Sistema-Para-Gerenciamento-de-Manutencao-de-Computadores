package model;


import java.util.Date;
import java.util.List;

public class OrdemServico {
    private Cliente cliente;
    private Tecnico tecnico;
    private List<Servico> servicos;
    private String status;
    private String descricao;
    private long iniciadoEm;
    private long finalizadoEm;

    private static Date tempo;

    public OrdemServico(Cliente cliente) {
        this.cliente = cliente;
        this.tecnico = null;

        this.status = "Em Andamento";

        // Ver se é aqui mesmo o tempo
        tempo = new Date();
        this.iniciadoEm = tempo.getTime();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(Servico servico) {
        this.servicos.add(servico);
    }

    public String getDescricao() {
        String descricao = "";
        for (Servico servico: this.servicos)
            descricao += " + " + servico;

        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getIniciadoEm() {
        return iniciadoEm;
    }

    public void finalizar(){
        this.status = "Finalizado";
    }

    public void cancelar(){
        this.status = "Cancelado";
    }

    public double getPreco(){
        double precoTotal = 0;
        for (Servico servico: this.servicos)
            precoTotal += servico.getPreco();

        return precoTotal;
    }

    public boolean isFinalizado(){
        if (this.status.equals("Finalizado"))
            return true;
        return false;
    }

    public boolean isEmAndamento(){
        if (this.status.equals("Em Andamento"))
            return true;
        return false;
    }

    public boolean isCancelado(){
        if (this.status.equals("Cancelado"))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "cliente=" + cliente +
                ", tecnico=" + tecnico +
                ", servicos=" + servicos +
                ", status='" + status + '\'' +
                ", descricao='" + descricao + '\'' +
                ", iniciadoEm=" + iniciadoEm +
                ", finalizadoEm=" + finalizadoEm +
                '}';
    }
}
