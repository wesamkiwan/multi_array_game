package multidimensional_array;

public class Check_position {
	
	public static void check (int array[][],int x,int y) {
		int score=0;
		if (array[x][y]==1) {
			score++;
			System.out.println("good hit!!");
			System.out.println("your score is: "+score);
		}
		else {
			System.out.println("oh-oh!! Missed");
			System.out.println("try again");

		}
	}

}
