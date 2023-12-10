/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Usuario {

    private int nLector;
    private String nombre;
    private ArrayList<Libro> prestamos;
    private boolean estado;

    public Usuario(int nLector, String nombre, ArrayList<Libro> prestamos, boolean estado) {
        this.nLector = nLector;
        this.nombre = nombre;
        this.prestamos = prestamos;
        this.estado = estado;
    }

    public int getnLector() {
        return nLector;
    }

    public void setnLector(int nLector) {
        this.nLector = nLector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Libro prestamos) {
        this.prestamos.add(prestamos);
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
        sb.append("Usuario{");
        sb.append("nLector=").append(nLector);
        sb.append(", nombre=").append(nombre);
        sb.append(", prestamos=").append(prestamos);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

}
