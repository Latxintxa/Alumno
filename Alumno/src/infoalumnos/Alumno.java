package infoalumnos;
import java.util.ArrayList;
import java.util.Scanner;
public class Alumno 
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private ArrayList<Double> notas;
	private String DNI;
	
	public Alumno(String nombre,String apellido1,String apellido2,String DNI)
	{
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.DNI=DNI;
		this.notas=new ArrayList<Double>();
	}
	public Alumno()
	{
		this.nombre="";
		this.apellido1="";
		this.apellido2="";
		this.DNI="";
		this.notas=new ArrayList<Double>();
	}
	
	public String getDNI() 
	{
		return DNI;
	}
	public void setDNI(String dNI)
	{
		DNI = dNI;
	}
	
	
	public ArrayList<Double> getNotas() 
	{
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
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
	

	
	public void añadeNota(double nota)
	{
		
		this.notas.add(nota);
		
	}
	public String nombreCompleto()
	{
		return this.apellido1+" "+this.apellido2+" "+this.nombre;
	}
	public String fichaAlumno()
	{
		return nombreCompleto()+" "+" "+this.DNI+" "+notas;
	}
		 
	}

