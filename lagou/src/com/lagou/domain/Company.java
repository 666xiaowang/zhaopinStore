package com.lagou.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Company {
	
	private String companyId;
	private	String companyname;
	private String jobname;
	private	String domain;
	private	String leader;
	private	String stage;
	private	String guimo;
	private	String companytag;
	private	String advertisejob;
	private	String city;
	private	String monthsal;
	private	String workexperience;
	private	String mindegree;
	private	String workallure;
	private	String issuedate;
	private	Integer companyType;
	
	private List<String >companyTagList;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company(String companyId, String companyname, String jobname, String domain, String leader, String stage,
			String guimo, String companytag, String advertisejob, String city, String monthsal, String workexperience,
			String mindegree, String workallure, String issuedate, Integer companyType, List<String> companyTagList) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.jobname = jobname;
		this.domain = domain;
		this.leader = leader;
		this.stage = stage;
		this.guimo = guimo;
		this.companytag = companytag;
		this.advertisejob = advertisejob;
		this.city = city;
		this.monthsal = monthsal;
		this.workexperience = workexperience;
		this.mindegree = mindegree;
		this.workallure = workallure;
		this.issuedate = issuedate;
		this.companyType = companyType;
		this.companyTagList = companyTagList;
	}

	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}



	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getGuimo() {
		return guimo;
	}
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	public String getCompanytag() {
		return companytag;
	}
	
	
	/*
	 * 把字符串转换处理后,存储到list中
	 */
	public void setCompanytag(String companytag) {
		this.companytag = companytag;
		companyTagList = new ArrayList<String>();
		if(companytag.indexOf("+") != 0) {
			//说明有多个标签
			StringTokenizer strArray = new StringTokenizer(companytag,"+");
			//companyTagList = new ArrayList<String>();
			while (strArray.hasMoreElements()) {
				companyTagList.add((String) strArray.nextElement());
			}
		}
		this.setCompanyTagList(companyTagList);
	}
	public String getAdvertisejob() {
		return advertisejob;
	}
	public void setAdvertisejob(String advertisejob) {
		this.advertisejob = advertisejob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMonthsal() {
		return monthsal;
	}
	public void setMonthsal(String monthsal) {
		this.monthsal = monthsal;
	}
	public String getWorkexperience() {
		return workexperience;
	}
	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}
	public String getMindegree() {
		return mindegree;
	}
	public void setMindegree(String mindegree) {
		this.mindegree = mindegree;
	}
	public String getWorkallure() {
		return workallure;
	}
	public void setWorkallure(String workallure) {
		this.workallure = workallure;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public Integer getCompanyType() {
		return companyType;
	}
	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}
	
	
	
	/*
	 *工具方法,将companyTag中的字符串解析后放入到list中 
	 */
	public List<String> getCompanyTagList() {
		return companyTagList;
	}
	public void setCompanyTagList(List<String> companyTagList) {
		this.companyTagList = companyTagList;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyname=" + companyname + ", domain=" + domain + ", leader="
				+ leader + ", stage=" + stage + ", guimo=" + guimo + ", companytag=" + companytag + ", advertisejob="
				+ advertisejob + ", city=" + city + ", monthsal=" + monthsal + ", workexperience=" + workexperience
				+ ", mindegree=" + mindegree + ", workallure=" + workallure + ", issuedate=" + issuedate
				+ ", companyType=" + companyType + ", companyTagList=" + companyTagList + "]";
	}

	
	
}
