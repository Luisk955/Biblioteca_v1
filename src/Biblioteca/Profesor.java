package Biblioteca;

public class Profesor extends Usuario{
    private String tipoContrato;
    private String fechaContratacion;

    public Profesor() {
        super();
    }

    public Profesor(String tipoContrato, String fechaContratacion, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }   

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Profesor: Id: " + getId() + " Nombre: " + getNombre() + " Apellido: " + getApellido()+ " Tipo de contrato:" + tipoContrato + " Fecha de contratacion: " + fechaContratacion;
    }
    
}
