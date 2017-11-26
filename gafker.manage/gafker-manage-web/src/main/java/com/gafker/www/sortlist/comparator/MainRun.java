package com.gafker.www.sortlist.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 实例化比较器Comparator
 * @author gafker
 *
 */
public class MainRun {
	public static void main(String[] args) {
		//学生排序器
		Comparator<Student> comparator = new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				// 按年龄排序
				if (o1.getAge() != o2.getAge()) {
					return o1.getAge() - o2.getAge();
				} else if (o1.getStudentName() != o2.getStudentName()) {
					// 年龄相同按姓名排序
					return o1.getStudentName().compareTo(o2.getStudentName());
				} else {
					// 姓名相同按学号排序
					return o1.getStudentId() - o2.getStudentId();
				}
			}
		};

		ArrayList<Student> list = mockStudentList();
		// 这里就会自动根据规则进行排序
		Collections.sort(list, comparator);
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println("年龄:" + stu.getAge() + "   姓名:" + stu.getStudentName() + "   学号:" + stu.getStudentId());
		}

	}

	private static ArrayList<Student> mockStudentList() {
		Student stu1 = new Student(1, "zhangsan", 28);
		Student stu2 = new Student(2, "zhagnsan", 19);
		Student stu3 = new Student(3, "wangwu", 19);
		Student stu4 = new Student(4, "wangwu", 19);
		Student stu5 = new Student(5, "zhaoliu", 18);
		Student stu6 = new Student(6, "zhaoliu", 8);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		list.add(stu6);
		return list;
	}

}
