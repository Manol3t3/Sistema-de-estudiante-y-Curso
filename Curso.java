package org.ejercicio.SistemaEyc;

public class Curso{
    String nombrecurso;
    int creditos;

    public Curso(){
        this.nombrecurso = "NA";
        thsi.creditos = 0;
    }
    public Curso(string nombrecurso, int creditos){
        this.nombrecurso = nombrecurso;
        thsi.creditos = creditos;
    }
    public setNombreCurso(){
        this.nombrecurso = nombrecurso;
    }
    public void getNombreCurso(String nombrecurso){
        return nombrecurso;
    }
    public void setCurso(){
        this.creditos = creditos;
    }
    public int getCreditos(int creditos){
        return creditos;
    }

    @Override
        public String toString(){
            return "Curso{" + "nombre del curso:" + nombrecurso + '\''
                    ", creditos=" + creditos '}';
        }
}