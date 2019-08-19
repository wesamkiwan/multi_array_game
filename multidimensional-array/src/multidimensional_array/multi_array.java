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
	//=============================================================
		boolean accepted_r=false;
	

	while (accepted_r==false) {
		if (row_guessing>(row-1)) {
			System.out.println("you should give an integer number between 0 and "+(row-1));
			System.out.println("give a new value for please:");
			row_guessing=input.nextInt();
		}
		else {
			accepted_r=true;
			
		}
	//=============================================================
	//guessing.test(row_guessing, row-1);

	System.out.print("column: ");
	int column_guessing=input.nextInt();
	//=============================================================
			boolean accepted_c=false;
		

		while (accepted_c==false) {
			if (column_guessing>(column-1)) {
				System.out.println("you should give an integer number between 0 and "+(column-1));
				System.out.println("give a new value for please:");
				column_guessing=input.nextInt();
			}
			else {
				accepted_c=true;
				
			}
		//=============================================================
	//guessing.test(column_guessing, column-1);
	
	
	System.out.println("you have choosen the position ["+row_guessing+","+column_guessing+"]");
	
	Check_position.check(array1, row_guessing, column_guessing);
	
	}
}
}
}


