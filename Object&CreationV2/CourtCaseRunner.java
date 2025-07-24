class CourtCaseRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        CourtCase case1 = new CourtCase();
        case1.caseNumber = "CIV1234";
        case1.caseType = "Civil";
        case1.courtName = "Supreme Court";
        case1.judgeName = "Justice A. Verma";
        case1.plaintiff = "John Doe";
        case1.defendant = "XYZ Pvt Ltd";
        case1.isResolved = false;
        case1.GetInfo();

        CourtCase case2 = new CourtCase();
        case2.caseNumber = "CRM5678";
        case2.caseType = "Criminal";
        case2.courtName = "High Court";
        case2.judgeName = "Justice R. Mehta";
        case2.plaintiff = "State of Karnataka";
        case2.defendant = "ABC Industries";
        case2.isResolved = true;
        case2.GetInfo();

        CourtCase case3 = new CourtCase();
        case3.caseNumber = "FAM9012";
        case3.caseType = "Family";
        case3.courtName = "Family Court";
        case3.judgeName = "Justice K. Menon";
        case3.plaintiff = "Alice";
        case3.defendant = "Bob";
        case3.isResolved = false;
        case3.GetInfo();

        CourtCase case4 = new CourtCase();
        case4.caseNumber = "LAB3456";
        case4.caseType = "Labor";
        case4.courtName = "District Court";
        case4.judgeName = "Justice N. Rao";
        case4.plaintiff = "Workers Union";
        case4.defendant = "LMN Textiles";
        case4.isResolved = true;
        case4.GetInfo();

        CourtCase case5 = new CourtCase();
        case5.caseNumber = "TAX1122";
        case5.caseType = "Tax";
        case5.courtName = "Income Tax Tribunal";
        case5.judgeName = "Justice D. Kapoor";
        case5.plaintiff = "Tax Department";
        case5.defendant = "JKL Corporation";
        case5.isResolved = false;
        case5.GetInfo();

        CourtCase case6 = new CourtCase();
        case6.caseNumber = "ENV5566";
        case6.caseType = "Environmental";
        case6.courtName = "Green Tribunal";
        case6.judgeName = "Justice S. Nair";
        case6.plaintiff = "Environment NGO";
        case6.defendant = "ABC Chemicals";
        case6.isResolved = false;
        case6.GetInfo();

        CourtCase case7 = new CourtCase();
        case7.caseNumber = "PROP7788";
        case7.caseType = "Property";
        case7.courtName = "City Civil Court";
        case7.judgeName = "Justice R. Singh";
        case7.plaintiff = "David";
        case7.defendant = "Ethan";
        case7.isResolved = true;
        case7.GetInfo();

        CourtCase case8 = new CourtCase();
        case8.caseNumber = "IP9988";
        case8.caseType = "Intellectual Property";
        case8.courtName = "High Court";
        case8.judgeName = "Justice K. Prasad";
        case8.plaintiff = "Tech Innovations";
        case8.defendant = "MegaSoft";
        case8.isResolved = false;
        case8.GetInfo();

        CourtCase case9 = new CourtCase();
        case9.caseNumber = "TRADE567";
        case9.caseType = "Trade";
        case9.courtName = "Commercial Court";
        case9.judgeName = "Justice V. Iyer";
        case9.plaintiff = "XYZ Traders";
        case9.defendant = "ABC Importers";
        case9.isResolved = true;
        case9.GetInfo();

        CourtCase case10 = new CourtCase();
        case10.caseNumber = "CIV450";
        case10.caseType = "Civil";
        case10.courtName = "Supreme Court";
        case10.judgeName = "Justice A. Malhotra";
        case10.plaintiff = "Ravi";
        case10.defendant = "Sumit";
        case10.isResolved = false;
        case10.GetInfo();

        CourtCase case11 = new CourtCase();
        case11.caseNumber = "CRIM123";
        case11.caseType = "Criminal";
        case11.courtName = "High Court";
        case11.judgeName = "Justice V. Gowda";
        case11.plaintiff = "State of Maharashtra";
        case11.defendant = "PQR Ltd";
        case11.isResolved = false;
        case11.GetInfo();

        CourtCase case12 = new CourtCase();
        case12.caseNumber = "LAB789";
        case12.caseType = "Labor";
        case12.courtName = "District Court";
        case12.judgeName = "Justice J. Reddy";
        case12.plaintiff = "Workers Group";
        case12.defendant = "Textile Corp";
        case12.isResolved = true;
        case12.GetInfo();

        CourtCase case13 = new CourtCase();
        case13.caseNumber = "TAX321";
        case13.caseType = "Tax";
        case13.courtName = "Income Tax Tribunal";
        case13.judgeName = "Justice A. Patel";
        case13.plaintiff = "Income Tax Dept";
        case13.defendant = "XYZ Finance";
        case13.isResolved = false;
        case13.GetInfo();

        CourtCase case14 = new CourtCase();
        case14.caseNumber = "ENV999";
        case14.caseType = "Environmental";
        case14.courtName = "Green Tribunal";
        case14.judgeName = "Justice R. Banerjee";
        case14.plaintiff = "Save Earth Org";
        case14.defendant = "Oil Industries";
        case14.isResolved = true;
        case14.GetInfo();

        CourtCase case15 = new CourtCase();
        case15.caseNumber = "IP102";
        case15.caseType = "Intellectual Property";
        case15.courtName = "Commercial Court";
        case15.judgeName = "Justice D. Khanna";
        case15.plaintiff = "AppDev Co.";
        case15.defendant = "SoftCorp";
        case15.isResolved = false;
        case15.GetInfo();

        CourtCase case16 = new CourtCase();
        case16.caseNumber = "PROP504";
        case16.caseType = "Property";
        case16.courtName = "City Civil Court";
        case16.judgeName = "Justice H. Iyer";
        case16.plaintiff = "Suresh";
        case16.defendant = "Ramesh";
        case16.isResolved = true;
        case16.GetInfo();

        CourtCase case17 = new CourtCase();
        case17.caseNumber = "TRADE210";
        case17.caseType = "Trade";
        case17.courtName = "Commercial Court";
        case17.judgeName = "Justice N. Shankar";
        case17.plaintiff = "Global Traders";
        case17.defendant = "TradeHub";
        case17.isResolved = false;
        case17.GetInfo();

        CourtCase case18 = new CourtCase();
        case18.caseNumber = "CIV888";
        case18.caseType = "Civil";
        case18.courtName = "High Court";
        case18.judgeName = "Justice M. Kumar";
        case18.plaintiff = "Anil";
        case18.defendant = "Vinay";
        case18.isResolved = true;
        case18.GetInfo();

        CourtCase case19 = new CourtCase();
        case19.caseNumber = "CRIM212";
        case19.caseType = "Criminal";
        case19.courtName = "Sessions Court";
        case19.judgeName = "Justice S. Rao";
        case19.plaintiff = "State of UP";
        case19.defendant = "XYZ Corp";
        case19.isResolved = false;
        case19.GetInfo();

        CourtCase case20 = new CourtCase();
        case20.caseNumber = "FAM707";
        case20.caseType = "Family";
        case20.courtName = "Family Court";
        case20.judgeName = "Justice K. Das";
        case20.plaintiff = "Sneha";
        case20.defendant = "Amit";
        case20.isResolved = true;
        case20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
