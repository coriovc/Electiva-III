package actividad1;
import java.util.Scanner;
public class DatosUsuario {
    //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se hace el llamado a objeto scanner
        Scanner teclado = new Scanner(System.in);
        //se ingresa los datos pedidos en pantalla
        System.out.println("Ingresar su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingresar su apellido");
        String apellido = teclado.nextLine();
        System.out.println("Ingresar su correo");
        String correo = teclado.nextLine();
        System.out.println("Ingresar su direccion");
        String direccion = teclado.nextLine();
        System.out.println("Ingresar su numero telefonico");
        long numero_telefono = teclado.nextLong();
        //se ven los datos obtenidos por teclado
        System.out.println("su nombre es:" + nombre);
        System.out.println("su apellido es:" + apellido);
        System.out.println("su correo es:" + correo);
        System.out.println("su direccion es:" + direccion);
        System.out.println("su numero telefonico es:" + numero_telefono);
    }
}
