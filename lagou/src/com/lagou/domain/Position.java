package com.lagou.domain;

public class Position {
	private String postionId;
	private String positionType;
	private String positionName;
	private String department;
	private String jobNature;
	private Integer salaryMin;
	private Integer salaryMax;
	private String workAddress;
	private String experience;
	private String education;
	private String positionAdvantage;
	private String positionDetail;
	private String positionAddress;
	private String forwardEmail;
	private String userId;
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Position(String postionId, String positionType, String positionName, String department, String jobNature,
			Integer salaryMin, Integer salaryMax, String workAddress, String experience, String education,
			String positionAdvantage, String positionDetail, String positionAddress, String forwardEmail,
			String userId) {
		super();
		this.postionId = postionId;
		this.positionType = positionType;
		this.positionName = positionName;
		this.department = department;
		this.jobNature = jobNature;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.workAddress = workAddress;
		this.experience = experience;
		this.education = education;
		this.positionAdvantage = positionAdvantage;
		this.positionDetail = positionDetail;
		this.positionAddress = positionAddress;
		this.forwardEmail = forwardEmail;
		this.userId = userId;
	}

	
	public String getPostionId() {
		return postionId;
	}

	public void setPostionId(String postionId) {
		this.postionId = postionId;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobNature() {
		return jobNature;
	}

	public void setJobNature(String jobNature) {
		this.jobNature = jobNature;
	}

	public Integer getSalaryMin() {
		return salaryMin;
	}

	public void setSalaryMin(Integer salaryMin) {
		this.salaryMin = salaryMin;
	}

	public Integer getSalaryMax() {
		return salaryMax;
	}

	public void setSalaryMax(Integer salaryMax) {
		this.salaryMax = salaryMax;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPositionAdvantage() {
		return positionAdvantage;
	}

	public void setPositionAdvantage(String positionAdvantage) {
		this.positionAdvantage = positionAdvantage;
	}

	public String getPositionDetail() {
		return positionDetail;
	}

	public void setPositionDetail(String positionDetail) {
		this.positionDetail = positionDetail;
	}

	public String getPositionAddress() {
		return positionAddress;
	}

	public void setPositionAddress(String positionAddress) {
		this.positionAddress = positionAddress;
	}

	public String getForwardEmail() {
		return forwardEmail;
	}

	public void setForwardEmail(String forwardEmail) {
		this.forwardEmail = forwardEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Position [postionId=" + postionId + ", positionType=" + positionType + ", positionName=" + positionName
				+ ", department=" + department + ", jobNature=" + jobNature + ", salaryMin=" + salaryMin
				+ ", salaryMax=" + salaryMax + ", workAddress=" + workAddress + ", experience=" + experience
				+ ", education=" + education + ", positionAdvantage=" + positionAdvantage + ", positionDetail="
				+ positionDetail + ", positionAddress=" + positionAddress + ", forwardEmail=" + forwardEmail
				+ ", userId=" + userId + "]";
	}
	
	
	
//	positionType,positionName,department,jobNature,salaryMin,salaryMax,workAddress,
//	experience,education,positionAdvantage,positionDetail	positionAddress		forwardEmail
}
