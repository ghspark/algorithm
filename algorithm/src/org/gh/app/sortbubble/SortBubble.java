package org.gh.app.sortbubble;

public class SortBubble {
	
	public static int[] sortBubble(int[] array){
	     int temp;
	     // ��һ��ѭ��:�����ȽϵĴ���, ���� length ��Ԫ��,�Ƚϴ���Ϊ length-1 �Σ��϶�������Լ��ȣ�
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
