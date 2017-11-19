package com.gafker.www.sort;

/**
 * 每轮找出最小与当前轮index位置交换
 * 
 * @author gafker
 *
 */
public class SeletionSort {
	static final int SIZE =10;
	public static void main(String[] args) {
		//simpleStart();
		int[] sortArray =new int[SIZE];
		generatArrayData(sortArray);
		System.out.println("排序前的数组为：\n");
		showArray(sortArray);
		selectionSort(sortArray);
		System.out.println("排序后的数组为：\n");
		showArray(sortArray);
	}
	static void selectionSort(int[] a) {
		int index;
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			if (index != i) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			
			System.out.println("第" + i + "步排序结果:");
			for (int k = 0; k < a.length; k++) {
				System.out.print("\t" + a[k]);
			}
			System.out.println("\n");
		}

	}
	
	private static void generatArrayData(int[] sortArray) {
		int i ;
		for(i=0;i<SIZE;i++){
			sortArray[i]=(int)(100+Math.random()*(100+1));
		}
	}

	private static void showArray(int[] sortArray) {
		int i;
		for(i=0;i<SIZE;i++){
			System.out.print(sortArray[i]+"\t");
		}
		System.out.println("\n");
	}
	private static void simpleStart() {
		int[] a = { 100, 3, 80, 20, 45, 68, 30 };
		//1.start
		selectionSort(a);
	}
}
