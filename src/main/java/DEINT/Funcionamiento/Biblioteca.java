/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author mario
 */
public class Biblioteca {

    private HashMap<Integer, Libro> catalogoHashMap = new HashMap<>();
    private HashMap<Integer, Usuario> usuariosHashMap = new HashMap<>();
    private static Biblioteca miBiblioteca = null;

    public static Biblioteca getBiblioteca() {
        if (miBiblioteca == null) {
            miBiblioteca = new Biblioteca();
        }
        return miBiblioteca;
    }

    private Biblioteca() {
        agregarLibro();
        agregarUsuarios();
    }

    public boolean añadirPrestamo(int idUsuario, int idLibro) {
        if (catalogoHashMap.get(idLibro).isEstado()) {
            usuariosHashMap.get(idUsuario).setPrestamos(catalogoHashMap.get(idLibro));
            catalogoHashMap.get(idLibro).setEstado(false);
            return true;
        }
        return false;
    }

    public boolean devolucionLibro(int id) {
        if (!catalogoHashMap.get(id).isEstado()) {
            catalogoHashMap.get(id).setEstado(true);
            return true;
        }
        return false;

    }

    public void agregarUsuarios() {
        for (int i = 1; i <= 5; i++) {
            Usuario usuario = generarUsuario(i);
            usuariosHashMap.put(i, usuario);
        }
    }

    private Usuario generarUsuario(int id) {
        String nombre = "Usuario" + id;
        ArrayList<Libro> prestamos = new ArrayList<>();
        boolean estado = true;

        return new Usuario(id, nombre, prestamos, estado);
    }

    public void agregarLibro() {
        for (int i = 0; i < 10; i++) {
            Libro libro = generarLibro(i);
            catalogoHashMap.put(i, libro);
        }
    }

    public Libro generarLibro(int id) {
        String titulo = "Libro " + id;
        String autor = "Autor " + id;
        String materia = "Materia " + id;
        ImageIcon img = new ImageIcon("libro_1.png");
        boolean estado = true;

        return new Libro(titulo, autor, materia, estado, img);
    }

    public HashMap<Integer, Libro> getCatalogoHashMap() {
        return catalogoHashMap;
    }

    public void setCatalogoHashMap(HashMap<Integer, Libro> catalogoHashMap) {
        this.catalogoHashMap = catalogoHashMap;
    }

    public HashMap<Integer, Usuario> getUsuariosHashMap() {
        return usuariosHashMap;
    }

    public void setUsuariosHashMap(HashMap<Integer, Usuario> usuariosHashMap) {
        this.usuariosHashMap = usuariosHashMap;
    }

}
