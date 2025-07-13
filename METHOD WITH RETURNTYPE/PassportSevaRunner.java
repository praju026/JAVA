class PassportSevaRunner {

     public static void main(String seva[]){
		boolean userIsRegistered =   PassportSeva.registerUser("Bahu","Bali","bahu123","bahu123","Passport Office","Bangalore","bahubali@mahishmathi.com");
	        //System.out.println("Is User Registered "+ userIsRegistered);	
		if(userIsRegistered==true) System.out.println("ACCOUNT CREATED");
		else System.out.println("ACCOUNT CREATION FAILED TRY AGAIN WITH  VALID DATA");
		if(userIsRegistered) PassportSeva.getUserInfo();
	}
}