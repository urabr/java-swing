
package control;

import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class LoginController {
    
    public ArrayList<Usuario> obterLogin() throws SQLException, ClassNotFoundException {
        return UsuarioDao.obterUsuario();
    }
}
