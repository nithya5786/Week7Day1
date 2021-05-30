package pages;

import hooks.TestNgHooks;

public class Home extends TestNgHooks {
	public Home verifyWelcomePage()
	{
		verifyPartialText(locateElement("tag","h2"),"Welcome");
		return this;
	}

	public Login clickLogout()
	{
		click(locateElement("class","decorativeSubmit"));
		return new Login();
	}
	
	public MyHome clickCrmsfaLink() {
		click(locateElement("link", "CRM/SFA"));
		return new MyHome();
	}
}
