public class Main {

    public static void main(String[] args) {


        System.out.println("Bienvenido al conversor de monedas");
        int respuestaUsuario = 9;

        while (true){

            if (respuestaUsuario == 0) break;
            ComunicacionUsuario.mostrarMenu();
            respuestaUsuario = ComunicacionUsuario.obtenerEntrada();
            String resultados = ConsultarApi.ObtenerDatos();
            System.out.println(resultados);

        }
    }
}
