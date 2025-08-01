class Calendar {

	Meeting meeting;
	String calendarOwner;
	String calendarType;
	int totalEvents;
	boolean isSynced;

	public void calendarInfo() {
		System.out.println("CALENDAR INFO PRINTING");
		System.out.println("OWNER         : " + calendarOwner);
		System.out.println("TYPE          : " + calendarType);
		System.out.println("TOTAL EVENTS  : " + totalEvents);
		System.out.println("IS SYNCED     : " + isSynced);
		meeting.meetingInfo();
	}
}
