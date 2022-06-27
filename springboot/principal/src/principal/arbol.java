package principal;

public class arbol
{
	public static void main(String args[])
	{
		int max=20;
		int j=1,k=0;
 
		// Árbol
 		System.out.println();
		for(int i=0;i<=max;i+=2)
		{
			int spc=(5+(int)Math.ceil(max/2)-j);
			String spaces=new String(new char[spc]).replace("\0"," ");
			String asteri=new String(new char[i+1]).replace("\0","*");
			System.out.println(spaces+asteri);
			j++;
		}
 
		// Tronco
		if(max>=7)
		{
			int spc=(5+(int)Math.ceil(max/2)-2);
			String spaces=new String(new char[spc]).replace("\0"," ");
			String asteri=new String(new char[3]).replace("\0","*");
			System.out.println(spaces+asteri);
			System.out.println(spaces+asteri);
		}
		System.out.println();
 
	}
}
