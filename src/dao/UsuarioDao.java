package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Usuario;
import util.ConnectionFactory;

public class UsuarioDao {
    
    public static ArrayList<Usuario> obterUsuario() throws SQLException {
        
        ArrayList<Usuario> usuLista = new ArrayList<>();
        String sql = "SELECT nome, senha FROM usuario";
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery(sql);
        
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
            usuLista.add(usuario);
        }
        return usuLista;
    }
}
