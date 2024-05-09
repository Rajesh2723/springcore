package com.springcore;

import java.util.List;

public class student {
		private int studentId;
		private String  studentName;
		private String studentAddress;
		private List<String>Students;
		public student(int studentId, String studentName, String studentAddress, List<String> students) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentAddress = studentAddress;
			Students = students;
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
		public String getStudentAddress() {
			return studentAddress;
		}
		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}
		public List<String> getStudents() {
			return Students;
		}
		public void setStudents(List<String> students) {
			Students = students;
		}
		public student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
					+ studentAddress + ", Students=" + Students + "]";
		}
		
		
		 
		
		
}	
