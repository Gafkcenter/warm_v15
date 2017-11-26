package com.gafker.www.sortlist.comparable;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 实例化Comparable
 * @author gafker
 *
 */
public class MainRun_b {
	public static void main(String[] args) {
		ArrayList<Student_b> list = mockStudent_bList();
		// 这里就会自动根据规则进行排序
		Collections.sort(list);for(
		int i = 0;i<list.size();i++)
		{
			Student_b stu = list.get(i);
			System.out.println("年龄:" + stu.getAge() + "   姓名:" + stu.getStudentName() + "   学号:" + stu.getStudentId());
		}
	}


private static ArrayList<Student_b> mockStudent_bList() {
	Student_b stu1 = new Student_b(1, "zhangsan", 28);
	Student_b stu2 = new Student_b(2, "zhagnsan", 19);
	Student_b stu3 = new Student_b(3, "wangwu", 19);
	Student_b stu4 = new Student_b(4, "wangwu", 19);
	Student_b stu5 = new Student_b(5, "zhaoliu", 18);
	Student_b stu6 = new Student_b(6, "zhaoliu", 8);
	ArrayList<Student_b> list = new ArrayList<Student_b>();
	list.add(stu1);
	list.add(stu2);
	list.add(stu3);
	list.add(stu4);
	list.add(stu5);
	list.add(stu6);
	return list;
}

}
