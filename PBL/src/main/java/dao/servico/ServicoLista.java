package dao.servico;

import model.OrdemServico;
import model.Servico;

import java.util.LinkedList;
import java.util.List;

public class ServicoLista implements ServicoDAO{
    private List<Servico> listaServicos;
    private int id;

    public ServicoLista() {
        this.listaServicos = new LinkedList<Servico>();
        this.id = 0;
    }

    @Override
    public void adicionarNaLista(Servico objeto) {
        objeto.setId(this.id);
        this.id++;

        this.listaServicos.add(objeto);
    }

    @Override
    public Servico buscarPorId(int id) {
        for (Servico servico: this.listaServicos){
            if (servico.getId() == id)
                return servico;
        }

        return null;
    }

    @Override
    public List<Servico> buscarTodos() {
        List<Servico> lista = new LinkedList<Servico>();

        for (Servico servico: this.listaServicos){
            lista.add(servico);
        }

        return lista;
    }

    @Override
    public void atualizar(Servico objeto) {
        for (int i = 0; i < this.listaServicos.size(); i++){
            if (this.listaServicos.get(i).getId() == objeto.getId()){
                this.listaServicos.add(objeto.getId(), objeto);

                return;
            }
        }
    }

    @Override
    public void remover(Servico objeto) {
        for (int i = 0; i < this.listaServicos.size(); i++){
            if (listaServicos.get(i).getId() == objeto.getId()){
                this.listaServicos.remove(objeto);

                return;
            }
        }
    }
}
