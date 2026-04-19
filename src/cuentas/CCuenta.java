
package cuentas;

/**
 * Clase CCuenta.
 * Esta clase se utiliza para crear objetos que representan la cuenta de un cliente.
 * 
 * @author Sergio Cambronero Ponce
 * @since 19/04/2026
 */
public class CCuenta {
    // Atributos de la clase:
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío de CCuenta.
     * Constructor vacío de objetos CCuenta.
     * 
     * @since 19/04/2026
     */
    public CCuenta() { }

    /**
     * Constructor de la clase CCuenta.
     * Crea objetos CCuenta, recibiendo los parámetros.
     * 
     * @param nombre nombre del cliente (tipo String).
     * @param cuenta cuenta del cliente (tipo String).
     * @param saldo saldo de la cuenta del cliente (tipo double).
     * @param tipoInteres tipo de interés de la cuenta del cliente (tipo double).
     * @since 19/04/2026
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método estado.
     * Devuelve el saldo de la cuenta.
     * 
     * @return saldo de la cuenta (tipo double).
     * @since 19/04/2026
     */
    public double estado() { return this.saldo; }

    /**
     * Método ingresar.
     * Este método permite ingresar una cantidad en la cuenta, comprobando siempre que la cantidad 
     * no sea negativa.
     * 
     * @param cantidad a ingresar en la cuenta (tipo double).
     * @throws Exception si la cantidad a ingresar en la cuenta es negativa.
     * @since 19/04/2026
     */
    public void ingresar(double cantidad) throws Exception
    {
        if ( cantidad < 0 ) { throw new Exception("No se puede ingresar una cantidad negativa"); }
        this.saldo = this.saldo + cantidad;
    }

    /**
     * Método retirar.
     * Este método permite retirar una cantidad de la cuenta, comprobando siempre que la cantidad 
     * no sea negativa, nula o inferior al saldo de la cuenta.
     * 
     * @param cantidad cantidad a retirar de la cuenta (tipo double).
     * @throws Exception si la cantidad a retirar es negativa, nula o inferior al saldo de la cuenta.
     * @since 19/04/2026
     */
    public void retirar(double cantidad) throws Exception
    {
        if ( cantidad <= 0 ) { throw new Exception ("No se puede retirar una cantidad nula o negativa"); }
        if ( estado() < cantidad ) { throw new Exception ("No se hay suficiente saldo"); }
        this.saldo = this.saldo - cantidad;
    }
}