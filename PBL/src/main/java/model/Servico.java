package model;

import java.util.LinkedList;
import java.util.List;

public class Servico {
    private List<OrdemServico> ordensServico;
    private double preco;
    private int id;

    public Servico(double preco) {
        this.preco = preco;

        this.ordensServico = new LinkedList<OrdemServico>();

        this.id = 0;
    }

    public List<OrdemServico> getOrdensServico() {
        return ordensServico;
    }

    public void setOrdensServico(OrdemServico ordemServico) {
        this.ordensServico.add(ordemServico);
    }

    public double getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "ordensServico=" + ordensServico +
                ", preco=" + preco +
                '}';
    }
}
