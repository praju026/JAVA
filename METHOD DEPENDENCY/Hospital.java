class Hospital{
public static void checkUp(String patientName,int age, long phoneNumber,String email,String disease){

		System.out.println("CHECK UP STARTED");
		Docter.treatment(patientName,age,disease);
		System.out.println("CHECK UP ENDED");


	}


}