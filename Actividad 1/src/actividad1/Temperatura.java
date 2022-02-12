package actividad1;
import java.util.Scanner;

public class Temperatura {
    //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se crea una variable de tipo float para guardar los grados a convertir 
        float grados;
        //se hace el llamado a objeto scanner
        Scanner teclado = new Scanner(System.in);
        //se ingresan los datos por teclado
        System.out.println("Ingresa los grados celsius: ");
        grados = teclado.nextFloat();
        //se convierte a grados kelvin
        float kelvin=Obtener_Kelvin(grados);
        //se convierte a grados fahrenheit
        float fahrenheit = Obtener_Fahrenheit(grados);
        //se muestra en pantalla
        System.out.printf("%f grados celsius son %f grados fahrenheit y en grados kelvin son %f\n\n", grados, fahrenheit,kelvin);
    }
    
    //metodo para calcular para convertir a grados fahrenheit
    public static float Obtener_Fahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }
    
    //metodo para calcular para convertir a grados kelvin
    public static float Obtener_Kelvin(float celsius) {
        return (float)(celsius + 273.15);
    }
}
