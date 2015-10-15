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
	 
	// ��ˮ��,��λ,��ߵĶ������λ��С,�ұߵĶ���
	private static int partition(int[] arr, int low, int heigh) {
	      int base = arr[low]; //���ӱ�ĵ�һ����¼������(��ˮ��)��¼
	      while (low < heigh) { //�ӱ�����˽������м�ɨ��
	            while (low < heigh && arr[heigh] >= base) {
	                 heigh--;
	            }
	            // base ��ֵ�� ��ǰ heigh λ,base Ų��(����)��������,heighλ�ұߵĶ���base��
	            swap(arr, heigh, low);
	            while (low < heigh && arr[low] <= base) {
	                  low++;
	            }
	            // ������߱�baseֵ�����,��λ��
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
