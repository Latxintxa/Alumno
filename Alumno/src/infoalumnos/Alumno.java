package infoalumnos;
import java.util.ArrayList;
import java.util.Scanner;
public class Alumno 
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String asignatura; 
	private double nota;
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getApellido1() 
	{
		return apellido1;
	}
	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}
	
	public String getApellido2()
	{
		return apellido2;
	}
	public void setApellido2(String apellido2) 
	{
		this.apellido2 = apellido2;
	}
	
	public String getAsignatura() 
	{
		return asignatura;
	}
	public void setAsignatura(String asignatura)
	{
		this.asignatura = asignatura;
	}
	
	public void aņadeNotas()
	{
		ArrayList<Double> ListaNotas=new ArrayList<Double>();
		Scanner BLS=new Scanner(System.in); 
		do
		{
			System.out.println("Introduzca una nota(valor negativo para finalizar): ");
			this.nota=BLS.nextDouble();
			BLS.nextLine();
			if(nota>10)
			{
				System.out.println("Error,valor por encima del maximo");

			}
			ListaNotas.add(this.nota);
		}while(nota>0);
		
	}
	public String nombreCompleto()
	{
		return this.apellido1+" "+apellido2+" "+this.nombre;
	}
	public double muestraNotas()
	{
		return this.nota;
	}
		 
	}

