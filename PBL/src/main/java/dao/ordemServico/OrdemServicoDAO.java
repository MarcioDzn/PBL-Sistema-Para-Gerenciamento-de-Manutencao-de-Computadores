package dao.ordemServico;

import dao.CRUD;
import model.OrdemServico;

import java.util.List;

public interface OrdemServicoDAO extends CRUD<OrdemServico> {
    public List<OrdemServico> buscarPorNomeCliente(String nome);
}
