package practicas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica2 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader objLeer= new BufferedReader (isr);
		// definición de variables
		String Nombre;
		int Edad;
		
		// lectura de cadenas
		
		System.out.println ("Escriba su nombre: ");
		Nombre= objLeer.readLine();
		
		// lectura de enteros
		
		System.out.println ("Coloque su edad");
		Edad= Integer.parseInt (objLeer.readLine());
		
		// Ejecución de procesos
		
		if (Edad > 17) {
			System.out.print (Nombre+" " );
			System.out.println ("Usted es mayor de edad");	
		}else {
			System.out.print(Edad +  Nombre);
			System.out.println(" Usted no puede tramitar una licencia de conducir");
		}
		
		
		

	}

}
