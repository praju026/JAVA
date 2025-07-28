class PoliticianRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Politician politician1 = new Politician("Narendra Modi","BJP","Prime Minister",73,"India",true);
        politician1.GetInfo();

        Politician politician2 = new Politician("Rahul Gandhi","INC","MP",54,"India",true);
        politician2.GetInfo();

        Politician politician3 = new Politician("Amit Shah","BJP","Home Minister",60,"India",true);
        politician3.GetInfo();

        Politician politician4 = new Politician("Sonia Gandhi","INC","Former President INC",77,"India",true);
        politician4.GetInfo();

        Politician politician5 = new Politician("Yogi Adityanath","BJP","CM of UP",51,"India",true);
        politician5.GetInfo();

        Politician politician6 = new Politician("Arvind Kejriwal","AAP","CM of Delhi",56,"India",true);
        politician6.GetInfo();

        Politician politician7 = new Politician("Mamata Banerjee","TMC","CM of West Bengal",69,"India",true);
        politician7.GetInfo();

        Politician politician8 = new Politician("Nitish Kumar","JD(U)","CM of Bihar",73,"India",true);
        politician8.GetInfo();

        Politician politician9 = new Politician("MK Stalin","DMK","CM of Tamil Nadu",72,"India",true);
        politician9.GetInfo();

        Politician politician10 = new Politician("Sharad Pawar","NCP","Party Chief",84,"India",true);
        politician10.GetInfo();

        Politician politician11 = new Politician("Pinarayi Vijayan","CPI(M)","CM of Kerala",79,"India",true);
        politician11.GetInfo();

        Politician politician12 = new Politician("Devendra Fadnavis","BJP","Deputy CM of Maharashtra",54,"India",true);
        politician12.GetInfo();

        Politician politician13 = new Politician("Manmohan Singh","INC","Former PM of India",91,"India",false);
        politician13.GetInfo();

        Politician politician14 = new Politician("Lalu Prasad Yadav","RJD","Former CM of Bihar",77,"India",false);
        politician14.GetInfo();

        Politician politician15 = new Politician("HD Kumaraswamy","JD(S)","Former CM of Karnataka",65,"India",true);
        politician15.GetInfo();

        Politician politician16 = new Politician("K Chandrashekar Rao","BRS","Former CM of Telangana",71,"India",true);
        politician16.GetInfo();

        Politician politician17 = new Politician("Hemant Soren","JMM","Former CM of Jharkhand",49,"India",true);
        politician17.GetInfo();

        Politician politician18 = new Politician("Mayawati","BSP","Former CM of UP",68,"India",true);
        politician18.GetInfo();

        Politician politician19 = new Politician("N. Chandrababu Naidu","TDP","CM of Andhra Pradesh",74,"India",true);
        politician19.GetInfo();

        Politician politician20 = new Politician("Siddaramaiah","INC","CM of Karnataka",76,"India",true);
        politician20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
