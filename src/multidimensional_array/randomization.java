package multidimensional_array;

import java.util.Random;

public class randomization {

	public static void rando(int[][] array) {
		for (int f=0; f<array.length; f++) {
		int rand1 = new Random().nextInt(array.length);
		int rand2 = new Random().nextInt(array[f].length);
		array[rand1][rand2]=1;
	}

}
}
