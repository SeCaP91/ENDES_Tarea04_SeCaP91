
package cuentas;

public class CCuenta {
    // Atributos de la clase:
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() { }

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public double estado() { return this.saldo; }

    public void ingresar(double cantidad) throws Exception
    {
        if ( cantidad < 0 ) { throw new Exception("No se puede ingresar una cantidad negativa"); }
        this.saldo = this.saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if ( cantidad <= 0 ) { throw new Exception ("No se puede retirar una cantidad nula o negativa"); }
        if ( estado() < cantidad ) { throw new Exception ("No se hay suficiente saldo"); }
        this.saldo = this.saldo - cantidad;
    }
}