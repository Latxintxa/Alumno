package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylis {

	public static void main(String[] args) 
	{
		Scanner BLS=new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		
		String nombre;
		boolean continuar=true;
		do
		{
			System.out.println("Introduzca el nombre(0 para acabar): ");
			nombre=BLS.nextLine();
			if(nombre.equals("0"))
			{
				continuar=false;
			}
			else
			{
				a.add(nombre);
			}

		}while(continuar==true);
		System.out.println(a.size());
		for(String item: a)
		{
			System.out.println(item);
		}
	}

}
