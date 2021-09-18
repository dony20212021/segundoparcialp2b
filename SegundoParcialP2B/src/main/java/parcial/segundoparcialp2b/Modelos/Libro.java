/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.segundoparcialp2b.Modelos;

/**
 *
 * @author RHINO VS OJITOS
 */
public class Libro {
    String titulo;
    String editorial;
    int paginas;
    String genero;

    public Libro(String titulo, String editorial, int paginas, String genero) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
        this.genero = genero;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
