package infoalumnos;

public class menu 
{
	public static void pintamenu(String[] opcion, String titulo)
	{
		int longiraya =(titulo.length()+10);
		System.out.println(titulo);
		for (int i=0; i<longiraya; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i=0; i<opcion.length; i++)
		{
			System.out.println(opcion[i]);
		}
		for (int i=0; i<longiraya; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}
