package com.gafker.www.sort;


/**
 * 将当前未排序的插入到前面已经排过序的正确位置
 * 
 * @author gafker
 *
 */
public class InsertSort {
	static final int SIZE =10;
	public static void main(String[] args) {
		//insertStart();
		int[] sortArray =new int[SIZE];
		generatArrayData(sortArray);
		System.out.println("排序前的数组为：\n");
		showArray(sortArray);
		insertSort(sortArray);
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

	private static void insertStart() {
		int[] a = { 100, 3, 80, 20, 45, 68, 30 };
		//1.start
		insertSort(a);
	}

	/**
	 * 插入排序
	 * 
	 * @param a
	 */
	static void insertSort(int[] a) {
		int i,j,temp,h;
		for (i = 1; i < a.length; i++) {
			temp = a[i];
			j=i-1;
			while(j>=0 && temp<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			System.out.println("第" + i + "步排序结果:");
			for (int k = 0; k < a.length; k++) {
				System.out.print("\t" + a[k]);
			}
			System.out.println("\n");
		}
	}
}
