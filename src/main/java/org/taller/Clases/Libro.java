package org.taller.Clases;

import java.util.Scanner;

    public class Libro {
        public String titulo;
        public String autor;
        public int numeroPaginas;

        // Constructor por defecto
        Libro() {
            titulo = "Sin título";
            autor = "Desconocido";
            numeroPaginas = 0;
        }

        // Constructor parametrizado
        Libro(String titulo, String autor, int numeroPaginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.numeroPaginas = numeroPaginas;
        }

        public void mostrarDetalles() {
            System.out.println("Libro: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Páginas: " + numeroPaginas);
        }

        @Override                  // Sobrescribe el método toString() para mostrar la información del objeto Libro de forma legible
        public String toString() {
            return "Libro{titulo='" + titulo + "', autor='" + autor + "', paginas=" + numeroPaginas + "}";
        }
    }

