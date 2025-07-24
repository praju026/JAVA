class BillRunner {

    public static void main(String billing[]) {
        
        System.out.println("MAIN STARTED");

        Bill firstBill = new Bill();
        firstBill.billId = 1;
        firstBill.planType = "monthly plan";
        firstBill.billAmountWithTax = 399.99;
        firstBill.billIssueDate = "26/05/2003";
        firstBill.paymentMethod = "netbanking";
        firstBill.billDueDate = "06/06/2003";
        firstBill.isTaxInclusive = true;
        firstBill.isBillPaid = false;
        firstBill.isBillOverDue = true;
        firstBill.GetInfo();

        Bill secondBill = new Bill();
        secondBill.billId = 2;
        secondBill.planType = "yearly plan";
        secondBill.billAmountWithTax = 4999.99;
        secondBill.billIssueDate = "12/07/2004";
        secondBill.paymentMethod = "credit card";
        secondBill.billDueDate = "22/07/2004";
        secondBill.isTaxInclusive = true;
        secondBill.isBillPaid = true;
        secondBill.isBillOverDue = false;
        secondBill.GetInfo();

        Bill thirdBill = new Bill();
        thirdBill.billId = 3;
        thirdBill.planType = "quarterly plan";
        thirdBill.billAmountWithTax = 1299.50;
        thirdBill.billIssueDate = "10/03/2005";
        thirdBill.paymentMethod = "UPI";
        thirdBill.billDueDate = "20/03/2005";
        thirdBill.isTaxInclusive = true;
        thirdBill.isBillPaid = false;
        thirdBill.isBillOverDue = false;
        thirdBill.GetInfo();

        Bill fourthBill = new Bill();
        fourthBill.billId = 4;
        fourthBill.planType = "monthly plan";
        fourthBill.billAmountWithTax = 499.00;
        fourthBill.billIssueDate = "15/08/2006";
        fourthBill.paymentMethod = "debit card";
        fourthBill.billDueDate = "25/08/2006";
        fourthBill.isTaxInclusive = true;
        fourthBill.isBillPaid = true;
        fourthBill.isBillOverDue = false;
        fourthBill.GetInfo();

        Bill fifthBill = new Bill();
        fifthBill.billId = 5;
        fifthBill.planType = "half-yearly plan";
        fifthBill.billAmountWithTax = 2399.75;
        fifthBill.billIssueDate = "02/11/2007";
        fifthBill.paymentMethod = "cash";
        fifthBill.billDueDate = "12/11/2007";
        fifthBill.isTaxInclusive = false;
        fifthBill.isBillPaid = true;
        fifthBill.isBillOverDue = false;
        fifthBill.GetInfo();

        Bill sixthBill = new Bill();
        sixthBill.billId = 6;
        sixthBill.planType = "monthly plan";
        sixthBill.billAmountWithTax = 399.00;
        sixthBill.billIssueDate = "01/01/2008";
        sixthBill.paymentMethod = "netbanking";
        sixthBill.billDueDate = "11/01/2008";
        sixthBill.isTaxInclusive = true;
        sixthBill.isBillPaid = false;
        sixthBill.isBillOverDue = true;
        sixthBill.GetInfo();

        Bill seventhBill = new Bill();
        seventhBill.billId = 7;
        seventhBill.planType = "quarterly plan";
        seventhBill.billAmountWithTax = 1299.99;
        seventhBill.billIssueDate = "20/02/2009";
        seventhBill.paymentMethod = "UPI";
        seventhBill.billDueDate = "01/03/2009";
        seventhBill.isTaxInclusive = true;
        seventhBill.isBillPaid = true;
        seventhBill.isBillOverDue = false;
        seventhBill.GetInfo();

        Bill eighthBill = new Bill();
        eighthBill.billId = 8;
        eighthBill.planType = "yearly plan";
        eighthBill.billAmountWithTax = 4799.49;
        eighthBill.billIssueDate = "25/05/2010";
        eighthBill.paymentMethod = "debit card";
        eighthBill.billDueDate = "04/06/2010";
        eighthBill.isTaxInclusive = false;
        eighthBill.isBillPaid = false;
        eighthBill.isBillOverDue = true;
        eighthBill.GetInfo();

        Bill ninthBill = new Bill();
        ninthBill.billId = 9;
        ninthBill.planType = "monthly plan";
        ninthBill.billAmountWithTax = 420.00;
        ninthBill.billIssueDate = "09/09/2011";
        ninthBill.paymentMethod = "credit card";
        ninthBill.billDueDate = "19/09/2011";
        ninthBill.isTaxInclusive = true;
        ninthBill.isBillPaid = true;
        ninthBill.isBillOverDue = false;
        ninthBill.GetInfo();

        Bill tenthBill = new Bill();
        tenthBill.billId = 10;
        tenthBill.planType = "half-yearly plan";
        tenthBill.billAmountWithTax = 2499.75;
        tenthBill.billIssueDate = "12/12/2012";
        tenthBill.paymentMethod = "UPI";
        tenthBill.billDueDate = "22/12/2012";
        tenthBill.isTaxInclusive = true;
        tenthBill.isBillPaid = false;
        tenthBill.isBillOverDue = true;
        tenthBill.GetInfo();

        Bill eleventhBill = new Bill();
        eleventhBill.billId = 11;
        eleventhBill.planType = "yearly plan";
        eleventhBill.billAmountWithTax = 5999.00;
        eleventhBill.billIssueDate = "15/01/2013";
        eleventhBill.paymentMethod = "netbanking";
        eleventhBill.billDueDate = "25/01/2013";
        eleventhBill.isTaxInclusive = true;
        eleventhBill.isBillPaid = true;
        eleventhBill.isBillOverDue = false;
        eleventhBill.GetInfo();

        Bill twelfthBill = new Bill();
        twelfthBill.billId = 12;
        twelfthBill.planType = "monthly plan";
        twelfthBill.billAmountWithTax = 450.00;
        twelfthBill.billIssueDate = "10/02/2014";
        twelfthBill.paymentMethod = "cash";
        twelfthBill.billDueDate = "20/02/2014";
        twelfthBill.isTaxInclusive = false;
        twelfthBill.isBillPaid = true;
        twelfthBill.isBillOverDue = false;
        twelfthBill.GetInfo();

        Bill thirteenthBill = new Bill();
        thirteenthBill.billId = 13;
        thirteenthBill.planType = "quarterly plan";
        thirteenthBill.billAmountWithTax = 1350.00;
        thirteenthBill.billIssueDate = "05/03/2015";
        thirteenthBill.paymentMethod = "UPI";
        thirteenthBill.billDueDate = "15/03/2015";
        thirteenthBill.isTaxInclusive = true;
        thirteenthBill.isBillPaid = false;
        thirteenthBill.isBillOverDue = true;
        thirteenthBill.GetInfo();

        Bill fourteenthBill = new Bill();
        fourteenthBill.billId = 14;
        fourteenthBill.planType = "monthly plan";
        fourteenthBill.billAmountWithTax = 410.00;
        fourteenthBill.billIssueDate = "18/06/2016";
        fourteenthBill.paymentMethod = "debit card";
        fourteenthBill.billDueDate = "28/06/2016";
        fourteenthBill.isTaxInclusive = true;
        fourteenthBill.isBillPaid = true;
        fourteenthBill.isBillOverDue = false;
        fourteenthBill.GetInfo();

        Bill fifteenthBill = new Bill();
        fifteenthBill.billId = 15;
        fifteenthBill.planType = "half-yearly plan";
        fifteenthBill.billAmountWithTax = 2599.99;
        fifteenthBill.billIssueDate = "02/09/2017";
        fifteenthBill.paymentMethod = "credit card";
        fifteenthBill.billDueDate = "12/09/2017";
        fifteenthBill.isTaxInclusive = true;
        fifteenthBill.isBillPaid = false;
        fifteenthBill.isBillOverDue = true;
        fifteenthBill.GetInfo();

        Bill sixteenthBill = new Bill();
        sixteenthBill.billId = 16;
        sixteenthBill.planType = "monthly plan";
        sixteenthBill.billAmountWithTax = 430.50;
        sixteenthBill.billIssueDate = "10/10/2018";
        sixteenthBill.paymentMethod = "netbanking";
        sixteenthBill.billDueDate = "20/10/2018";
        sixteenthBill.isTaxInclusive = true;
        sixteenthBill.isBillPaid = true;
        sixteenthBill.isBillOverDue = false;
        sixteenthBill.GetInfo();

        Bill seventeenthBill = new Bill();
        seventeenthBill.billId = 17;
        seventeenthBill.planType = "yearly plan";
        seventeenthBill.billAmountWithTax = 6099.99;
        seventeenthBill.billIssueDate = "12/12/2019";
        seventeenthBill.paymentMethod = "UPI";
        seventeenthBill.billDueDate = "22/12/2019";
        seventeenthBill.isTaxInclusive = true;
        seventeenthBill.isBillPaid = false;
        seventeenthBill.isBillOverDue = true;
        seventeenthBill.GetInfo();

        Bill eighteenthBill = new Bill();
        eighteenthBill.billId = 18;
        eighteenthBill.planType = "quarterly plan";
        eighteenthBill.billAmountWithTax = 1450.00;
        eighteenthBill.billIssueDate = "15/03/2020";
        eighteenthBill.paymentMethod = "cash";
        eighteenthBill.billDueDate = "25/03/2020";
        eighteenthBill.isTaxInclusive = false;
        eighteenthBill.isBillPaid = true;
        eighteenthBill.isBillOverDue = false;
        eighteenthBill.GetInfo();

        Bill nineteenthBill = new Bill();
        nineteenthBill.billId = 19;
        nineteenthBill.planType = "monthly plan";
        nineteenthBill.billAmountWithTax = 470.00;
        nineteenthBill.billIssueDate = "20/06/2021";
        nineteenthBill.paymentMethod = "debit card";
        nineteenthBill.billDueDate = "30/06/2021";
        nineteenthBill.isTaxInclusive = true;
        nineteenthBill.isBillPaid = false;
        nineteenthBill.isBillOverDue = true;
        nineteenthBill.GetInfo();

        Bill twentiethBill = new Bill();
        twentiethBill.billId = 20;
        twentiethBill.planType = "half-yearly plan";
        twentiethBill.billAmountWithTax = 2799.99;
        twentiethBill.billIssueDate = "10/11/2022";
        twentiethBill.paymentMethod = "credit card";
        twentiethBill.billDueDate = "20/11/2022";
        twentiethBill.isTaxInclusive = true;
        twentiethBill.isBillPaid = true;
        twentiethBill.isBillOverDue = false;
        twentiethBill.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
