package cuentas;

/**
 * Clase Main del proyecto.
 * 
 * @author Sergio Cambronero Ponce
 * @since 19/04/2026
 */
public class Main {

    /**
     * Método principal del proyecto.
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        double cantidad1, cantidad2;
        
        // Dando valor a las variables:
        cantidad1 = 2300d;
        cantidad2 = 695d;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Mostrando el saldo de la cuenta:
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Realizando la operativa:
        operativa_cuenta(cuenta1,cantidad1, cantidad2);
    }

    /**
     * Método operativa_cuenta.
     * Método que realiza todas las instrucciones relativas a la operativa de la cuenta.
     * Se han introducido dos parámetros cantidad para que realice exáctamente las mismas
     * operaciones y con las mismas cantidades que el metodo main antes de cambiarlo.
     * 
     * Se han cambiado los tipos de los parametros cantidadN de float a double, porque los 
     * métodos retirar e ingresar utilizan el tipo double. Se ha realizado este cambio para
     * eliminar inconsistencias en el diseño (java permite las operaciones sin problemas, pero
     * no es una buena práctica).
     * 
     * NOTA: Este Javadoc no se genera porque el método es privado, pero lo creo para que quede 
     * constancia de todo esto en el código y, si en el futuro se cambia a public, ya esté
     * hecho.
     * 
     * @see CCuenta#retirar
     * @see CCuenta#ingresar
     * @param cuenta1 cuenta del cliente objeto de la operativa (tipo CCuenta).
     * @param cantidad1 cantidad a retirar de la cuenta (tipo double).
     * @param cantidad2 cantidad a ingresar en la cuenta (tipo double).
     * @since 19/04/2026
     */
    private static void operativa_cuenta(CCuenta cuenta1, double cantidad1, double cantidad2) {
        try {
            cuenta1.retirar(cantidad1);
        } catch (Exception e) { System.out.print("Fallo al retirar"); }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad2);
        } catch (Exception e) { System.out.print("Fallo al ingresar"); }
    }
}
