class CourtCaseRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        CourtCase case1 = new CourtCase("CIV1234","Civil","Supreme Court","Justice A. Verma","John Doe","XYZ Pvt Ltd",false);
        // case1.caseNumber = "CIV1234";
        // case1.caseType = "Civil";
        // case1.courtName = "Supreme Court";
        // case1.judgeName = "Justice A. Verma";
        // case1.plaintiff = "John Doe";
        // case1.defendant = "XYZ Pvt Ltd";
        // case1.isResolved = false;
        case1.GetInfo();

        CourtCase case2 = new CourtCase("CRM5678","Criminal","High Court","Justice R. Mehta","State of Karnataka","ABC Industries",true);
        // case2.caseNumber = "CRM5678";
        // case2.caseType = "Criminal";
        // case2.courtName = "High Court";
        // case2.judgeName = "Justice R. Mehta";
        // case2.plaintiff = "State of Karnataka";
        // case2.defendant = "ABC Industries";
        // case2.isResolved = true;
        case2.GetInfo();

        CourtCase case3 = new CourtCase("FAM9012","Family","Family Court","Justice K. Menon","Alice","Bob",false);
        // case3.caseNumber = "FAM9012";
        // case3.caseType = "Family";
        // case3.courtName = "Family Court";
        // case3.judgeName = "Justice K. Menon";
        // case3.plaintiff = "Alice";
        // case3.defendant = "Bob";
        // case3.isResolved = false;
        case3.GetInfo();

        CourtCase case4 = new CourtCase("LAB3456","Labor","District Court","Justice N. Rao","Workers Union","LMN Textiles",true);
        // case4.caseNumber = "LAB3456";
        // case4.caseType = "Labor";
        // case4.courtName = "District Court";
        // case4.judgeName = "Justice N. Rao";
        // case4.plaintiff = "Workers Union";
        // case4.defendant = "LMN Textiles";
        // case4.isResolved = true;
        case4.GetInfo();

        CourtCase case5 = new CourtCase("TAX1122","Tax","Income Tax Tribunal","Justice D. Kapoor","Tax Department","JKL Corporation",false);
        case5.GetInfo();

        CourtCase case6 = new CourtCase("ENV5566","Environmental","Green Tribunal","Justice S. Nair","Environment NGO","ABC Chemicals",false);
        case6.GetInfo();

        CourtCase case7 = new CourtCase("PROP7788","Property","City Civil Court","Justice R. Singh","David","Ethan",true);
        case7.GetInfo();

        CourtCase case8 = new CourtCase("IP9988","Intellectual Property","High Court","Justice K. Prasad","Tech Innovations","MegaSoft",false);
        case8.GetInfo();

        CourtCase case9 = new CourtCase("TRADE567","Trade","Commercial Court","Justice V. Iyer","XYZ Traders","ABC Importers",true);
        case9.GetInfo();

        CourtCase case10 = new CourtCase("CIV450","Civil","Supreme Court","Justice A. Malhotra","Ravi","Sumit",false);
        case10.GetInfo();

        CourtCase case11 = new CourtCase("CRIM123","Criminal","High Court","Justice V. Gowda","State of Maharashtra","PQR Ltd",false);
        case11.GetInfo();

        CourtCase case12 = new CourtCase("LAB789","Labor","District Court","Justice J. Reddy","Workers Group","Textile Corp",true);
        case12.GetInfo();

        CourtCase case13 = new CourtCase("TAX321","Tax","Income Tax Tribunal","Justice A. Patel","Income Tax Dept","XYZ Finance",false);
        case13.GetInfo();

        CourtCase case14 = new CourtCase("ENV999","Environmental","Green Tribunal","Justice R. Banerjee","Save Earth Org","Oil Industries",true);
        case14.GetInfo();

        CourtCase case15 = new CourtCase("IP102","Intellectual Property","Commercial Court","Justice D. Khanna","AppDev Co.","SoftCorp",false);
        case15.GetInfo();

        CourtCase case16 = new CourtCase("PROP504","Property","City Civil Court","Justice H. Iyer","Suresh","Ramesh",true);
        case16.GetInfo();

        CourtCase case17 = new CourtCase("TRADE210","Trade","Commercial Court","Justice N. Shankar","Global Traders","TradeHub",false);
        case17.GetInfo();

        CourtCase case18 = new CourtCase("CIV888","Civil","High Court","Justice M. Kumar","Anil","Vinay",true);
        case18.GetInfo();

        CourtCase case19 = new CourtCase("CRIM212","Criminal","Sessions Court","Justice S. Rao","State of UP","XYZ Corp",false);
        case19.GetInfo();

        CourtCase case20 = new CourtCase("FAM707","Family","Family Court","Justice K. Das","Sneha","Amit",true);
        case20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
