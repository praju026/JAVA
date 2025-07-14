class ContactBookRunner{

public static void main(String contactRunner[]){

	String contactName="Praju";
	long number = Contact.getPhoneNumber(contactName);
	System.out.println(" "+contactName+": "+number);

	long phoneNumber = 9645566258L;
	String name = Contact.getContactName(phoneNumber);
	System.out.println(" "+phoneNumber+": "+name);
	}

}