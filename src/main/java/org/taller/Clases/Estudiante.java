package org.taller.Clases;

public class Estudiante {
    public String nombre;
    public int edad;
    public String curso;

    // Constructor por defecto con valores genéricos
    Estudiante() {
        nombre = "Estudiante";
        edad = 18;
        curso = "Sin asignar";
    }

    // Constructor con nombre y edad
    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin asignar";
    }

    // Constructor completo — usa this() para delegar
    Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);   // llama al constructor de dos parámetros
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", curso='" + curso + "'}";
    }
}