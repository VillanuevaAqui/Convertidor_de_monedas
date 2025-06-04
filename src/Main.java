import Service.ConsumoApi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = "https://v6.exchangerate-api.com/v6/5d6cf01f4544e6775ba167cf/pair/";
        ConsumoApi consumoApi = new ConsumoApi(url);
        Scanner teclado = new Scanner(System.in);
        int opcionSeleccionada;
        double monto;

        System.out.println("Bienvenido al conversor de monedas :D");

        while (true){

            menuOpciones();
            opcionSeleccionada = teclado.nextInt();

            if (opcionSeleccionada == 7){
                System.out.println("Gracias por usar el convertidor de moneadas :D");
                 break;
            }

            switch (opcionSeleccionada){
                case 1:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("USD", "ARS", String.valueOf(monto)));
                    break;
                case 2:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("ARS", "USD", String.valueOf(monto)));
                    break;
                case 3:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("USD", "MXN", String.valueOf(monto)));
                    break;
                case 4:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("MXN", "USD", String.valueOf(monto)));
                    break;
                case 5:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("USD", "COP", String.valueOf(monto)));
                    break;
                case 6:
                    imprimeOpcionSeleccionada(opcionSeleccionada);
                    monto = teclado.nextDouble();
                    System.out.println(consumoApi.obtenerDatosMonedas("COP", "USD", String.valueOf(monto)));
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            teclado.nextLine();
            System.out.println("Presione Enter para continuar");
            teclado.nextLine();
        }
    }

    public static void menuOpciones(){

        System.out.println("Seleccione una opción");
        System.out.println("1) Dólar a Peso argentino");
        System.out.println("2) Peso Argentino a Dólar");
        System.out.println("3) Dólar a Peso Mexicano");
        System.out.println("4) Peso Mexicano a Dólar");
        System.out.println("5) Dólar a peso Colombiano");
        System.out.println("6) Peso Colombiano a Dólar");
        System.out.println("7) Salir");
    }

    public static void imprimeOpcionSeleccionada(int opcion){
        System.out.println("Seleccionaste la opcion " + opcion);
        System.out.println("Ingrese el monto a convertir: ");
    }
}
