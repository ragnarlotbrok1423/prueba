package practicas;
import java.io.*;
public class practica_post_parcial 
{
	static InputStreamReader isr = new InputStreamReader (System.in);
	static BufferedReader objLeer= new BufferedReader (isr);
	//main
	public static void main(String[] args) throws IOException
	{
		

	}
	static void Problema6() throws IOException
	{
		// calcular una sumatoria progresiva 
		int denominador=2, conversion; 
		float resultado;
		conversion=1+(1%denominador);
		while (denominador <=50)
		{
			conversion=1%denominador;
			denominador++;
		}
	}
	

}
