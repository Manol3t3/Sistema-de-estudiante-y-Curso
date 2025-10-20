package org.ejercicio.SistemaEyC;

public class Estudiante{
    String nombre;
    String curso

    public Estudiante(){
        this.nombre = "NA",
        this.curso = "NA";
    }
    public  Estudiante(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCurso(){
        return curso;
    }
    publicvoid setCurso(String curso){
        this.curso = curso;
    }
    @Override
        public void toString(){
            return "estudiante{" + "nombre del estudiante:" + nombre + '\'' + 
                    ", curso:" + curso '}';
        }
}
