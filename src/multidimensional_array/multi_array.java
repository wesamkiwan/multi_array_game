package multidimensional_array;
import java.util.Scanner;
public class multi_array {
	
	
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.print("insert the number of rows: ");
	int row=input.nextInt();
	System.out.print("insert the number of columns: ");
	int column=input.nextInt();
	System.out.println("================================");
	System.out.println("Here is your created array "+"["+ row+"*"+column+"]");
	System.out.println("================================");
	int array1[][]=new int[row][column];
	randomization.rando(array1);
	Display.display(array1);
		
	System.out.println("guess a position:");
	
	System.out.print("row: ");
	int row_guessing=input.nextInt();
	guessing.test(row_guessing, row-1);

	System.out.print("column: ");
	int column_guessing=input.nextInt();
	guessing.test(column_guessing, column-1);
	
	
	System.out.println("you have choosen the position ["+row_guessing+","+column_guessing+"]");
	
	Check_position.check(array1, row_guessing, column_guessing);
	
	}
}


