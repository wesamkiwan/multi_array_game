package multidimensional_array;
import java.util.Scanner;
public class multi_array {
  public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.print("insert the number of rows: ");
	int row=input.nextInt();
	System.out.print("insert the number of columns: ");
	int column=input.nextInt();
	System.out.println("======================================");
	System.out.println("Here is your created array "+"["+ row+"*"+column+"]");
	System.out.println("======================================");
	int array1[][]=new int[row][column];
	randomization.rando(array1);
	Display.display(array1);
	System.out.println("======================================");
	//String tracking[][]=new String[row][column];
	//Display.displaystr(tracking);
	System.out.println("guess a position:");
	System.out.print("row: ");
	int row_guessing=input.nextInt();
	//=============================================================
		boolean accepted_r=false;
	while (accepted_r==false) {
		if ((row_guessing)>row || (row_guessing)==0)  {
			System.out.println("you should give an integer number between 1 and "+(row));
			System.out.print("give a new value for please:");
			row_guessing=input.nextInt();
		}
		else {
			accepted_r=true;
			}
	}
	//=============================================================
	System.out.print("column: ");
	int column_guessing=input.nextInt();
	//=============================================================
		boolean accepted_c=false;
	while (accepted_c==false) {
		if ((column_guessing)>column || (column_guessing)==0) {
			System.out.println("you should give an integer number between 1 and "+(column));
			System.out.print("give a new value for please:");
			column_guessing=input.nextInt();
		}
		else {
				accepted_c=true;
	   		}
	}
	//=============================================================
	System.out.println("you have chosen the position ["+row_guessing+","+column_guessing+"]");
	Check_position.check(array1, row_guessing-1, column_guessing-1);
	String tracking[][]=new String[row][column];
	Compare.compare(array1,tracking);
	Display.displaystr(tracking);

  }
  
}