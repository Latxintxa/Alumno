package Ejercicio;
import java.util.Scanner;

import Ejercicio.Pato;
public class Main {

	public static void main(String[] args) 
	{
		Scanner BLS=new Scanner(System.in);
		Pato p=new Pato();
		int pasos;

		do
		{
		System.out.println("¿Cuantos pasos va a dar el pato?");
		System.out.println("Si introduce 0 el programa terminara");
		pasos=BLS.nextInt();
		if(pasos>0)
		{ 
			p.AndarHaciaDelante(pasos);
		}
		else if(pasos<0)
		{
			p.AndarHaciaAtras(pasos);
		}
		
		}while(!(pasos==0));
		
		System.out.println("el pato esta en la posicion"+p.PosicionFinal());
		
		

	}

}
