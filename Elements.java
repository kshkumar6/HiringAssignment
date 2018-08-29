package assignmentPlivo;

public class Elements {

	static String baseURL = "http://quickfuseapps.com/";
	static String LOC_RESET_PASSWORD = "Reset my password";
	static String LOC_CREATE_APP = "link-create";
	static String LOC_GET_STARTED = "/html/body/div[2]/div[2]/button";
	static String LOC_ADD_PAGE = "add-page";
	static String LOC_PAGE_NAME = "input[class='indented submitonenter']";
	static String LOC_PAGE_CREATE = "/html/body/div[19]/div[3]/button[1]";
	static String LOC_MESSAGE_TAB = "Messaging";
	static String LOC_LIST_SENDSMS = "//html/body/div[1]/div/div/div[3]/div[2]/div[2]/div[4]/ul/li[3]";
	static String LOC_SMS_NUMBER = "textarea[name='phone_constant']";
	static String LOC_SMS_TEXT = "textarea[name='message_phrase[]']";
	static String LOC_SMTP_URL = "input[name='smtp_url']";
	static String LOC_SMTP_PORT = "input[name='port']";
	static String LOC_SMTP_UNAME = "input[name='username']";
	static String LOC_SMTP_PWD = "input[name='password']";
	static String LOC_EMAIL_TO = "textarea[name='to_constant']";
	static String LOC_EMAIL_FRM = "textarea[name='from_constant']";
	static String LOC_EMAIL_SUB = "textarea[name='subject_constant']";
	static String LOC_EMAIL_TEXT = "textarea[class='syn-autoexpand syn-constant syn-autogrow']";
	static String LOC_RECEPTOR_CONNECT = "div[id*=rec-]";
	static String LOC_SMS_TOARROW = "/html/body/div[1]/div/div/div[4]/div[10]/div[2]/div[5]/div";
	static String LOC_LIST_SENDEMAIL = "/html/body/div[1]/div/div/div[3]/div[2]/div[2]/div[4]/ul/li[2]";
	static String LOC_NOTSENT = "div[class='syn-node syn-node-attached-e ui-draggable syn-node-active']";
	static String LOC_SENT = "div[class='syn-node syn-node-attached-w ui-draggable syn-node-active']";
	static String LOC_TAB_BASIC ="Basic" ;
	static String LOC_HANG_UP = "/html/body/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/ul/li[1]";
	//static string LOC_EMAIL_SENT = "div[class='syn-node syn-node-attached-w ui-draggable syn-node-active']";
	static int LOC_SMS_X = 800;
	static int LOC_SMS_Y = 60;
	static int LOC_EMAIL_X = 1200;
	static int LOC_EMAIL_Y = 100;
	static int LOC_HANGUP_X_SMSSENT=600;
	static int LOC_HANGUP_Y_SMSSENT=300;
	static int LOC_HANGUP_X_EMAILSENT=1000;
	static int LOC_HANGUP_Y_EMAILSENT=500;
	static int LOC_HANGUP_X_EMAILNTSENT=1600;
	static int LOC_HANGUP_Y_EMAILNTSENT=500;
	
		
	public static int getLOC_HANGUP_X_SMSSENT() {
		return LOC_HANGUP_X_SMSSENT;
	}
	public static void setLOC_HANGUP_X_SMSSENT(int lOC_HANGUP_X_SMSSENT) {
		LOC_HANGUP_X_SMSSENT = lOC_HANGUP_X_SMSSENT;
	}
	public static int getLOC_HANGUP_Y_SMSSENT() {
		return LOC_HANGUP_Y_SMSSENT;
	}
	public static void setLOC_HANGUP_Y_SMSSENT(int lOC_HANGUP_Y_SMSSENT) {
		LOC_HANGUP_Y_SMSSENT = lOC_HANGUP_Y_SMSSENT;
	}
	public static int getLOC_HANGUP_X_EMAILSENT() {
		return LOC_HANGUP_X_EMAILSENT;
	}
	public static void setLOC_HANGUP_X_EMAILSENT(int lOC_HANGUP_X_EMAILSENT) {
		LOC_HANGUP_X_EMAILSENT = lOC_HANGUP_X_EMAILSENT;
	}
	public static int getLOC_HANGUP_Y_EMAILSENT() {
		return LOC_HANGUP_Y_EMAILSENT;
	}
	public static void setLOC_HANGUP_Y_EMAILSENT(int lOC_HANGUP_Y_EMAILSENT) {
		LOC_HANGUP_Y_EMAILSENT = lOC_HANGUP_Y_EMAILSENT;
	}
	public static int getLOC_HANGUP_X_EMAILNTSENT() {
		return LOC_HANGUP_X_EMAILNTSENT;
	}
	public static void setLOC_HANGUP_X_EMAILNTSENT(int lOC_HANGUP_X_EMAILNTSENT) {
		LOC_HANGUP_X_EMAILNTSENT = lOC_HANGUP_X_EMAILNTSENT;
	}
	public static int getLOC_HANGUP_Y_EMAILNTSENT() {
		return LOC_HANGUP_Y_EMAILNTSENT;
	}
	public static void setLOC_HANGUP_Y_EMAILNTSENT(int lOC_HANGUP_Y_EMAILNTSENT) {
		LOC_HANGUP_Y_EMAILNTSENT = lOC_HANGUP_Y_EMAILNTSENT;
	}	
	public static String getLOC_NOTSENT() {
		return LOC_NOTSENT;
	}
	public static void setLOC_NOTSENT(String lOC_NOTSENT) {
		LOC_NOTSENT = lOC_NOTSENT;
	}
	public static String getLOC_SENT() {
		return LOC_SENT;
	}
	public static void setLOC_SENT(String lOC_SENT) {
		LOC_SENT = lOC_SENT;
	}
	public static String getLOC_HANG_UP() {
		return LOC_HANG_UP;
	}
	public static void setLOC_HANG_UP(String lOC_HANG_UP) {
		LOC_HANG_UP = lOC_HANG_UP;
	}
	
