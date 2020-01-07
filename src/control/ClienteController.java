package control;

import dao.ClienteDao;
import dao.Dao;
import java.sql.SQLException;
import model.Cliente;

public class ClienteController extends Dao<Cliente> {

    @Override
    public boolean incluir(Cliente cliente) throws SQLException {
        boolean resultado = false;
        
        ClienteDao clienteDao = new ClienteDao();
        
        if (clienteDao.incluir(cliente))
            return false;
        
        return resultado;
    }

    @Override
    public boolean editar(Cliente cliente) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean excluir(Cliente cliente) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer procurar(Cliente cliente) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
