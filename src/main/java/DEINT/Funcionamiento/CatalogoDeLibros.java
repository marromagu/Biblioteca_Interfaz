/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEINT.Funcionamiento;

import java.util.HashMap;

/**
 *
 * @author mario
 */
public class CatalogoDeLibros {

    private HashMap<Integer, Libro> catalogoHashMap = new HashMap<>();

    public CatalogoDeLibros() {
        catalogoHashMap = new HashMap<>();
        generarYAgregarLibros();
    }

    public void devolverLibro(int nLibro) {
        catalogoHashMap.get(nLibro).setEstado(true);
    }

    public Libro getLibro(int nLibro) {
        return catalogoHashMap.get(nLibro);
    }

    public HashMap<Integer, Libro> getCatalogoHashMap() {
        return catalogoHashMap;
    }

    public void setCatalogoHashMap(HashMap<Integer, Libro> catalogoHashMap) {
        this.catalogoHashMap = catalogoHashMap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogo{");
        sb.append("catalogoHashMap=").append(catalogoHashMap);
        sb.append('}');
        return sb.toString();
    }

    // Método para generar y agregar 10 libros al HashMap
    public void generarYAgregarLibros() {
        for (int i = 1; i <= 10; i++) {
            Libro libro = generarLibro(i);
            catalogoHashMap.put(i, libro);
        }
    }

    // Método para generar un libro con datos ficticios
    private Libro generarLibro(int id) {
        String titulo = "Libro " + id;
        String autor = "Autor " + id;
        String materia = "Materia " + id;
        boolean estado = true;

        return new Libro(titulo, autor, materia, estado);
    }

}
