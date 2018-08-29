package assignmentPlivo;

public class DragAndDropUI extends Methods{

	public static void main(String[] args) {
		try {
			
		//1: LAUNCH UI AND NAVIGATE TO URL
		loginUI();
		
		//2. CLICK ON CREATE APP BUTTON
		createApp();
		
		//3. CLICK ON GET STARTED
		clickGetStarted();
		
		//4. ADD PAGE
		addPage();
		
		//5. OPEN MESSAGING TAB
		clickTabs(getLOC_MESSAGE_TAB(), getLOC_LIST_SENDSMS());
		
		//6. DRAG AND DROP SEND SMS TILE
		dragAndDropTiles(getLOC_LIST_SENDSMS(),getLOC_SMS_X(),getLOC_SMS_Y());
		
		//7. LINK START WITH SMS
		linkNodeReceptorStart(getLOC_SMS_TOARROW(),getLOC_RECEPTOR_CONNECT());
		
		//8. ENTER SMS DETAILS
		enterSMSDetails();
		
		//9. DRAG AND DROP SEND EMAIL TILE
		dragAndDropTiles(getLOC_LIST_SENDEMAIL(), getLOC_EMAIL_X(), getLOC_EMAIL_Y());
		Thread.sleep(1000);
		
		//10. LINK SMS NOT SENT WITH SEND AN EMAIL
		linkNodeReceptor(getLOC_NOTSENT(),getLOC_RECEPTOR_CONNECT());
		
		//11. ENTER EMAIL DETAILS
		enterEmailDetails();
		
		//12. CLICK ON BASIC TAB
		clickTabs(getLOC_TAB_BASIC(), getLOC_HANG_UP());
		
		//13. DRAG AND DROP HANG UP TILE
		dragAndDropTiles(getLOC_HANG_UP(), getLOC_HANGUP_X_SMSSENT(), getLOC_HANGUP_Y_SMSSENT());
		Thread.sleep(1000);
		
		//14. LINK SMS SENT WITH HANG UP
		linkNodeReceptor(getLOC_SENT(),getLOC_RECEPTOR_CONNECT());
		
		//15. DRAG AND DROP HANG UP TILE
		dragAndDropTiles(getLOC_HANG_UP(), getLOC_HANGUP_X_EMAILSENT(), getLOC_HANGUP_Y_EMAILSENT());
		Thread.sleep(1000);
		
		//16. LINK EMAIL SENT WITH HANGUP
		linkNodeReceptor(getLOC_SENT(),getLOC_RECEPTOR_CONNECT());
		
		//17. DRAG AND DROP HANG UP TILE
		dragAndDropTiles(getLOC_HANG_UP(), getLOC_HANGUP_X_EMAILNTSENT(), getLOC_HANGUP_Y_EMAILNTSENT());
		Thread.sleep(1000);
		
		//18. LINK SMS NOT SENT WITH HANG UP
		linkNodeReceptor(getLOC_NOTSENT(),getLOC_RECEPTOR_CONNECT());
		Thread.sleep(1000);
		
		//CLOSE THE DRIVER
		closeDriver();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
