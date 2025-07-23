class NewsPaperRunner{

	public static void main(String paper[]){
	System.out.println("MAIN STARED");

	NewsPaper newsPaper1 = new NewsPaper();
	newsPaper1.newsPaperId=1;
	newsPaper1.noOfPages=12;
	newsPaper1.language="English";
	newsPaper1.date="22-07-2025";
	newsPaper1.day="Tuesday";
	newsPaper1.companyName="The Time Of India";
	System.out.println("NEWS PAPER ID "+newsPaper1.newsPaperId);
	System.out.println("NO OF PAGES "+newsPaper1.noOfPages);
	System.out.println("LANGUAGE "+newsPaper1.language);
	System.out.println("DATE "+newsPaper1.date);
	System.out.println("DAY "+newsPaper1.day);
	System.out.println("COMPANY NAME "+newsPaper1.companyName);
	System.out.println(" ");

	NewsPaper newsPaper2 = new NewsPaper();
	newsPaper2.newsPaperId=2;
	newsPaper2.noOfPages=14;
	newsPaper2.language="MALAYALAM";
	newsPaper2.date="26-05-2026";
	newsPaper2.day="WEDNESDAY";
	newsPaper2.companyName="MATHRUBHUMI";

	System.out.println("NEWS PAPER ID "+newsPaper2.newsPaperId);
	System.out.println("NO OF PAGES "+newsPaper2.noOfPages);
	System.out.println("LANGUAGE "+newsPaper2.language);
	System.out.println("DATE "+newsPaper2.date);
	System.out.println("DAY "+newsPaper2.day);
	System.out.println("COMPANY NAME "+newsPaper2.companyName);
	System.out.println("MAIN ENDED");
	}
}