package practicas;
import java.io.*;
public class ensayo
{
	static InputStreamReader isr = new InputStreamReader (System.in);
	static BufferedReader objLeer= new BufferedReader (isr);

	public static void main(String[] args) throws IOException 
	{
	  int opcion;
	  System.out.println("Escoja una de las opciones presentadas");
	  //menu
	  System.out.println("1: Imprimir los numeros pares entre 1 y 100");
	  System.out.println("2: Sumar los números impares entre 12 y 400");
	  System.out.println("3: Imprimir los números comprendidos entre 2 números");
	  System.out.println("4: Obtener el promedio de una lista de números");
	  System.out.println("5:sumar numeros solo si son del 3 al 7 y la suma finaliza cuando sea mayor de 45");
	  System.out.println("6: salir");
	  opcion=Integer.parseInt(objLeer.readLine());
	  while (opcion!=6)
	  {
		  switch (opcion)
		  {
		    case 1:
		    problema1();
		    break;
		    case 2:
		    problema2();
		    break;
		    case 3:
		    problema3();
		    break;
		    case 4: 
		    problema4();
		    break;
		    case 5:
		    problema5();
		    break;
		    case 6: 
		    System.out.println("Ejecución finalizada");
		    break;
		    
		  } 
	  }
	  
	}
	
	static void problema1() 
	{
		//TODO Imprimir los numero |pares| entre 1 y 100
		int n = 1;
		
		while(n != 100) 
		{
			n++;
			if(n%2 == 0)
				System.out.println(n);
			
		}
	}
	static void problema2() 
	{
		//TODO sumar los numero impares entre 12 y 400
		int n = 12, total = 0;
		
		while(n <= 400) {
			if(n%2 != 0)
				total += n;
			n++;
		}
		System.out.println(total);
	}
	static void problema3() throws IOException 
	{
		// Imprimir los numer comprendidos entre a y b
		//recibir a y b por teclado
		//determinar cual es el mayor y menor para conezar el conteo en orden ascendente
		//iterar desde a hasta b 

		int a, b, start = 0, end = 0;
		System.out.println("Intrduzca dos numeros para contar los valores en medio de estos");
		a = Integer.parseInt(objLeer.readLine());
		b = Integer.parseInt(objLeer.readLine());
		
		if(a < b) {
			start = a;
			end = b;
		}
		
		if(b < a) {
			start = b;
			end = a;
		}
		
		while(start <= end) {
			System.out.println(start);
			start++;
		}
		
	}
	static void problema4()throws IOException
	{
		int numeros,c=0,suma=0;
		float prom;
		System.out.print("Coloque el numero: ");
		numeros=Integer.parseInt(objLeer.readLine());
		while (numeros!=0)
		{
			c++;
			suma=suma+numeros;
			System.out.print("Coloque el numero: ");
			numeros=Integer.parseInt(objLeer.readLine());	
		}
		prom=suma/c;
		System.out.print("El promedio es de: ");
		System.out.print(prom);
		
	}
	 static void problema5() throws IOException
		{
		/*
		 * Leer numeros y sumarlos. Finalizar cuando la suma supera el valor 45. 
		 * Los numeros numeros validos para sumar son del 3 al 7, inclusive.
		 * */
	   
			int suma = 0, num;
			System.out.print("Ingresa tu numero: ");
			num = Integer.parseInt(objLeer.readLine());
			if(num>2 && num<8)
				suma += num;
			else
				System.out.println("numero no valido");
			while(suma<=45) 
			{
				System.out.print("Ingresa tu numero: ");
				num = Integer.parseInt(objLeer.readLine());
				if(num>2 && num<8)
					suma += num;
				else
					System.out.println("numero no valido");
			}
			System.out.println(suma);
		}
	
	

}
