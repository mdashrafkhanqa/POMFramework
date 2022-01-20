package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper {
	
	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
		
	}
	
	public CreateLeadPage enterFname(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}
	
	public CreateLeadPage enterLname(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		clickByName("submitButton");
		return new ViewLeadPage();
	}

}
