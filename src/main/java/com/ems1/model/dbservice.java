package com.ems1.model;

public interface dbservice {
	public void dbconnect();
	public boolean verifyLogin(String email, String password);

}
