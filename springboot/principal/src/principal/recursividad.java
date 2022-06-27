package principal;

import java.util.ArrayList;

public class recursividad {
	public static void main(String[] args) {
		/*
		 * Creamos un ArrayList String (que puede ser de cualquier tipo) 
		 */
		ArrayList<String> tecnologies = new ArrayList<>();
		// Le agregamos datos

		tecnologies.add("Markdown");
		tecnologies.add("Regexp");
		tecnologies.add("HTML");
		tecnologies.add("CSS");
		tecnologies.add("JS");
		tecnologies.add("SQL");
		tecnologies.add("Java");
		
		for (int x = 0; x < tecnologies.size()-4; x++) {
			String show = tecnologies.get(x);
			System.out.println(show);
		}
		
	}
}