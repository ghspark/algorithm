package org.gh.app.sortquick;

public class SortQuick {

	public static int[] sortQuick(int[] array){
	     return quickSort(array, 0, array.length-1);
	}
	 
	public static int[] quickSort(int[] arr, int low, int heigh) {
	      if (low < heigh) {
	           int division = partition(arr, low, heigh);
	           quickSort(arr, low, division - 1);
	           quickSort(arr, division + 1, heigh);
	      }
	      return arr;
	}
	 
	// 分水岭,基位,左边的都比这个位置小,右边的都大
	private static int partition(int[] arr, int low, int heigh) {
	      int base = arr[low]; //用子表的第一个记录做枢轴(分水岭)记录
	      while (low < heigh) { //从表的两端交替向中间扫描
	            while (low < heigh && arr[heigh] >= base) {
	                 heigh--;
	            }
	            // base 赋值给 当前 heigh 位,base 挪到(互换)到了这里,heigh位右边的都比base大
	            swap(arr, heigh, low);
	            while (low < heigh && arr[low] <= base) {
	                  low++;
	            }
	            // 遇到左边比base值大的了,换位置
	            swap(arr, heigh, low);
	      }
	      // now low = heigh;
	      return low;
	}
	 
	private static void swap(int[] arr, int a, int b) {
	      int temp;
	      temp = arr[a];
	      arr[a] = arr[b];
	      arr[b] = temp;
	}
	
}
