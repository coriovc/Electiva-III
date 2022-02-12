
package actividad1;
//importa la libreria InputMismatchException para detectar si el valor numerico o no
import java.util.InputMismatchException;
//importa la libreria Scanner para obtener los valores introducido por teclado
import java.util.Scanner;

public class actividad1 {

    public static void main(String[] args){
    	//se instancia en objeto scam
    	Scanner entrada= new Scanner(System.in);
        //se hace el llamado al objeto CalEdad
        CalEdad edad=new CalEdad();
        //Se hace el llamado al objeto Temperatura 
        Temperatura temperatura=new Temperatura();
        //se llamado del objeto DatosUsuario
        DatosUsuario usuario=new DatosUsuario();
    	//se hace el llamado a objeto calculadora
    	Calculadora cal= new Calculadora();
        //se hace el llamado al objeto NumAleatorio
        NumAleatorio aleatorio=new NumAleatorio();
        //se hace el llamado al objeto TablasMultiplicar
        TablasMultiplicar tablas=new TablasMultiplicar();
    	//se crea una variable para salir del programa
    	boolean act=true;
    	//variable que funcionara para saber la opcion marcada
    	int eleccion;
    	//se usa un while para recorrer el menu
    	while (act) {
    		//opciones del menu
    		System.out.println("1. Calcular edad personas");
            System.out.println("2. Transformar unidades temperatura");
            System.out.println("3. Solicitud de datos usuario");
            System.out.println("4. Calculadora operaciones basicas");
            System.out.println("5. Generador numeros aleatorios");
            System.out.println("6. Generador de tabla de multiplicar numero ingresado");
    		System.out.println("7. Salir");
    		try{
    			//input para cargar la opcion a elegir 
	    		System.out.println("Introduce un numero: ");
	    		//lee los valores de tipo INT
	    		eleccion= entrada.nextInt();
    			switch (eleccion) {
	    			case 1:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			edad.principal();
		    			System.out.println("");
		    			break;
	    			case 2:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			temperatura.principal();
		    			break;
	    			case 3:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			usuario.principal();
		    			System.out.println("");
		    			break;
	    			case 4:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			cal.principal();
		    			System.out.println("");
		    			break;
	    			case 5:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			aleatorio.principal();
		    			System.out.println("");
		    			break;
	    			case 6:
	    				System.out.println("");
                                        //llamado a los metodos del objeto
		    			tablas.principal();
		    			System.out.println("");
		    			break;
	    			case 7:
		    			act=false;
		    			break;
	    			default:
	    				 System.out.println("Las Opciones son del 1 al 7");
	    		}
    		}
    		//detecta el error del valor introducido
    		catch (InputMismatchException e) {
    			//mensaje de error 
    			System.out.println("Solo Introduce un numero");
    			//salta al siguiente ciclo del bucle
    			entrada.next();
    		}
	    		
    	}
        System.out.println("Prueba 1");
    }
}
