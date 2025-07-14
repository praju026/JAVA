class CountryCodeRunner{

public static void main(String codeRunner[]){

	String countryName="India";
	int code = Country.getCountryCode(countryName);
	System.out.println("Country Code Of "+countryName+": "+code);
	}

}