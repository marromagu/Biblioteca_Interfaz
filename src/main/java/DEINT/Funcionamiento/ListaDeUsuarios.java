/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

/**
 *
 * @author mario
 */
import java.util.ArrayList;

public class ListaDeUsuarios {

    private ArrayList<Usuario> listaUsuarios;

    public ListaDeUsuarios() {
        listaUsuarios = new ArrayList<>();
        agregarUsuarios();
    }

    // Método para agregar 5 usuarios ficticios a la biblioteca
    public void agregarUsuarios() {
        for (int i = 1; i <= 5; i++) {
            Usuario usuario = generarUsuario(i);
            listaUsuarios.add(usuario);
        }
    }
    public void añadirPrestamo(int nLector, Libro libro){
        listaUsuarios.get(nLector).setPrestamos(libro);
        libro.setEstado(false);
    }

    // Método para generar un usuario con datos ficticios
    private Usuario generarUsuario(int nLector) {
        String nombre = "Usuario" + nLector;
        ArrayList<Libro> prestamos = new ArrayList<>(); // ListaDeUsuarios de préstamos inicialmente vacía
        boolean estado = true; // Puedes ajustar el estado según tus necesidades

        return new Usuario(nLector, nombre, prestamos, estado);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
