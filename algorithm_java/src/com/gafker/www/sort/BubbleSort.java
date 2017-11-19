package com.gafker.www.sort;


/**
 * 通过两两交换完成排序 从后往前比大小，大的向后移 结果小到大排序 必须执行n-1轮次效率稍差
 * 
 * @author gafker
 *
 */
public class BubbleSort {
	static final int SIZE =10;
	public static void main(String[] args) {
		//simpleStart();
		int[] sortArray =new int[SIZE];
		generatArrayData(sortArray);
		System.out.println("排序前的数组为：\n");
		showArray(sortArray);
		bubbleSort(sortArray);
		System.out.println("排序后的数组为：\n");
		showArray(sortArray);
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
		bubbleSort(a);
	}

	/**
	 * 冒泡排序
	 * 
	 * @param a
	 */
	static void bubbleSort(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			System.out.println("第" + i + "步排序结果:");
			for (int k = 0; k < a.length; k++) {
				System.out.print("\t" + a[k]);
			}
			System.out.println("\n");
		}
	}
}
