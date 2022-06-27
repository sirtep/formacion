package principal;

public class supercalifragi {
	public static void main(String[] args) {
		String str = "supercalifragilisticoespialidoso";
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
	}
}