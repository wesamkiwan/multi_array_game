package multidimensional_array;

public class Compare {
	static int a;
	static int b;
	String y[][]=new String [a][b];
	public static void compare(int x[][], String y[][]) {
		if (x[a][b] ==1) {
			y[a][b]="O";
		}
		else {
			y[a][b]="X";
		}	
	}
}
