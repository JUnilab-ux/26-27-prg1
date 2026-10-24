import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos euros debe pagar?");
        int costoDeCompra = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int pagoDeCompra = scanner.nextInt();

        final int BILLETE_DE_100€ = 100;
        final int BILLETE_DE_50€ = 50;
        final int BILLETE_DE_20€ = 20;
        final int BILLETE_DE_10€ = 10;
        final int BILLETE_DE_5€ = 5;
        final int MONEDA_DE_2€ = 2;

        int cambioDeCompra = pagoDeCompra - costoDeCompra;
        int cambioRestante = cambioDeCompra;

        int cantidadDeCambio100 = (int) (cambioRestante / BILLETE_DE_100€);
        cambioRestante = cambioRestante % BILLETE_DE_100€;

        int cantidadDeCambio50 = (int) (cambioRestante / BILLETE_DE_50€);
        cambioRestante = cambioRestante % BILLETE_DE_50€;

        int cantidadDeCambio20 = (int) (cambioRestante / BILLETE_DE_20€);
        cambioRestante = cambioRestante % BILLETE_DE_20€;

        int cantidadDeCambio10 = (int) (cambioRestante / BILLETE_DE_10€);
        cambioRestante = cambioRestante % BILLETE_DE_10€;

        int cantidadDeCambio5 = (int) (cambioRestante / BILLETE_DE_5€);
        cambioRestante = cambioRestante % BILLETE_DE_5€;

        int cantidadDeCambio2 = (int) (cambioRestante / MONEDA_DE_2€);
        cambioRestante = cambioRestante % MONEDA_DE_2€;

        int cantidadDeCambio1 = cambioRestante;

        System.out.println(cantidadDeCambio100 + " billete(s) de 100 €");
        System.out.println(cantidadDeCambio50 + " billete(s) de 50 €");
        System.out.println(cantidadDeCambio20 + " billete(s) de 20 €");
        System.out.println(cantidadDeCambio10 + " billete(s) de 10 €");
        System.out.println(cantidadDeCambio5 + " billete(s) de 5 €");
        System.out.println(cantidadDeCambio2 + " moneda(s) de 2 €");
        System.out.println(cantidadDeCambio1 + " moneda(s) de 1 €");
    }
}