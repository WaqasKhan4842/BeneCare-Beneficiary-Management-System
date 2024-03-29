package BusinessLogicServices;
import DataAcces.Applications;
public class Application_Record {
	private DataAcces.Applications dataAccessObject;
	
	public Application_Record()
	{
		this.dataAccessObject =  new  DataAcces.Applications();
		
	}
	public void Submit_Applications(int ID)
	{
		UserSession userSession = UserSession.getInstance();
	     String userEmail = userSession.getUserEmail();
	     dataAccessObject.add_application(userEmail, ID);
	     
	     
		
	}

}
