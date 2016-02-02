package Ejercicio;

public class Pato 
{
	private int posicion;
	
	public int getPosicion()
	{
		return posicion;
	}

	public void setPosicion(int posicion) {
		
		this.posicion = posicion;
	}

	public Pato(int posicion)
	{
		this.posicion=posicion;
	}
	
	public Pato()
	{
		this.posicion=0;
	}

	public int AndarHaciaDelante(int pasos)
	{
		return this.posicion+=pasos;
	}
	
	public int AndarHaciaAtras(int pasos)
	{
		return this.posicion-=pasos;
	}
	
	public int PosicionFinal()
	{
		return this.posicion;
	}
}
