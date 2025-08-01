class HospitalRunner {

	public static void main(String dr[]) {

		Doctor doctor = new Doctor();
		doctor.name = "Dr. Praju";
		doctor.specialization = "Neurology";
		doctor.experience = 12;
		doctor.isAvailable = true;

		Department department = new Department();
		department.doctor = doctor;
		department.departmentName = "Neuroscience";
		department.head = "Dr.vava";
		department.totalDoctors = 5;
		department.emergencySupport = true;

		Hospital hospital = new Hospital();
		hospital.department = department;
		hospital.hospitalName = "NIMHANS";
		hospital.hospitalLocation = "Bangalore";
		hospital.totalDepartments = 12;
		hospital.isGovernment = true;

		hospital.hospitalInfo();
	}
}
