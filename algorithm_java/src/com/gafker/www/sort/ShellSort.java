package com.gafker.www.sort;


/**
 * 希尔排序:相对冒泡,选择,插入,排序较高效
 * 基于插入排序的思想
 * 分组排序(折半分组)-完整遍历完一组为一轮
 * 遇到组中有小的会连续跨组向前调换,直到行首(whiles)
 * 
 * @author gafker
 *
 */
public class ShellSort {
	static final int SIZE =10;
	public static void main(String[] args) {
		//simpleStart();
		int[] sortArray =new int[SIZE];
		generatArrayData(sortArray);
		System.out.println("排序前的数组为：\n");
		showArray(sortArray);
		shellSort(sortArray);
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
		shellSort(a);
	}

	/**
	 * 希尔排序
	 * 1.每轮计算一次组大小r
	 * 2.后半组的下标值i的初始值=r,每轮(执行1)变化一次初始值
	 * 3.记录后半组起始值temp=a[i]
	 * 4.通过i和r的值计算前半组index j=i-r(i范围为后半组起始长度到数组长度)
	 * @param a
	 */
	static void shellSort(int[] a) {
		int i = 0,j = 0,h = 0;//j,前半组起始index(1.比较两分组间前初始值j=i-r;2.),i后台半组起始index,h结果显示index,temp存放后半组当前值,x当前轮．
		int r = 0,temp = 0;//r 对半后每小组的元素数量，temp:保存后半组当前的元素值
		int x=0;
		System.out.println("setp 有"+a.length+"个样本数\t i后半组起始index\t j前半组起始index\t h结果显示index\t r二分遍历轮数\t temp交换临时变量\t x轮数");
		for(r=a.length/2;r>=1;r/=2){//每组成员数或组步长
			for (i = r; i < a.length; i++) {// 插入排序,从后半组的第一个值一直循环到数组长度为止,即完成一次完整组排序。
				temp = a[i];// 后半组当前位置起始值放入到缓存temp
				j = i - r;// first_index前半组当前位置index(j)
				while (j >= 0 && temp < a[j]) {// 后半组值temp<前半组值a[j]时执行与前半组值交换
					a[j + r] = a[j];// 前面值放入后面位置a[5]=a[0]
					j -= r;// 变成了负数(分组变动步长) j=0-5=-5
	//				 showIndexLog(i, j, h, r, temp, x,"Exchange",false);
				}
				a[j + r] = temp;//a[-5+5]=a[0]=temp=a[5](while没有执行时做一次自交换)
	//			showIndexLog(i, j, h, r, temp, x,"Post_Group结束单轮",false);
			}
			x++;
			System.out.println("第" + x + "步排序结果:");
			for (h = 0; h < a.length; h++) {
				System.out.print("\t" + a[h]);
			}
			System.out.println("\n");
		}
	}

	private static void showIndexLog(int i, int j, int h, int r, int temp, int x,String step,Boolean b) {
		if(b){
			System.out.println(step+":第"+i+"轮\t"+i+"\t"+j+"\t"+h+"\t"+r+"\t"+temp+"\t"+x);
		}else{
			System.out.println(step+"\t"+i+"\t"+j+"\t"+h+"\t"+r+"\t"+temp+"\t"+x);
		}
		
	}
}
