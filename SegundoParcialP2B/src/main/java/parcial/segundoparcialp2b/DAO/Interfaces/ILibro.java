/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.segundoparcialp2b.DAO.Interfaces;

import parcial.segundoparcialp2b.Modelos.Libro;

/**
 *
 * @author RHINO VS OJITOS
 */
public interface ILibro {
    public boolean agregarLibro(Libro l);
    public boolean eliminarLibro(String titulo);
    public boolean actualizarLibro(String titulo,Libro l);
    public Libro listarLibro(String titulo);
}
