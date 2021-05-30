package pages;

import hooks.TestNgHooks;

public class Login extends TestNgHooks {
	
	public Login typeUserName(String userdata)
	{
		type(locateElement("id","username"),userdata);
		return this;
		
	}
	public Login typePassword(String passdata)
	{
		type(locateElement("id","password"),passdata);
		return this;
	}
    
	public Home typePasswordAndEnter(String passdata)
	{
		typeAndEnter(locateElement("id","password"),passdata);
		return new Home();
		
	}
	public Home clickLogin()
	{
	click(locateElement("class","decorativeSubmit"));
	return new Home();
	}
}
