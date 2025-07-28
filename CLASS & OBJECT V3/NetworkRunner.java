class NetworkRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Network network1 = new Network("Airtel","5G",300.5f,499.0f,"India",true);
        network1.GetInfo();

        Network network2 = new Network("Jio","5G",350.0f,399.0f,"India",true);
        network2.GetInfo();

        Network network3 = new Network("Vodafone Idea","4G",150.0f,299.0f,"India",false);
        network3.GetInfo();

        Network network4 = new Network("BSNL","4G",100.0f,249.0f,"India",false);
        network4.GetInfo();

        Network network5 = new Network("AT&T","5G",400.0f,999.0f,"USA",true);
        network5.GetInfo();

        Network network6 = new Network("Verizon","5G",420.0f,1099.0f,"USA",true);
        network6.GetInfo();

        Network network7 = new Network("T-Mobile","5G",380.0f,950.0f,"USA",true);
        network7.GetInfo();

        Network network8 = new Network("BT Broadband","Broadband",70.0f,799.0f,"UK",true);
        network8.GetInfo();

        Network network9 = new Network("EE","5G",370.0f,899.0f,"UK",true);
        network9.GetInfo();

        Network network10 = new Network("O2","4G",120.0f,650.0f,"UK",false);
        network10.GetInfo();

        Network network11 = new Network("Spectrum","Broadband",100.0f,1200.0f,"USA",true);
        network11.GetInfo();

        Network network12 = new Network("Comcast Xfinity","Broadband",120.0f,1500.0f,"USA",true);
        network12.GetInfo();

        Network network13 = new Network("Idea Broadband","Broadband",60.0f,599.0f,"India",false);
        network13.GetInfo();

        Network network14 = new Network("MTNL","4G",90.0f,399.0f,"India",false);
        network14.GetInfo();

        Network network15 = new Network("Google Fiber","Broadband",1000.0f,2000.0f,"USA",true);
        network15.GetInfo();

        Network network16 = new Network("ACT Fibernet","Broadband",500.0f,1299.0f,"India",true);
        network16.GetInfo();

        Network network17 = new Network("Reliance Netconnect","4G",70.0f,450.0f,"India",false);
        network17.GetInfo();

        Network network18 = new Network("Tata Play Fiber","Broadband",300.0f,999.0f,"India",true);
        network18.GetInfo();

        Network network19 = new Network("Hathway","Broadband",200.0f,899.0f,"India",true);
        network19.GetInfo();

        Network network20 = new Network("BSNL Fiber","Broadband",150.0f,849.0f,"India",true);
        network20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