	public static String getLOC_TAB_BASIC() {
		return LOC_TAB_BASIC;
	}
	public static void setLOC_TAB_BASIC(String lOC_TAB_BASIC) {
		LOC_TAB_BASIC = lOC_TAB_BASIC;
	}
	public static String getLOC_SMS_TOARROW() {
		return LOC_SMS_TOARROW;
	}
	public static void setLOC_SMS_TOARROW(String lOC_SMS_TOARROW) {
		LOC_SMS_TOARROW = lOC_SMS_TOARROW;
	}
	public static String getLOC_LIST_SENDEMAIL() {
		return LOC_LIST_SENDEMAIL;
	}
	public static void setLOC_LIST_SENDEMAIL(String lOC_LIST_SENDEMAIL) {
		LOC_LIST_SENDEMAIL = lOC_LIST_SENDEMAIL;
	}
	public static int getLOC_EMAIL_X() {
		return LOC_EMAIL_X;
	}
	public static void setLOC_EMAIL_X(int lOC_EMAIL_X) {
		LOC_EMAIL_X = lOC_EMAIL_X;
	}
	public static int getLOC_EMAIL_Y() {
		return LOC_EMAIL_Y;
	}
	public static void setLOC_EMAIL_Y(int lOC_EMAIL_Y) {
		LOC_EMAIL_Y = lOC_EMAIL_Y;
	}
	public static int getLOC_SMS_X() {
		return LOC_SMS_X;
	}
	public static void setLOC_SMS_X(int lOC_SMS_X) {
		LOC_SMS_X = lOC_SMS_X;
	}
	public static int getLOC_SMS_Y() {
		return LOC_SMS_Y;
	}
	public static void setLOC_SMS_Y(int lOC_SMS_Y) {
		LOC_SMS_Y = lOC_SMS_Y;
	}
	public static String getBaseURL() {
		return baseURL;
	}
	public static void setBaseURL(String baseURL) {
		Elements.baseURL = baseURL;
	}
	public static String getLOC_RESET_PASSWORD() {
		return LOC_RESET_PASSWORD;
	}
	public static void setLOC_RESET_PASSWORD(String lOC_RESET_PASSWORD) {
		LOC_RESET_PASSWORD = lOC_RESET_PASSWORD;
	}
	public static String getLOC_CREATE_APP() {
		return LOC_CREATE_APP;
	}
	public static void setLOC_CREATE_APP(String lOC_CREATE_APP) {
		LOC_CREATE_APP = lOC_CREATE_APP;
	}
	public static String getLOC_GET_STARTED() {
		return LOC_GET_STARTED;
	}
	public static void setLOC_GET_STARTED(String lOC_GET_STARTED) {
		LOC_GET_STARTED = lOC_GET_STARTED;
	}
	public static String getLOC_ADD_PAGE() {
		return LOC_ADD_PAGE;
	}
	public static void setLOC_ADD_PAGE(String lOC_ADD_PAGE) {
		LOC_ADD_PAGE = lOC_ADD_PAGE;
	}
	public static String getLOC_PAGE_NAME() {
		return LOC_PAGE_NAME;
	}
	public static void setLOC_PAGE_NAME(String lOC_PAGE_NAME) {
		LOC_PAGE_NAME = lOC_PAGE_NAME;
	}
	public static String getLOC_PAGE_CREATE() {
		return LOC_PAGE_CREATE;
	}
	public static void setLOC_PAGE_CREATE(String lOC_PAGE_CREATE) {
		LOC_PAGE_CREATE = lOC_PAGE_CREATE;
	}
	public static String getLOC_MESSAGE_TAB() {
		return LOC_MESSAGE_TAB;
	}
	public static void setLOC_MESSAGE_TAB(String lOC_MESSAGE_TAB) {
		LOC_MESSAGE_TAB = lOC_MESSAGE_TAB;
	}
	public static String getLOC_LIST_SENDSMS() {
		return LOC_LIST_SENDSMS;
	}
	public static void setLOC_LIST_SENDSMS(String lOC_LIST_SENDSMS) {
		LOC_LIST_SENDSMS = lOC_LIST_SENDSMS;
	}
	public static String getLOC_SMS_NUMBER() {
		return LOC_SMS_NUMBER;
	}
	public static void setLOC_SMS_NUMBER(String lOC_SMS_NUMBER) {
		LOC_SMS_NUMBER = lOC_SMS_NUMBER;
	}
	public static String getLOC_SMS_TEXT() {
		return LOC_SMS_TEXT;
	}
	public static void setLOC_SMS_TEXT(String lOC_SMS_TEXT) {
		LOC_SMS_TEXT = lOC_SMS_TEXT;
	}
	public static String getLOC_SMTP_URL() {
		return LOC_SMTP_URL;
	}
	public static void setLOC_SMTP_URL(String lOC_SMTP_URL) {
		LOC_SMTP_URL = lOC_SMTP_URL;
	}
	public static String getLOC_SMTP_PORT() {
		return LOC_SMTP_PORT;
	}
	public static void setLOC_SMTP_PORT(String lOC_SMTP_PORT) {
		LOC_SMTP_PORT = lOC_SMTP_PORT;
	}
	public static String getLOC_SMTP_UNAME() {
		return LOC_SMTP_UNAME;
	}
	public static void setLOC_SMTP_UNAME(String lOC_SMTP_UNAME) {
		LOC_SMTP_UNAME = lOC_SMTP_UNAME;
	}
	public static String getLOC_SMTP_PWD() {
		return LOC_SMTP_PWD;
	}
	public static void setLOC_SMTP_PWD(String lOC_SMTP_PWD) {
		LOC_SMTP_PWD = lOC_SMTP_PWD;
	}
	public static String getLOC_EMAIL_TO() {
		return LOC_EMAIL_TO;
	}
	public static void setLOC_EMAIL_TO(String lOC_EMAIL_TO) {
		LOC_EMAIL_TO = lOC_EMAIL_TO;
	}
	public static String getLOC_EMAIL_FRM() {
		return LOC_EMAIL_FRM;
	}
	public static void setLOC_EMAIL_FRM(String lOC_EMAIL_FRM) {
		LOC_EMAIL_FRM = lOC_EMAIL_FRM;
	}
	public static String getLOC_EMAIL_SUB() {
		return LOC_EMAIL_SUB;
	}
	public static void setLOC_EMAIL_SUB(String lOC_EMAIL_SUB) {
		LOC_EMAIL_SUB = lOC_EMAIL_SUB;
	}
	public static String getLOC_EMAIL_TEXT() {
		return LOC_EMAIL_TEXT;
	}
	public static void setLOC_EMAIL_TEXT(String lOC_EMAIL_TEXT) {
		LOC_EMAIL_TEXT = lOC_EMAIL_TEXT;
	}
	public static String getLOC_RECEPTOR_CONNECT() {
		return LOC_RECEPTOR_CONNECT;
	}
	public static void setLOC_RECEPTOR_CONNECT(String lOC_RECEPTOR_CONNECT) {
		LOC_RECEPTOR_CONNECT = lOC_RECEPTOR_CONNECT;
	}	
}
