
import java.util.Scanner;

class DevolverCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos euros debe pagar?");
        double costoDeCompra = scanner.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double pagoDeCompra = scanner.nextDouble();

        final int BILLETE_DE_100€ = 100;
        final int BILLETE_DE_50€ = 50;
        final int BILLETE_DE_20€ = 20;
        final int BILLETE_DE_10€ = 10;
        final int BILLETE_DE_5€ = 5;
        final int MONEDA_DE_2€ = 2;
        final int MONEDA_DE_1€ = 1;

        double cambioDeCompra = pagoDeCompra - costoDeCompra;
        double cambioRestante = cambioDeCompra;

        //Cantidad de Billetes y Monedas de cambio
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

        int cantidadDeCambio1 = (int) (cambioRestante % MONEDA_DE_1€);
        cambioRestante = cambioRestante % MONEDA_DE_1€;

        final int CENTIMO_DE_50€ = 50;
        final int CENTIMO_DE_20€ = 20;
        final int CENTIMO_DE_10€ = 10;
        final int CENTIMO_DE_5€ = 5;
        final int CENTIMO_DE_2€ = 2;

        final int CONVERSION_A_CENTAVOS€ = 100;
        cambioRestante = (int) (cambioRestante * CONVERSION_A_CENTAVOS€);

        //Cantidad de Centimos de cambio
        int cantidadDeCambio50Cent = (int) cambioRestante / CENTIMO_DE_50€;
        cambioRestante = cambioRestante % CENTIMO_DE_50€;

        int cantidadDeCambio20Cent = (int) cambioRestante / CENTIMO_DE_20€;
        cambioRestante = cambioRestante % CENTIMO_DE_20€;

        int cantidadDeCambio10Cent = (int) cambioRestante / CENTIMO_DE_10€;
        cambioRestante = cambioRestante % CENTIMO_DE_10€;

        int cantidadDeCambio5Cent = (int) cambioRestante / CENTIMO_DE_5€;
        cambioRestante = cambioRestante % CENTIMO_DE_5€;

        int cantidadDeCambio2Cent = (int) cambioRestante / CENTIMO_DE_2€;
        cambioRestante = cambioRestante % CENTIMO_DE_2€;

        int cantidadDeCambio1Cent = (int) cambioRestante;

        System.out.println(cantidadDeCambio100 + " billete(s) de 100 €");
        System.out.println(cantidadDeCambio50 + " billete(s) de 50 €");
        System.out.println(cantidadDeCambio20 + " billete(s) de 20 €");
        System.out.println(cantidadDeCambio10 + " billete(s) de 10 €");
        System.out.println(cantidadDeCambio5 + " billete(s) de 5 €");
        System.out.println(cantidadDeCambio2 + " moneda(s) de 2 €");
        System.out.println(cantidadDeCambio1 + " moneda(s) de 1 €");

        System.out.println(cantidadDeCambio50Cent + " moneda(s) de 0,50 €");
        System.out.println(cantidadDeCambio20Cent + " moneda(s) de 0,20 €");
        System.out.println(cantidadDeCambio10Cent + " moneda(s) de 0,10 €");
        System.out.println(cantidadDeCambio5Cent + " moneda(s) de 0,05 €");
        System.out.println(cantidadDeCambio2Cent + " moneda(s) de 0,02 €");
        System.out.println(cantidadDeCambio1Cent + " moneda(s) de 0,01 €");
    }
}
