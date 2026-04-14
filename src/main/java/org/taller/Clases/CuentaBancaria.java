package org.taller.Clases;

public class CuentaBancaria {
    public String numeroCuenta;
    public double saldo;
    public String tipoCuenta;

    // Constructor por defecto
    CuentaBancaria() {
        numeroCuenta = "000-000";
        saldo = 0.0;
        tipoCuenta = "Ahorros";
    }

    // Constructor con dos parámetros
    CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    // Constructor sobrecargado con tres parámetros
    CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{numero='" + numeroCuenta + "', saldo=" + saldo + ", tipo='" + tipoCuenta + "'}";
    }
}