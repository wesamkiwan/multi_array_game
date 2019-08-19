package multidimensional_array;

public class Display {
	
	public static void display(int[][] myArray) {
		for (int i=0;i<myArray.length;i++) {
			for (int j=0;j<myArray[i].length;j++) {
			System.out.print(myArray[i][j]+ " ");
			}
			System.out.println(" ");

		}
		}


}
