package infoalumnos;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner BLS=new Scanner(System.in);
		// TODO Auto-generated method stub
		Alumno a=new Alumno();
		ArrayList<Alumno> ListaAlumnos=new ArrayList<Alumno>();
		ArrayList<Double> Nota=new ArrayList<Double>();
	
		
		String nombre;
		String apellido1;
		String apellido2;
		String continuar;
		
		
		do
		{
			System.out.println("Introduzca nombre:");
			nombre=BLS.nextLine();
			a.setNombre(nombre);
			
			System.out.println("Introduzca el primer apellido:");
			apellido1=BLS.nextLine();
			a.setApellido1(apellido1);
			
			System.out.println("Introduzca el segundo apellido");
			apellido2=BLS.nextLine();
			a.setApellido2(apellido2);
			
			a.a�adeNotas();
			ListaAlumnos.add(a);
			do
			{
				System.out.println("�Desea continuar Y/N?");
				continuar=BLS.nextLine().toUpperCase();
				if(continuar!="Y"||continuar!="N")
				{
					System.out.println("Error,debe introducir un Y para continuar y N para acabar.");
				}
			}while(continuar!="Y"||continuar!="N");
			
		}while(continuar!="N");
		
		for(Alumno item: ListaAlumnos)
		{
			System.out.println(item.nombreCompleto());
			System.out.println(item.muestraNotas());
		}

	}

}
