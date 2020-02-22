package healthcaresystem1.model;

import java.io.Serializable;
import java.util.List;
import java.util.Random;



public class User implements Serializable{
	private int userId;
	private String userName;
	private long phoneNumber;
	private String password;
	private String emailId;
  private List<DiagnosticCenter> centerList;
	public User() {
		super();
}
	public User( int userId, String userName, long phnoneNumber, String emailId) {
		super();
		Random r = new Random();
		
		this.userId = r.nextInt(200);
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.emailId=emailId;
	}

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return password;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}
	 @Override
	  public String toString() {
	   return "User [userId=" + userId + ", userPassword=" + password + ", userName=" + userName
	     + ", centerList=" + centerList + "]";
	  }
	
}

	


