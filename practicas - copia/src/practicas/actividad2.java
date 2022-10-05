package practicas;
import java.io.*;

public class actividad2 
{
	static InputStreamReader isr = new InputStreamReader (System.in);
	static BufferedReader objLeer= new BufferedReader (isr);

	public static void main(String[] args) throws IOException
	{
		int opcion;
		  //menu
		System.out.println("1: Suma de articulos");
		System.out.println("2: Promedio de 3 números");
	    System.out.println("3:Saber la calficación final de ingles");
		System.out.println("4: descuento de los articulos");
		System.out.println("5: salir");
		System.out.println("Escoja una de las opciones presentadas");
		opcion=Integer.parseInt(objLeer.readLine());
		  while (opcion!=5)
		  {
			  switch (opcion)
			  {
			    case 1: 
			    mtdProblema1();
			    break;
			    
			    case 2: opcion=2;
			    mtdProblema2();
			    break;
			    case 3: opcion=3;
			    mtdProblema3();
			    break;
			    case 4: opcion=4;
			    mtdProblema4();
			    break;
			    case 5: opcion=5;
			    System.out.println("Ejecución finalizada...");
			    break;
	         }
		  }
	}
	static void mtdProblema1() throws IOException
	{
		float valorArt, costoTotal=0, sum=0, itbm;
		int c=1;
		while (c<10)
		{
			System.out.println("Coloque el costo de el articulo");
			valorArt= Float.parseFloat(objLeer.readLine());
			sum=sum+valorArt;
			//System.out.print(sum);
			System.out.println("El valor de la compra es de: "+ sum);
			itbm=(float)(sum*0.07);
			costoTotal= sum+itbm;
			System.out.println("ITBM: "+ itbm);
			System.out.println("El costo total es de: "+ costoTotal );
			c++;
		}
	}
    static void mtdProblema2()throws IOException
    {
    	
		int numero1, numero2, numero3,sum;
		float promedio;
		System.out.println("Coloque los números");
		numero1=Integer.parseInt(objLeer.readLine());
		numero2=Integer.parseInt(objLeer.readLine());
		numero3=Integer.parseInt(objLeer.readLine());
		while (numero1!=0)
		{
			sum=numero1+numero2+numero3;
			promedio=sum/3;
			System.out.println("El promedio es de: "+ promedio);
			numero1=Integer.parseInt(objLeer.readLine());
			numero2=Integer.parseInt(objLeer.readLine());
			numero3=Integer.parseInt(objLeer.readLine());
			
		}
		System.out.println("Programa finalizado...");
    }
    static void mtdProblema3()throws IOException

    {
    	int calific1, calific2, calific3, examenFinal, trabajoFinal, c=0;
    	float promedio,porcentajeExFinal, porcentajeTrabFinal,notaFinal;
    	
    	while (c<25)
    	{
    		c++;
    		System.out.println("Coloque las 3 calificaciones");
        	calific1=Integer.parseInt(objLeer.readLine());
        	
        	calific2=Integer.parseInt(objLeer.readLine());
        	
        	calific3=Integer.parseInt(objLeer.readLine());
        	
        	System.out.println("Coloque la nota del examen final");
        	
            examenFinal=Integer.parseInt(objLeer.readLine());
            
        	System.out.println("Coloque la nota del trabajo final");
        	
        	trabajoFinal=Integer.parseInt(objLeer.readLine());
    		promedio=(float)(((calific1+calific2+calific3)/3)*(0.55));
    		//System.out.println(promedio);
    		porcentajeExFinal=(float) (examenFinal*0.30);
    		porcentajeTrabFinal=(float) (trabajoFinal*0.15);
    		notaFinal=(promedio+porcentajeExFinal+porcentajeTrabFinal);
    		System.out.print("Su calificacion es de: "+ notaFinal+" ");
    		if (notaFinal>=91 && notaFinal<=100)
    			System.out.println("A");
    		if (notaFinal>=81 && notaFinal<=90)
    			System.out.println("B");
    		if (notaFinal>=71 && notaFinal<=80)
    			System.out.println("c");
    		if (notaFinal>=61 && notaFinal <=70)
    			System.out.println("D");
    		if (notaFinal>=0 && notaFinal <= 60)
    			System.out.println("F");
    	}
    }
    static void mtdProblema4()throws IOException
    {
    	String desicion;
    	float articulo, costoTotal,descuento,suma=0;
    	System.out.println("¿Desea empezar el programa?");
    	desicion=objLeer.readLine();
    	while (desicion.equals("si"))
    	{
    		System.out.println("Colque el valor del articulo: ");
        	articulo=Float.parseFloat(objLeer.readLine());
        	suma=suma+articulo;
        	System.out.println("¿Deseas continuar?");
        	desicion=objLeer.readLine();
        	if (desicion.equals("no"))
        	{
        		descuento=(float) (suma*0.15);
        		costoTotal=suma-descuento;
        		System.out.println("El costo de la compra es de: "+ suma);
        		System.out.println("El descuento es de : "+ descuento);
        		System.out.println("El costo total es de:  "+ costoTotal);
        	}
    	}
    } 
}
