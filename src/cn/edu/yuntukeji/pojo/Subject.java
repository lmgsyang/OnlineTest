package cn.edu.yuntukeji.pojo;

public class Subject {
	private int subjectID;        //试题ID
	private String subjectTitle;  //试题题目
	private String subjectOptionA;//选项A
	private String subjectOptionB;//B
	private String subjectOptionC;//C
	private String subjectOptionD;//D
	private String subjectAnswer; //试题答案
	private String subjectParse;  //试题分析
	public int getSubjectID() {
		return subjectID;
	}
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public String getSubjectOptionA() {
		return subjectOptionA;
	}
	public String getSubjectOptionB() {
		return subjectOptionB;
	}
	public String getSubjectOptionC() {
		return subjectOptionC;
	}
	public String getSubjectOptionD() {
		return subjectOptionD;
	}
	public String getSubjectAnswer() {
		return subjectAnswer;
	}
	public String getSubjectParse() {
		return subjectParse;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public void setSubjectOptionA(String subjectOptionA) {
		this.subjectOptionA = subjectOptionA;
	}
	public void setSubjectOptionB(String subjectOptionB) {
		this.subjectOptionB = subjectOptionB;
	}
	public void setSubjectOptionC(String subjectOptionC) {
		this.subjectOptionC = subjectOptionC;
	}
	public void setSubjectOptionD(String subjectOptionD) {
		this.subjectOptionD = subjectOptionD;
	}
	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}
	public void setSubjectParse(String subjectParse) {
		this.subjectParse = subjectParse;
	}
	

}
