package infoalumnos;

import java.util.ArrayList;
import java.util.Scanner;

import Validador_de_DNI.Validador_de_DNI;

public class Alula 
{
	ArrayList<Alumno> ListaAlumnos=new ArrayList<Alumno>();
	/**
	 * Metodo que Crea un Array List de Alumnos
	 */
	public void CreaAlumno()
	{
		Scanner BLS=new Scanner(System.in);
		// TODO Auto-generated method stub
		Alumno a;
		Validador_de_DNI val=new Validador_de_DNI();
		

		ArrayList<Double> Nota=new ArrayList<Double>();
	
		
		String nombre;
		String apellido1;
		String apellido2;
		String continuar;
		String DNI;
		double nota;
		
		
	
			
			System.out.println("Introduzca nombre:");
			nombre=BLS.nextLine();
			
			System.out.println("Introduzca el primer apellido:");
			apellido1=BLS.nextLine();
			
			System.out.println("Introduzca el segundo apellido");
			apellido2=BLS.nextLine();
			do
			{
				System.out.println("Introduzca el DNI");
				DNI=BLS.nextLine();
			
			}while(!val.ValidarDNI(DNI));
			a=new Alumno(nombre,apellido1,apellido2,DNI);
			
			do
			{	//pedir notas
				System.out.println("introduzca nota(-1 para acabar)");
				nota=BLS.nextDouble();
				BLS.nextLine();
				if(nota<-1||nota>10)
				{
					System.out.println("Error,la nota sale de los parametros");

				}else if(nota>0&&nota<=10)
				{
					a.a�adeNota(nota);
				}
				}while(nota!=-1);
			
			ListaAlumnos.add(a);
		
	}
	
	/**
	 * Metodo al que le pasas un dni y te muestra en pantalla la coincidencia
	 * @param dni 
	 */
	public void BuscaAlumnoDni(String dni)
	{
	
		for(Alumno item:ListaAlumnos)
		{
			if(dni.equals(item.getDNI()))
			{
				System.out.println(item.fichaAlumno());
			}
			
		}
	
	}
	/**
	 * Metodo que simplemente llama a la clase alumno y muestra en pantalla las fichas de todos los alumnos que estan en el arrayList
	 */
	public void MostrarAlumno()
		{
			for(Alumno item:ListaAlumnos)
			{
				System.out.println(item.fichaAlumno()); 
			}
		}
}

