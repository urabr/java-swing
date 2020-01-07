
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import util.ConnectionFactory;


public class ClienteDao extends Dao<Cliente> {

    @Override
    public boolean incluir(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;
        String sql = "insert into cliente "
                + "(codigo, nome, cpf, sexo, nascimento, telefone) "
                + "values (null, ?, ?, ?, ?, ?)";
        try { 
            Connection conn = this.obterConexao();
            try {
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setString(3, cliente.getSexo());
                ps.setDate(4, cliente.getNascimento());
                ps.setString(5, cliente.getTelefone());
                
                ps.executeUpdate();
            } finally {
                try {
                    ConnectionFactory.closeConnection(conn, ps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
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
