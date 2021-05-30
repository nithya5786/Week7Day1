package pages;

import hooks.TestNgHooks;

public class ViewLead extends TestNgHooks{
	
	public ViewLead verifyLeadIsCreated() {
		verifyPartialTitle("View Lead");
		return this;
	}

}
