package dao;

import java.sql.Connection;
import java.sql.SQLException;
import util.ConnectionFactory;

public abstract class Dao<Entidade> {
    
    protected Connection obterConexao() {
        return ConnectionFactory.getConnection();
    }
    
    public abstract boolean incluir(Entidade entidade) throws SQLException;
    public abstract boolean editar(Entidade entidade) throws SQLException;
    public abstract boolean excluir(Entidade entidade) throws SQLException;
    public abstract Integer procurar(Entidade entidade) throws SQLException;
    
}
