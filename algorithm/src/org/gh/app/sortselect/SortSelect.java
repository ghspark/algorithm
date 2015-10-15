package org.gh.app.sortselect;

public class SortSelect {
	
	public static int[] sortSelect(int[] arr){
	      for (int i = 0; i < arr.length; i++) {
	            int miniPost = i;
	            for (int m = i + 1; m < arr.length; m++) {
	                  if (arr[m] < arr[miniPost]) {
	                        miniPost = m;
	                  }
	            }
	 
	            if (arr[i] > arr[miniPost]) {
	                  int temp;
	                  temp = arr[i];
	                  arr[i] = arr[miniPost];
	                  arr[miniPost] = temp;
	           }
	      }
	      return arr;
	 }

}
