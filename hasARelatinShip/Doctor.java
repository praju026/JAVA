class Doctor {

	String name;
	String specialization;
	int experience;
	boolean isAvailable;

	public void doctorInfo() {
		System.out.println("DOCTOR INFO PRINTING");
		System.out.println("NAME           : " + name);
		System.out.println("SPECIALIZATION : " + specialization);
		System.out.println("EXPERIENCE     : " + experience + " years");
		System.out.println("AVAILABLE      : " + isAvailable);
	}
}
