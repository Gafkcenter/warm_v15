package com.gafker.www.sortlist.comparable;

public class Student_b implements Comparable<Student_b> {
	private int studentId;
	private String studentName;
	private int age;

	public Student_b(int studentId, String studentName, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Student_b o) {
		if(age!=o.getAge()){
            return age-o.getAge();
        }else if(!studentName.equals(o.getStudentName())){
            return studentName.compareTo(o.getStudentName());
        }else {
            return studentId-o.getStudentId();
        }
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student_b) {
			Student_b stu = (Student_b) obj;
			if (age == stu.getAge() && studentName.equals(stu.getStudentName()) && studentId == stu.getStudentId()) {
				return true;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
