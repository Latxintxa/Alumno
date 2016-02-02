package Conduccion;

public class Vehiculo 
{
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private int marchamaxima;
	private int marcha;
	private int velocidadmaxima;
	private int velocidad;
	private boolean arrancado;
	
	public  Vehiculo(String marca,String modelo,String color,String matricula,int marchamaxima,int velocidadmaxima)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.color=color;
		this.marchamaxima=marchamaxima;
		this.velocidad=0;
		this.marcha=0;
		this.arrancado=false;
		
	}
	
	
	public  Vehiculo(String marca,String modelo,String matricula,int marchamaxima,int velocidadmaxima)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.color="";
		this.marchamaxima=marchamaxima;
		this.velocidad=0;
		this.marcha=0;
		this.arrancado=false;
		
	}


	public String getMarca() {
		return marca;
	}




	public String getModelo() {
		return modelo;
	}





	public String getColor() {
		return color;
	}


	public void Pinta(String color) {
		this.color = color;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getMarchamaxima() {
		return marchamaxima;
	}




	public int getMarcha() {
		return marcha;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}


	public int getVelocidadmaxima() {
		return velocidadmaxima;
	}




	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public boolean isArrancado() {
		return arrancado;
	}


	public void StarStop()
	{
		if(this.arrancado==true&&this.marcha==0)
		{
			this.arrancado=false;
		}
		else
		{
			this.arrancado=true;
		}
	}
	
	public void subirMarcha()
	{
		if(this.marcha<this.marchamaxima)
		{
		this.marcha++;
		}
	}
	
	
}
