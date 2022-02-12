package actividad1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalEdad {
   //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se hace el llamado al objeto scanner 
        Scanner teclado = new Scanner(System.in);
        //se introduce los valores por teclado y se guardan en variables 
        System.out.print("Número día nacimiento: ");
        int day = teclado.nextInt();
        System.out.print("Numero mes nacimiento: ");
        int month = teclado.nextInt();
        System.out.print("Año nacimiento: ");
        int year = teclado.nextInt();
        //se visualiza la edad de la persona en pantalla
        System.out.println("\nTu edad es: " + calcularEdad(day, month, year));
    }
    
    static int calcularEdad(int day, int month, int year) {
        //se obtiene la fecha del dia actual por medio del objeto LocalDate
	LocalDate fecha_actual = LocalDate.now();
        //median te el objeto LocalDate se transforma la cadena de texto de la fecha en un valor de tipo fecha
	LocalDate fecha_nacimiento = LocalDate.of(year, month, day);
        // mediante el metodo Period.between se calcula la edad de la persona y se retorna el valor
	Period periodo = Period.between(fecha_nacimiento, fecha_actual);
	return periodo.getYears();
    }
}
