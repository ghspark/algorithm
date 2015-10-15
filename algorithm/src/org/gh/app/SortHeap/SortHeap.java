package org.gh.app.SortHeap;

public class SortHeap {
	public static int[] sortHeap(int[] array) {
	     buildHeap(array);// ������
	     int n = array.length;
	     int i = 0;
	     for (i = n - 1; i >= 1; i--) {
	          swap(array, 0, i);
	          heapify(array, 0, i);
	     }
	 
	     return array;
	}
	
	private static void swap(int[] arr, int a, int b) {
	      int temp;
	      temp = arr[a];
	      arr[a] = arr[b];
	      arr[b] = temp;
	}
	 
	private static void buildHeap(int[] array) {
	     int n = array.length;// ������Ԫ�صĸ���
	     for (int i = n / 2 - 1; i >= 0; i--)
	          heapify(array, i, n);
	}
	 
	private static void heapify(int[] A, int idx, int max) {
	      int left = 2 * idx + 1;// ���ӵ��±꣨������ڵĻ���
	      int right = 2 * idx + 2;// ���ӵ��±꣨������ڵĻ���
	      int largest = 0;// Ѱ��3���ڵ������ֵ�ڵ���±�
	      if (left < max && A[left] > A[idx])
	            largest = left;
	      else
	            largest = idx;
	      if (right < max && A[right] > A[largest])
	            largest = right;
	            if (largest != idx) {
	                  swap(A, largest, idx);
	                  heapify(A, largest, max);
	            }
	      }
	
	// ���Ѻ�������Ϊ��s��m����ֻ�� s
	// ��Ӧ�Ĺؼ���δ����󶥶Ѷ��壬ͨ������ʹ��s��m����Ϊ�󶥶�=====================================================
	public static void heapAdjust(int[] array, int s, int m) {
	      // ��0�±�Ԫ����Ϊ�ݴ浥Ԫ
	      array[0] = array[s];
	      // �غ��ӽϴ�Ľ������ɸѡ
	      for (int j = 2 * s; j <= m; j *= 2) {
	            // ��֤jΪ�ϴ��ӽ����±꣬j < m ��֤ j+1 <= m ����Խ��
	            if (j < m && array[j] < array[j + 1]) {
	                   j++;
	            }
	            if (!(array[0] < array[j])) {
	                   break;
	            }
	            // ��Sλ��С��Ӧ���ϴ�������
	            array[s] = array[j];
	            // �ϴ��ӵ�ֵ���Sλ�Ľ�Сֵ���������𶥶ѵĲ�ƽ�⣬�ʶ������ڵĶѽ���ɸѡ
	            s = j;
	      }
	      // ��Sλ�ϴ���ֵ���䣻����Sλ�����ƶ���2*s��4*s��������
	      array[s] = array[0];
	}

}
