package com.lagou.domain;

/**
 * 简历的实体
 */
public class Jianli {
	private String userId;
	//part1
	private String expectCity;
	private String type;
	private String expectPosition;
	private String expectSalary;
	
	//part2
	private String companyName	;
	private String positionName	;
	private String companyYearStart	;
	private String companyYearEnd ;
	private String companyMonthStart ;
	private String companyMonthEnd ;
	
	//part3
	private String projectName;
	private String thePost;
	private String projectYearStart;
	private String projectYearEnd;
	private String projectMonthStart;
	private String projectMonthEnd;
	private String projectDescription;
	
	//part4
	private String schoolName;
	private String degree;
	private String professionalName;
	private String schoolYearStart;
	private String schoolYearEnd;
	
	//part5
	private String selfDescription;
	
	//part6
	private String workLink;
	private String workDescription;
	public Jianli() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getExpectCity() {
		return expectCity;
	}
	public void setExpectCity(String expectCity) {
		this.expectCity = expectCity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExpectPosition() {
		return expectPosition;
	}
	public void setExpectPosition(String expectPosition) {
		this.expectPosition = expectPosition;
	}
	public String getExpectSalary() {
		return expectSalary;
	}
	public void setExpectSalary(String expectSalary) {
		this.expectSalary = expectSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getCompanyYearStart() {
		return companyYearStart;
	}
	public void setCompanyYearStart(String companyYearStart) {
		this.companyYearStart = companyYearStart;
	}
	public String getCompanyYearEnd() {
		return companyYearEnd;
	}
	public void setCompanyYearEnd(String companyYearEnd) {
		this.companyYearEnd = companyYearEnd;
	}
	public String getCompanyMonthStart() {
		return companyMonthStart;
	}
	public void setCompanyMonthStart(String companyMonthStart) {
		this.companyMonthStart = companyMonthStart;
	}
	public String getCompanyMonthEnd() {
		return companyMonthEnd;
	}
	public void setCompanyMonthEnd(String companyMonthEnd) {
		this.companyMonthEnd = companyMonthEnd;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getThePost() {
		return thePost;
	}
	public void setThePost(String thePost) {
		this.thePost = thePost;
	}
	public String getProjectYearStart() {
		return projectYearStart;
	}
	public void setProjectYearStart(String projectYearStart) {
		this.projectYearStart = projectYearStart;
	}
	public String getProjectYearEnd() {
		return projectYearEnd;
	}
	public void setProjectYearEnd(String projectYearEnd) {
		this.projectYearEnd = projectYearEnd;
	}
	public String getProjectMonthStart() {
		return projectMonthStart;
	}
	public void setProjectMonthStart(String projectMonthStart) {
		this.projectMonthStart = projectMonthStart;
	}
	public String getProjectMonthEnd() {
		return projectMonthEnd;
	}
	public void setProjectMonthEnd(String projectMonthEnd) {
		this.projectMonthEnd = projectMonthEnd;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getProfessionalName() {
		return professionalName;
	}
	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}
	public String getSchoolYearStart() {
		return schoolYearStart;
	}
	public void setSchoolYearStart(String schoolYearStart) {
		this.schoolYearStart = schoolYearStart;
	}
	public String getSchoolYearEnd() {
		return schoolYearEnd;
	}
	public void setSchoolYearEnd(String schoolYearEnd) {
		this.schoolYearEnd = schoolYearEnd;
	}
	public String getSelfDescription() {
		return selfDescription;
	}
	public void setSelfDescription(String selfDescription) {
		this.selfDescription = selfDescription;
	}
	public String getWorkLink() {
		return workLink;
	}
	public void setWorkLink(String workLink) {
		this.workLink = workLink;
	}
	public String getWorkDescription() {
		return workDescription;
	}
	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}
	@Override
	public String toString() {
		return "Jianli [userId=" + userId + ", expectCity=" + expectCity + ", type=" + type + ", expectPosition="
				+ expectPosition + ", expectSalary=" + expectSalary + ", companyName=" + companyName + ", positionName="
				+ positionName + ", companyYearStart=" + companyYearStart + ", companyYearEnd=" + companyYearEnd
				+ ", companyMonthStart=" + companyMonthStart + ", companyMonthEnd=" + companyMonthEnd + ", projectName="
				+ projectName + ", thePost=" + thePost + ", projectYearStart=" + projectYearStart + ", projectYearEnd="
				+ projectYearEnd + ", projectMonthStart=" + projectMonthStart + ", projectMonthEnd=" + projectMonthEnd
				+ ", projectDescription=" + projectDescription + ", schoolName=" + schoolName + ", degree=" + degree
				+ ", professionalName=" + professionalName + ", schoolYearStart=" + schoolYearStart + ", schoolYearEnd="
				+ schoolYearEnd + ", selfDescription=" + selfDescription + ", workLink=" + workLink
				+ ", workDescription=" + workDescription + "]";
	}
	
	
}
