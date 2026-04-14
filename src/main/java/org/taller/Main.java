package org.taller;

import java.util.Scanner;

import org.taller.Clases.Libro;
import org.taller.Clases.CuentaBancaria;
import org.taller.Clases.Estudiante;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================== Proyecto Integrador Constructores Java ===================\n");

        // --- Libro ---
        System.out.println("-- Ingreso de datos para Libro --");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = Integer.parseInt(sc.nextLine());

        Libro libroIngresado = new Libro(titulo, autor, paginas);
        Libro libroDefault = new Libro();

        System.out.println("\nLibro ingresado: " + libroIngresado);
        System.out.println("Libro por defecto: " + libroDefault);
        libroIngresado.mostrarDetalles();

        // --- CuentaBancaria ---
        System.out.println("\n-- Ingreso de datos para CuentaBancaria --");
        System.out.print("Número de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.print("Tipo (Ahorros/Corriente): ");
        String tipo = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());

        CuentaBancaria cuentaCompleta = new CuentaBancaria(numCuenta, saldo, tipo);
        CuentaBancaria cuentaDos = new CuentaBancaria(numCuenta, tipo);
        CuentaBancaria cuentaDefault = new CuentaBancaria();

        System.out.println("\nCuenta completa (3 params): " + cuentaCompleta);
        System.out.println("Cuenta parcial (2 params): " + cuentaDos);
        System.out.println("Cuenta default: " + cuentaDefault);

        // --- Estudiante ---
        System.out.println("\n-- Ingreso de datos para Estudiante --");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estCompleto = new Estudiante(nombre, edad, curso);
        Estudiante estParcial  = new Estudiante(nombre, edad);
        Estudiante estDefault  = new Estudiante();

        System.out.println("\nEstudiante completo: " + estCompleto);
        System.out.println("Estudiante parcial: " + estParcial);
        System.out.println("Estudiante por defecto: " + estDefault);

        sc.close();
    }
}
