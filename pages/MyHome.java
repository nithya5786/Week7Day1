package pages;

import hooks.TestNgHooks;

public class MyHome extends TestNgHooks {
	public MyLeads clickLeadsTab() {
		click(locateElement("link", "Leads"));
		return new MyLeads();
	}

}
