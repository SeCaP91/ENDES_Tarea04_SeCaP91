package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad1, cantidad2;
        
        // Dando valor a las variables:
        cantidad1 = 2300;
        cantidad2 = 695;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Mostrando el saldo de la cuenta:
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Realizando la operativa:
        operativa_cuenta(cuenta1,cantidad1, cantidad2);
    }

    private static void operativa_cuenta(CCuenta cuenta1, float cantidad1, float cantidad2) {
        try {
            cuenta1.retirar(cantidad1);
        } catch (Exception e) { System.out.print("Fallo al retirar"); }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad2);
        } catch (Exception e) { System.out.print("Fallo al ingresar"); }
    }
}
