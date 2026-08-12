package com.oops.Encapsulation;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	public String toString() {
		return "Employee :[Employee id:"+eid
				           +",Employee name:"+ename
				           +",Employee salary:"+esal
				           +"]";
	}
	public Employee() {
		System.out.println("no arg constructor");
	}
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	

}
