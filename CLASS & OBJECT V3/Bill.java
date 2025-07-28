class Bill{

	Bill(){
	
	System.out.println("DEFAULT");

	}


	Bill(String planType,double billAmountWithTax,String billIssueDate,String paymentMethod,String billDueDate,int billId,boolean isTaxInclusive,boolean isBillPaid,boolean isBillOverDue)	{	
	System.out.println("PARAMETERIZED");
	this.planType=planType;
	this.billAmountWithTax=billAmountWithTax;
	this.billIssueDate=billIssueDate;
	this.paymentMethod=paymentMethod;
	this.billDueDate=billDueDate;
	this.billId=billId;
	this.isTaxInclusive=isTaxInclusive;
	this.isBillOverDue=isBillPaid;
	this.isBillOverDue=isBillOverDue;
	
	}
String planType;
double billAmountWithTax;
String billIssueDate;
String paymentMethod;
String billDueDate;
int billId;
boolean isTaxInclusive;
boolean isBillPaid;
boolean isBillOverDue;

	public void GetInfo(){
	System.out.println("the bill id is " + billId);
        System.out.println("the plan type is " + planType);
        System.out.println("the billAmount With Tax is " + billAmountWithTax);
        System.out.println("the issue date is " + billIssueDate);
        System.out.println("the paymentMethod is " + paymentMethod);
        System.out.println("the due date is " + billDueDate);
        System.out.println("is tax included " + isTaxInclusive);
        System.out.println("is bill paid " + isBillPaid);
        System.out.println("is bill over due " +isBillOverDue);
        System.out.println("");

	}
}