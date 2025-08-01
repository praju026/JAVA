class CalendarRunner {

	public static void main(String meet[]) {

		Invitee invitee = new Invitee();
		invitee.name = "Rahul Kumar";
		invitee.email = "rahul.kumar@example.com";
		invitee.role = "Project Manager";
		invitee.isConfirmed = true;

		Meeting meeting = new Meeting();
		meeting.invitee = invitee;
		meeting.meetingTitle = "Sprint Planning";
		meeting.meetingDate = "2025-08-01";
		meeting.meetingTime = "10:00 AM";
		meeting.isOnline = true;

		Calendar calendar = new Calendar();
		calendar.meeting = meeting;
		calendar.calendarOwner = "Praju";
		calendar.calendarType = "Work";
		calendar.totalEvents = 12;
		calendar.isSynced = true;

		calendar.calendarInfo();
	}
}
