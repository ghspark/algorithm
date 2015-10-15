package org.gh.app.sortshell;

public class SortShell {
	
	public static int[] sortShell(int[] array) {
	     // ȡ����
	     int step = array.length / 2;
	     while (step >= 1) {
	          for (int i = step; i < array.length; i++) {
	               int temp = array[i];
	               int j = 0;
	               // ����������������������
	               for (j = i - step; j >= 0 && temp < array[j]; j -= step) {
	                     array[j + step] = array[j];
	               }
	               array[j + step] = temp;
	          }
	          step /= 2;
	     }
	     return array;
	}

}
