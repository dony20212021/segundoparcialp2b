 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.segundoparcialp2b.DAO.Interfaces;

import parcial.segundoparcialp2b.Modelos.Usuario;

/**
 *
 * @author RHINO VS OJITOS
 */
public interface IUsuario {
    public boolean agregarUsuario(Usuario u);
    public String eliminarUsuario(String username);
    public boolean actualizarUsuario(String username, Usuario u);
    public Usuario listarUsuario(String Username);
    public boolean validarUsuario(String username, String password);
}
