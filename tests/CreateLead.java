package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.Login;

public class CreateLead extends TestNgHooks{
	
	@Test(dataProvider="FetchExcelData")
	public void createLead(String compName,String firstName,String lastName)
	{
		new Login().typeUserName("DemoSalesManager").typePassword("crmsfa").clickLogin()
		.clickCrmsfaLink().clickLeadsTab().clickCreateLeadMenu().typeCompanyName(compName)
		.typeFirstName(firstName).typeLastName(lastName).clickCreateLeadButton()
		.verifyLeadIsCreated();
	}

}
