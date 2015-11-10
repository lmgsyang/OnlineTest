package cn.edu.yuntukeji.pojo;

public class Student {
	private String studentID;      //学生ID
	private String password;       //学生登录密码
	private String studentName;    //学生姓名
	private Integer result;        //学生成绩
	private String sclass;         //学生班级
	public String getStudentID() {
		return studentID;
	}
	public String getPassword() {
		return password;
	}
	public String getStudentName() {
		return studentName;
	}
	public Integer getResult() {
		return result;
	}
	public String getSclass() {
		return sclass;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	

}
