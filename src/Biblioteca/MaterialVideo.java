package Biblioteca;

public class MaterialVideo extends Material{
    private String formato;
    private int duracion;
    private String idioma;
    private String director;

    public MaterialVideo() {
        super();
    }

    public MaterialVideo(String formato, int duracion, String idioma, String director) {
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
        this.director = director;
    }

    public MaterialVideo(String formato, int duracion, String idioma, String director, int signatura, String fechaCompra, boolean restringido, String tema) {
        super(signatura, fechaCompra, restringido, tema);
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
        this.director = director;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Material de video: Signatura: " + getSignatura() + " Fecha de compra: " + getFechaCompra() + " Restringido: " + isRestringido() + " Tema: " + getTema()+ " Formato: " + formato + " Duración: " + duracion + " Idioma: " + idioma + " Director: " + director;
    }
    
}
