package actividad1;

public class NumAleatorio {
    //metodo principal que se encargara de vizualizar el metodo del objeto en el main
    public static void principal(){
        //se crea una variable con un valor minimo
        int numero_min = 25;
        //se crea una variable con un valor Maximo
	int numero_max = 75;
        //se crea una variable para almacenar el numero aleatorio
        int generar = (int)Math.floor(Math.random()*(numero_max-numero_min+1)+numero_min);
        //se vizualiza el resultado
	System.out.println(generar);
    }
}
