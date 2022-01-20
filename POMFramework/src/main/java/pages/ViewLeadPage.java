package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper{
	
	public ViewLeadPage verifyFName(String FName) {
		verifyTextByXpath("//input[@name='submitButton']", FName);
		return this;
	}
	
	public ViewLeadPage verifyTitleOfPage(String Title) {
		verifyTitle(Title);
		return this;
	}
	
	public OpenTapsCRMPage clickEdit() {
		clickByLinkText("Edit");
		return new OpenTapsCRMPage();
	}
	
	public ViewLeadPage confirmChangeName(String firstName) {
		 verifyFName(firstName);
		 return this; 
		}
	 public MyLeadsPage clickDelete() {
		 clickByXpath("//a[text()='Delete']");
		 return new MyLeadsPage();
	 }
	 	  
	 public DuplicateLeadPage clickDuplicateLead() {
		 clickByXpath("//a[text()='Duplicate Lead']");
		 return new DuplicateLeadPage();
	 }
	 public ViewLeadPage confirmDupLeadCapturedLead(String Leadid) {
		 verifyTextContainsById("viewLead_companyName_sp", Leadid);
		 return this;		 
	 } 
	 
	 public FindLeadsPage clickFindLeads() {
		 clickByXpath("//button[text()='Find Leads']");
		 return new FindLeadsPage();
	 }

}
