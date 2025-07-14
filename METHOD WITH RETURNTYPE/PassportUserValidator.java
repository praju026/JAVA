class PassportUserValidator{
	static String givenName ;
	static String surName ;
	static String password;
	static String confirmPassword;
	static String regOffice;
	static String passportOffice;
	static String emailId;


	public static boolean validatePassportUser(String gName , String sName,String pwd,String cPwd,String office, String passOffice ,String email){
		    boolean isUserValidated = false;
                    boolean givenNameValid = false;
		    boolean surNameValid  = false;
		    boolean passwordValid = false;
		    boolean confirmPasswordValid = false;
		    boolean regOfficeValid = false;
		    boolean passportOfficeValid = false;
		    boolean emailIdValid = false;
		  if(gName != null){ 
			  givenName = gName  ; 
			  givenNameValid = true ;        
		  }else System.out.println("GIVE VALID NAME"); 
  
		  if(sName != null){
			surName = sName;
			surNameValid = true ; 
		   }else System.out.println("GIVE VALID SUR NAME");

		  if(pwd !=null){
			password = pwd;
			passwordValid = true;
		  }else System.out.println("GIVE VALID PASSWORD");

		  if(cPwd !=null && cPwd == pwd){
			confirmPassword = cPwd;
			confirmPasswordValid = true;
		  }else System.out.println("GIVE SAME & VALID PASSWORD AS PASSWORD");

		 if(office !=null){
			regOffice = office;
			regOfficeValid = true;
		  }else System.out.println("Give Proper Registration Office");

		  if(passOffice!=null){
			passportOffice = passOffice;
			passportOfficeValid = true;
		  }else System.out.println("Give Proper Passport Ofiice");

		  if(email!=null){
			emailId=email;
			emailIdValid = true;
		  }else System.out.println("NOT VALID EMAIL ID");

		  if(givenNameValid  && surNameValid &&passwordValid && confirmPasswordValid && regOfficeValid &&passportOfficeValid && emailIdValid ){
			isUserValidated= true;
		   }
			return isUserValidated;
		}
	}