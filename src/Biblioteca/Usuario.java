package Biblioteca;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String apellido;
    private int id;
    private ArrayList<Material> listaMateriales = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<Material> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }   
}
