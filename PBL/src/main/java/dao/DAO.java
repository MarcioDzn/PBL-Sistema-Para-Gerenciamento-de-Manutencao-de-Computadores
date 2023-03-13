package dao;

import dao.cliente.ClienteDAO;
import dao.cliente.ClienteLista;
import dao.ordemServico.OrdemServicoDAO;
import dao.ordemServico.OrdemServicoLista;

public class DAO {
    private static ClienteDAO clienteDAO;

    private static OrdemServicoDAO ordemServicoDAO;

    public static ClienteDAO getCliente(){
        if(clienteDAO == null){
            clienteDAO = new ClienteLista();
        }

        return clienteDAO;
    }

    public static OrdemServicoDAO getOrdemServico(){
        if (ordemServicoDAO == null){
            ordemServicoDAO = new OrdemServicoLista();
        }

        return ordemServicoDAO;
    }
}
