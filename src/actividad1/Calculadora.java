
package actividad1;
//importa la libreria Scanner para obtener los valores introducido por teclado
import java.util.Scanner;

public class Calculadora {
    //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se instancia en objeto scam
    	Scanner entrada= new Scanner(System.in);
        boolean act=true;
        while (act) {
            //opciones del menu
            System.out.println("Que accion desea realizar");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            //input para cargar la opcion a elegir 
	    System.out.println("Introduce un numero: ");
	    //lee los valores de tipo INT
	    int eleccion= entrada.nextInt();
            //menu de la calculadora
            switch (eleccion) {
	    	case 1:
                    System.out.println("");
                    //llamado a los metodos del objeto
                    suma();
                    System.out.println("");
		break;
                case 2:
                    System.out.println("");
                    resta();
                    System.out.println("");
		break;
                case 3:
                    System.out.println("");
                    Multiplica();
                    System.out.println("");
		break;
                case 4:
                    System.out.println("");
                    divide();
                    System.out.println("");
		break;
                case 5:
                    System.out.println("");
                    act=false;
                    System.out.println("");
		break;
	    	default:
	    	System.out.println("Las Opciones son entre 1 y 4");
	    }
        }
    }
    //metodo de suma
    public static void suma(){
        //se instancia en objeto scam
	Scanner entrada= new Scanner(System.in);
        boolean act = true;
        int valor1;
	int valor2;
    	while(act){
            System.out.println("Introduzca las opciones a sumar");
            System.out.println("Introduce valor 1: ");
            //lee los valores de tipo INT
            valor1= entrada.nextInt();
            System.out.println("Introduce valor 2: ");
            //lee los valores de tipo INT
            valor2=entrada.nextInt();
            //se realiza la accion matematica
            System.out.println("el valor obtenido es:"+(valor1+valor2));
            //determina si segir en la accion o no
            System.out.println("si desea continuar precione 1 ");
            int respuesta = entrada.nextInt();
            if (respuesta==1) {
            	act = true;
            }
            else{
                act=false;
            }
    	}
    }
    //metodo de resta
    public static void resta(){
    	//se instancia en objeto scam
        Scanner entrada= new Scanner(System.in);
        boolean act = true;
        int valor1;
	int valor2;
    	while(act){
            System.out.println("Introduzca las opciones a Restar");
            System.out.println("Introduce valor 1: ");
            //lee los valores de tipo INT
            valor1= entrada.nextInt();
            System.out.println("Introduce valor 2: ");
            //lee los valores de tipo INT
            valor2=entrada.nextInt();
            //se realiza la accion matematica
            System.out.println("el valor obtenido es:"+(valor1-valor2));
            //determina si segir en la accion o no
            System.out.println("si desea continuar precione 1 ");
            int respuesta = entrada.nextInt();
            if (respuesta==1) {
            	act = true;
            }
            else{
                act=false;
            }
    	}
    }
    //metodo de division
    public static void divide(){
    	//se instancia en objeto scam
        Scanner entrada= new Scanner(System.in);
        boolean act = true;
        int valor1;
	int valor2;
    	while(act){
            System.out.println("Introduzca las opciones a Dividir");
            System.out.println("Introduce valor 1: ");
            //lee los valores de tipo INT
            valor1= entrada.nextInt();
            System.out.println("Introduce valor 2: ");
            //lee los valores de tipo INT
            valor2=entrada.nextInt();
            //se realiza la accion matematica
            System.out.println("el valor obtenido es:"+(valor1/valor2));
            //determina si segir en la accion o no
            System.out.println("si desea continuar precione 1 ");
            int respuesta = entrada.nextInt();
            if (respuesta==1) {
            	act = true;
            }
            else{
                act=false;
            }
    	}
    }
    //metodo de multiplicacion
    public static void Multiplica(){
    	//se instancia en objeto scam
        Scanner entrada= new Scanner(System.in);
        boolean act = true;
        int valor1;
	int valor2;
    	while(act){
            System.out.println("Introduzca las opciones a Multiplicar");
            System.out.println("Introduce valor 1: ");
            //lee los valores de tipo INT
            valor1= entrada.nextInt();
            System.out.println("Introduce valor 2: ");
            //lee los valores de tipo INT
            valor2=entrada.nextInt();
            //se realiza la accion matematica
            System.out.println("el valor obtenido es:"+(valor1*valor2));
            //determina si segir en la accion o no
            System.out.println("si desea continuar precione 1 ");
            int respuesta = entrada.nextInt();
            if (respuesta==1) {
            	act = true;
            }
            else{
                act=false;
            }
    	}
    }
}
