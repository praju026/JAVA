public class Meeting {

	Invitee invitee;
	String meetingTitle;
	String meetingDate;
	String meetingTime;
	boolean isOnline;

	public void meetingInfo() {
		System.out.println("MEETING INFO PRINTING");
		System.out.println("TITLE         : " + meetingTitle);
		System.out.println("DATE          : " + meetingDate);
		System.out.println("TIME          : " + meetingTime);
		System.out.println("IS ONLINE     : " + isOnline);
		invitee.inviteeInfo();
	}
}
