/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.segundoparcialp2b.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import parcial.segundoparcialp2b.DAO.Interfaces.IUsuario;
import parcial.segundoparcialp2b.Modelos.Usuario;

/**
 *
 * @author RHINO VS OJITOS
 */
public class IUsuarioImpl implements IUsuario {

    @Override
    public boolean agregarUsuario(Usuario u) {
      BaseDatos base = new BaseDatos();
        try {
            
            String sql = "INSERT INTO usuarios(username,password,nombres,apellidos,edad,direccion) VALUES(?,?,?,?,?,?))";
            PreparedStatement stmt = base.conn.prepareStatement(sql);
            
            stmt.setString(1, u.getUsername());
            stmt.setString(2, u.getPassword());
            stmt.setString(3, u.getNombres());
            stmt.setString(4, u.getApellidos());
            stmt.setInt(5, u.getEdad());
            stmt.setString(6, u.getDireccion());
            System.out.println("stmt");
            stmt.executeUpdate();
            return true; 
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      return false;
    } 

    @Override
    public String eliminarUsuario(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarUsuario(String username, Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario listarUsuario(String Username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(String username, String password) {
        BaseDatos base = new BaseDatos();
        try {
            Statement stmt = base.conn.createStatement();
            String sql = "SELECT * from usuarios where username='"+username+"' and password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                return true; 
            }
        } catch (Exception e) {
        }
    
        return false;
    }
    
}
