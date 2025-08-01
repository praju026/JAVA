class Department {

	Doctor doctor;
	String departmentName;
	String head;
	int totalDoctors;
	boolean emergencySupport;

	public void departmentInfo() {
		System.out.println("DEPARTMENT INFO PRINTING");
		System.out.println("DEPARTMENT NAME     : " + departmentName);
		System.out.println("DEPARTMENT HEAD     : " + head);
		System.out.println("TOTAL DOCTORS       : " + totalDoctors);
		System.out.println("EMERGENCY SUPPORT   : " + emergencySupport);
		doctor.doctorInfo();
	}
}
