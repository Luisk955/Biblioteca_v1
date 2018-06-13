package Biblioteca;

public class Material {
    private int signatura = 0;
    private String fechaCompra = "";
    private boolean restringido = false;
    private String tema = "";

    public Material() {
    }
    public Material(int signatura, String fechaCompra, boolean restringido, String tema) {
        this.signatura = signatura; 
        this.fechaCompra = fechaCompra;
        this.restringido = restringido;
        this.tema = tema;
    }

    public int getSignatura() {
        return signatura;
    }

    public void setSignatura(int signatura) {
        this.signatura = signatura;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isRestringido() {
        return restringido;
    }

    public void setRestringido(boolean restringido) {
        this.restringido = restringido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }  
}
