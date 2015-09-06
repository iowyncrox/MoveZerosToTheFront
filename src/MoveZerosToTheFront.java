import java.util.Arrays;

public class MoveZerosToTheFront {

	public static int[] moveZeroToTheFront(int[] array) {
		int count = array.length - 1;

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[count--] = array[i];
			}
		}

		while (count >= 0) {
			array[count--] = 0;
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = { 3, 0, 1, 4, 8, 9, 0, 10, 0, 42, 0 };
		array = moveZeroToTheFront(array);
		System.out.println(Arrays.toString(array));
	}
}