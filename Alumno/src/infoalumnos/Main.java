package infoalumnos;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Menu;
import Validador_de_DNI.Validador_de_DNI;
public class Main {

	public static void main(String[] args)
	{
		
		Scanner BLS=new Scanner(System.in);
		// TODO Auto-generated method stub
		Alula a=new Alula();
		
		Alumno al=new Alumno();
		Validador_de_DNI validar=new Validador_de_DNI();
		int respuesta=0;
		String dni;
		do
		{
			
			//Busca el metodo menu Subnormal
			String[] preguntas=new String(){" 1 para crear alumno "," 2 para mostrar alumnos "," 3 para buscar por dni "," 4 para acabar "};
			menu.pintamenu(preguntas,"Eliga una opcion");
			respuesta=BLS.nextInt();
			BLS.nextLine();
			switch(respuesta)
			{
				case 1:
					a.CreaAlumno();
				break;
				case 2:
					a.MostrarAlumno();
					break;
					
				case 3:
					do
					{
						
						System.out.println("Introduzca el DNI a buscar");
						dni=BLS.nextLine();
					
					}while(!validar.ValidarDNI(dni));
					a.BuscaAlumnoDni(dni);
					break;
				case 4:
					System.out.println("Fin del programa");
					break;
				default:
					System.out.println("No ha elegido ninguna opcion v�lida");
					
			}
		}while(respuesta!=4);
			
	
		
	}

}
