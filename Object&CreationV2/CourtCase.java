class CourtCase {
    String caseNumber;    
    String caseType;      
    String courtName;     
    String judgeName;     
    String plaintiff;     
    String defendant;     
    boolean isResolved;  

	public void GetInfo(){ 

        System.out.println("CASE NUMBER : " + caseNumber);
        System.out.println("CASE TYPE : " + caseType);
        System.out.println("COURT NAME : " + courtName);
        System.out.println("JUDGE NAME : " + judgeName);
        System.out.println("PLAINTIFF : " + plaintiff);
        System.out.println("DEFENDANT : " + defendant);
        System.out.println("IS RESOLVED : " + isResolved);
	
	}
}
