/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

import javax.swing.ImageIcon;

/**
 *
 * @author mario
 */
public class Libro {
    private String titulo;
    private String autor;
    private String materia;
    private boolean estado;//Disponible true en presatmo false
    private ImageIcon Portada;

    public Libro(String titulo, String autor, String materia, boolean estado, ImageIcon Portada) {
        this.titulo = titulo;
        this.autor = autor;
        this.materia = materia;
        this.estado = estado;
        this.Portada = Portada;
    }

  
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", materia=").append(materia);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    public ImageIcon getPortada() {
        return Portada;
    }

    public void setPortada(ImageIcon Portada) {
        this.Portada = Portada;
    }
    
}
