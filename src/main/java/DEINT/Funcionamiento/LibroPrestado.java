/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

import com.itextpdf.text.Image;

/**
 *
 * @author mario
 */
public class LibroPrestado {

    private String usuario;
    private String libroPrestado;
    private String tituloLibro;
    private String autor;
    private String materia;
   // private Image imagenQR;

    public LibroPrestado(String Usuario, String libroPrestado, String tituloLibro, String autor, String materia) {
        this.usuario = Usuario;
        this.libroPrestado = libroPrestado;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.materia = materia;
        //this.imagenQR = imagenQR;
    }

//    public Image getImagenQR() {
//        return imagenQR;
//    }

    public String getUsuario() {
        return usuario;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "LibroPrestado{" + "Usuario=" + usuario + ", libroPrestado=" + libroPrestado + ", tituloLibro=" + tituloLibro + ", autor=" + autor + ", materia=" + materia + '}';
    }

}
