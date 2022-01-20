package pages;

import wrapper.ProjectSpecificWrapper;

public class MergeLeadsPage extends ProjectSpecificWrapper {
	
	public FindLeadsPage clickIconNearFormLead() {
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeadsPage();
	}
	public FindLeadsPage ClickIconNearToLead() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadsPage();
	}
	public ViewLeadPage clickMerge() {
		clickByXpath("//a[text()='Merge']");
		acceptAlert();
		return new ViewLeadPage();
	}

}
