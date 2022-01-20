package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper{
	
	public LoginPage enterUserName(String uName) {
		
		enterById("username", uName);
		return this; //return this means 
	}
	
	public LoginPage enterPassword(String pwd) {
		
		enterById("password", pwd);
		return this;
	}
	
	public HomePage ClickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}

}
