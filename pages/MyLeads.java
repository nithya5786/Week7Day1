package pages;

import hooks.TestNgHooks;

public class MyLeads extends TestNgHooks {
	
	public CreateLead clickCreateLeadMenu() {
		click(locateElement("link", "Create Lead"));
		return new CreateLead();
	}
	
	}


