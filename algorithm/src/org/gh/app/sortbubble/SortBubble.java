package org.gh.app.sortbubble;

public class SortBubble {
	
	public static int[] sortBubble(int[] array){
	     int temp;
	     // 第一层循环:表明比较的次数, 比如 length 个元素,比较次数为 length-1 次（肯定不需和自己比）
	     for(int i=0;i<array.length-1;i++){
	          for (int j = array.length - 1; j > i; j--) {
	                if (array[j] < array[j - 1]) {
	                     temp = array[j];
	                     array[j] = array[j - 1];
	                     array[j - 1] = temp;
	                }
	          }
	     }
	     return array;
	}

}
