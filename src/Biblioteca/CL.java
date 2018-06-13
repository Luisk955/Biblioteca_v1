/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class CL {

    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Profesor> profesores = new ArrayList<>();
    ArrayList<Administrativo> administrativos = new ArrayList<>();
    ArrayList<MaterialTexto> textos = new ArrayList<>();
    ArrayList<MaterialAudio> audios = new ArrayList<>();
    ArrayList<MaterialVideo> videos = new ArrayList<>();
    ArrayList<MaterialOtro> otros = new ArrayList<>();

    public boolean registrarEstudiante(String carrera, int cantidadCreditos, String nombre, String apellido, int id) throws IOException {
        boolean resp = true;
        Estudiante estudiante = new Estudiante(carrera, cantidadCreditos, nombre, apellido, id);
        TextFileIO archivo = new TextFileIO("estudiantes.txt");
        archivo.setData(estudiante.toString());
        if (estudiantes.contains(estudiante)) {
            resp = false;
        } else {
            estudiantes.add(estudiante);
        }

        return resp;
    }

    public boolean registrarProfesor(String tipoContrato, String fechaContratacion, String nombre, String apellido, int id) throws IOException {
        boolean resp = true;
        Profesor profesor = new Profesor(tipoContrato, fechaContratacion, nombre, apellido, id);
        TextFileIO archivo = new TextFileIO("profesores.txt");
        archivo.setData(profesor.toString());
        if (profesores.contains(profesor)) {
            resp = false;
        } else {
            profesores.add(profesor);
        }

        return resp;
    }

    public boolean registrarAdministrativo(String tipoNombramiento, int cantidadHoras, String nombre, String apellido, int id) throws IOException {
        boolean resp = true;
        Administrativo administrativo = new Administrativo(tipoNombramiento, cantidadHoras, nombre, apellido, id);
        TextFileIO archivo = new TextFileIO("administrativos.txt");
        archivo.setData(administrativo.toString());
        if (administrativos.contains(administrativo)) {
            resp = false;
        } else {
            administrativos.add(administrativo);
        }

        return resp;
    }

    public Estudiante buscarEstudiante(int idEstudiante) {
        Estudiante miEstudiante = new Estudiante();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId() == idEstudiante) {
                miEstudiante = estudiantes.get(i);
            }
        }
        return miEstudiante;
    }

    public Profesor buscarProf(int idProf) {
        Profesor miProfesor = new Profesor();
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId() == idProf) {
                miProfesor = profesores.get(i);
            }
        }
        return miProfesor;
    }

    public Administrativo buscarAdmin(int idAdmin) {
        Administrativo miAdministrativo = new Administrativo();
        for (int i = 0; i < administrativos.size(); i++) {
            if (administrativos.get(i).getId() == idAdmin) {
                miAdministrativo = administrativos.get(i);
            }
        }
        return miAdministrativo;
    }

    public boolean registrarTexto(String titulo, String nombreAutor, String fechaPublicacion, int numPaginas, String idioma, int signatura, String fechaCompra, boolean restringido, String tema) throws IOException {
        Boolean respTexto = true;
        MaterialTexto texto = new MaterialTexto(titulo, nombreAutor, fechaPublicacion, numPaginas, idioma, signatura, fechaCompra, restringido, tema);
        TextFileIO archivo = new TextFileIO("textos.txt");
        archivo.setData(texto.toString());
        if (textos.contains(texto)) {
            respTexto = false;
        }
        return respTexto;
    }

    public boolean registrarAudio(int signatura, String fechaCompra, boolean restringido, String tema, String formato, int duracion, String idioma) throws IOException {
        Boolean respAudio = true;
        MaterialAudio audio = new MaterialAudio(signatura, fechaCompra, restringido, tema, formato, duracion, idioma);
        TextFileIO archivo = new TextFileIO("audios.txt");
        archivo.setData(audio.toString());
        if (audios.contains(audio)) {
            respAudio = false;
        }
        return respAudio;
    }

    public boolean registrarVideo(String formato, int duracion, String idioma, String director, int signatura, String fechaCompra, boolean restringido, String tema) throws IOException {
        Boolean respVideo = true;
        MaterialVideo video = new MaterialVideo(formato, duracion, idioma, director, signatura, fechaCompra, restringido, tema);
        TextFileIO archivo = new TextFileIO("videos.txt");
        archivo.setData(video.toString());
        if (videos.contains(video)) {
            respVideo = false;
        }
        return respVideo;
    }

    public boolean registrarOtro(String descripcion, int signatura, String fechaCompra, boolean restringido, String tema) throws IOException {
        Boolean respOtros = true;
        MaterialOtro otro = new MaterialOtro(descripcion, signatura, fechaCompra, restringido, tema);
        TextFileIO archivo = new TextFileIO("otros.txt");
        archivo.setData(otro.toString());
        if (otros.contains(otro)) {
            respOtros = false;
        }
        return respOtros;
    }

    public ArrayList listarEstud() throws IOException {
//        TextFileIO archivo = new TextFileIO("estudiantes.txt");
//        ArrayList<String> lista = archivo.getData();
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < estudiantes.size(); i++) {
            lista.add(estudiantes.get(i).toString());
        }
        return lista;
    }

    public ArrayList listarAdmin() throws IOException {
        TextFileIO archivo = new TextFileIO("administrativos.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public ArrayList listarProf() throws IOException {
        TextFileIO archivo = new TextFileIO("profesores.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public ArrayList listarTextos() throws IOException {
        TextFileIO archivo = new TextFileIO("textos.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public ArrayList listarAudios() throws IOException {
        TextFileIO archivo = new TextFileIO("audios.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public ArrayList listarVideos() throws IOException {
        TextFileIO archivo = new TextFileIO("videos.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public ArrayList listarOtros() throws IOException {
        TextFileIO archivo = new TextFileIO("otros.txt");
        ArrayList<String> lista = archivo.getData();
        return lista;
    }

    public MaterialTexto buscarTexto(int signatura) {
        MaterialTexto texto = new MaterialTexto();
        for (int i = 0; i < textos.size(); i++) {
            if (textos.get(i).getSignatura() == signatura) {
                texto = textos.get(i);
            }
        }
        return texto;
    }

    public MaterialAudio buscarAudio(int signatura) {
        MaterialAudio audio = new MaterialAudio();
        for (int i = 0; i < audios.size(); i++) {
            if (audios.get(i).getSignatura() == signatura) {
                audio = audios.get(i);
            }
        }
        return audio;
    }

    public MaterialVideo buscarVideo(int signatura) {
        MaterialVideo video = new MaterialVideo();
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getSignatura() == signatura) {
                video = videos.get(i);
            }
        }
        return video;
    }

    public MaterialOtro buscarOtro(int signatura) {
        MaterialOtro otro = new MaterialOtro();
        for (int i = 0; i < otros.size(); i++) {
            if (otros.get(i).getSignatura() == signatura) {
                otro = otros.get(i);
            }
        }
        return otro;
    }

    public Estudiante modificarEst(String carrera, int creditos, String nombreEst, String apellidoEst, int carne) {
        Estudiante miEstudianteM = new Estudiante();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId() == miEstudianteM.getId()) {
                estudiantes.get(i).setNombre(miEstudianteM.getNombre());
                estudiantes.get(i).setApellido(miEstudianteM.getApellido());
                estudiantes.get(i).setId(miEstudianteM.getId());
                estudiantes.get(i).setCarrera(miEstudianteM.getCarrera());
                estudiantes.get(i).setCantidadCreditos(miEstudianteM.getCantidadCreditos());
            }
        }
        return miEstudianteM;
    }
}
