package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("my.data")
public class InputDataLoading implements CommandLineRunner {
	private int sid;
	private String sname;
	private double sfee;
	private List<String> prjs;
	private Map<String,String> dept;
	


	public InputDataLoading() {
		super();
	}



	@Override
	public String toString() {
		return "InputDataLoading [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", prjs=" + prjs + ", dept="
				+ dept + "]";
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public double getSfee() {
		return sfee;
	}



	public void setSfee(double sfee) {
		this.sfee = sfee;
	}



	public List<String> getPrjs() {
		return prjs;
	}



	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}



	public Map<String, String> getDept() {
		return dept;
	}



	public void setDept(Map<String, String> dept) {
		this.dept = dept;
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
