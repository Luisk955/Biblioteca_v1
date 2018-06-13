package Biblioteca;

public class Administrativo extends Usuario{
    private String tipoNombramiento;
    private int cantidadHoras;

    public Administrativo() {
        super();
    }

    public Administrativo(String tipoNombramiento, int cantidadHoras, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.tipoNombramiento = tipoNombramiento;
        this.cantidadHoras = cantidadHoras;
    }

    public String getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void setTipoNombramiento(String tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    @Override
    public String toString() {
        return "Administrativo: Id: " + getId() + " Apellido: " + getApellido() + " Nombre: " + getNombre() + " Tipo de nombramiento: " + tipoNombramiento + " Cantidad de horas: " + cantidadHoras;
    }
    
}
