package org.gh.app.sortinsert;

public class SortInsert {
	/**
	 * ²åÈëÅÅĞòËã·¨
	 * @param array
	 * @return
	 */

	public static int[] sortInsert(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}

			array[j + 1] = temp;
		}

		return array;
	}

}
