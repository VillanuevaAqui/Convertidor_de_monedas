import java.util.Scanner;

public class ComunicacionUsuario {

    public static int obtenerEntrada ()  {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese una opcion: ");
        int respuesta = escaner.nextInt();

        return respuesta;
    }

    public static void mostrarMenu(){

        System.out.println("*********************************************");
        System.out.println("1) - USD a MXN");
        System.out.println("2) - USD a MXN");
        System.out.println("3) - USD a MXN");
        System.out.println("4) - USD a MXN");
        System.out.println("5) - USD a MXN");
        System.out.println("6) - USD a MXN");
        System.out.println("7) - USD a MXN");
        System.out.println("8) - USD a MXN");
        System.out.println("0) - SALIR");
        System.out.println("*********************************************");
    }
}
