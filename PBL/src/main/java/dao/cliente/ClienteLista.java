package dao.cliente;

import model.Cliente;

import java.util.LinkedList;
import java.util.List;

public class ClienteLista implements ClienteDAO{
    private List<Cliente> listaClientes;
    private int id;

    public ClienteLista() {
        this.listaClientes = new LinkedList<Cliente>();
        this.id = 0;
    }

    @Override
    public void adicionarNaLista(Cliente objeto) {
        objeto.setId(this.id);
        this.id++;

        this.listaClientes.add(objeto);

    }

    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> lista = new LinkedList<Cliente>();

        for (Cliente cliente: this.listaClientes){
            lista.add(cliente);
        }

        return lista;
    }

    @Override
    public List<Cliente> buscarPorNome(String nome) {
        List<Cliente> lista = new LinkedList<Cliente>();

        for (Cliente cliente: listaClientes){
            if (cliente.getNome().equals(nome))
                lista.add(cliente);
        }

        return lista;
    }

    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente cliente: this.listaClientes){
            if (cliente.getId() == id)
                return cliente;
        }

        return null;
    }

    @Override
    public void atualizar(Cliente objeto) {
        for (int i = 0; i < this.listaClientes.size(); i++){
            if (listaClientes.get(i).getId() == objeto.getId()){
                this.listaClientes.add(objeto.getId(), objeto);

                return; // Para parar o laço assim que entrar no if e atualizar a lista
            }
        }
    }

    @Override
    public void remover(Cliente objeto) {
        for (int i = 0; i < this.listaClientes.size(); i++){
            if (listaClientes.get(i).getId() == objeto.getId()){
                this.listaClientes.remove(objeto);

                return;
            }
        }
    }
}
