package actividad1;
import java.util.Scanner;
public class TablasMultiplicar {
    //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se hace el llamado a objeto scanner
        Scanner teclado = new Scanner(System.in);
        //se crea una variable para guardar el valor a multiplicar
        int numero;
        //se vizualizan los datos en pantalla mediante un bucle for 
        System.out.print("Introduce un número entero: ");                                                         
        numero = teclado.nextInt();
        System.out.println("Tabla del " + numero);
        for(int i = 1; i<=10; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);       
        }
    }
}
