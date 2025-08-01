class Hospital {

	Department department;
	String hospitalName;
	String hospitalLocation;
	int totalDepartments;
	boolean isGovernment;

	public void hospitalInfo() {
		System.out.println("HOSPITAL INFO PRINTING");
		System.out.println("HOSPITAL NAME       : " + hospitalName);
		System.out.println("HOSPITAL LOCATION   : " + hospitalLocation);
		System.out.println("TOTAL DEPARTMENTS   : " + totalDepartments);
		System.out.println("IS GOVERNMENT       : " + isGovernment);
		department.departmentInfo();
	}
}
