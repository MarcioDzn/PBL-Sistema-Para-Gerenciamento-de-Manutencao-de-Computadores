package dao.ordemServico;

import dao.DAO;
import model.Cliente;
import model.OrdemServico;

import java.util.LinkedList;
import java.util.List;

public class OrdemServicoLista implements OrdemServicoDAO{

    private List<OrdemServico> listaOrdens;
    private int id;

    public OrdemServicoLista() {
        this.listaOrdens = new LinkedList<OrdemServico>();
        this.id = 0;
    }

    @Override
    public void adicionarNaLista(OrdemServico objeto) {
        objeto.setId(this.id);
        this.id++;

        this.listaOrdens.add(objeto);
    }

    @Override
    public OrdemServico buscarPorId(int id) {
        for (OrdemServico ordem: this.listaOrdens){
            if (ordem.getId() == id)
                return ordem;
        }

        return null;
    }

    @Override
    public List<OrdemServico> buscarTodos() {
        List<OrdemServico> lista = new LinkedList<OrdemServico>();

        for (OrdemServico ordem: this.listaOrdens){
            lista.add(ordem);
        }

        return lista;
    }

    @Override
    public void atualizar(OrdemServico objeto) {
        for (int i = 0; i < this.listaOrdens.size(); i++){
            if (listaOrdens.get(i).getId() == objeto.getId()){
                this.listaOrdens.add(objeto.getId(), objeto);

                return;
            }
        }
    }

    @Override
    public void remover(OrdemServico objeto) {
        for (int i = 0; i < this.listaOrdens.size(); i++){
            if (listaOrdens.get(i).getId() == objeto.getId()){
                this.listaOrdens.remove(objeto);

                return;
            }
        }
    }

    @Override
    public List<OrdemServico> buscarPorNomeCliente(String nome) {
        List<OrdemServico> lista = new LinkedList<OrdemServico>();

        for (Cliente listaCliente: DAO.getCliente().buscarPorNome(nome)){
            for (OrdemServico ordem: listaCliente.getOrdensServico()){
                lista.add(ordem);
            }
        }

        return lista;
    }
}
