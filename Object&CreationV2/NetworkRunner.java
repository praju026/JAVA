class NetworkRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Network network1 = new Network();
        network1.name = "Airtel";
        network1.type = "5G";
        network1.speed = 300.5f;
        network1.price = 499.0f;
        network1.country = "India";
        network1.isUnlimited = true;
        network1.GetInfo();

        Network network2 = new Network();
        network2.name = "Jio";
        network2.type = "5G";
        network2.speed = 350.0f;
        network2.price = 399.0f;
        network2.country = "India";
        network2.isUnlimited = true;
        network2.GetInfo();

        Network network3 = new Network();
        network3.name = "Vodafone Idea";
        network3.type = "4G";
        network3.speed = 150.0f;
        network3.price = 299.0f;
        network3.country = "India";
        network3.isUnlimited = false;
        network3.GetInfo();

        Network network4 = new Network();
        network4.name = "BSNL";
        network4.type = "4G";
        network4.speed = 100.0f;
        network4.price = 249.0f;
        network4.country = "India";
        network4.isUnlimited = false;
        network4.GetInfo();

        Network network5 = new Network();
        network5.name = "AT&T";
        network5.type = "5G";
        network5.speed = 400.0f;
        network5.price = 999.0f;
        network5.country = "USA";
        network5.isUnlimited = true;
        network5.GetInfo();

        Network network6 = new Network();
        network6.name = "Verizon";
        network6.type = "5G";
        network6.speed = 420.0f;
        network6.price = 1099.0f;
        network6.country = "USA";
        network6.isUnlimited = true;
        network6.GetInfo();

        Network network7 = new Network();
        network7.name = "T-Mobile";
        network7.type = "5G";
        network7.speed = 380.0f;
        network7.price = 950.0f;
        network7.country = "USA";
        network7.isUnlimited = true;
        network7.GetInfo();

        Network network8 = new Network();
        network8.name = "BT Broadband";
        network8.type = "Broadband";
        network8.speed = 70.0f;
        network8.price = 799.0f;
        network8.country = "UK";
        network8.isUnlimited = true;
        network8.GetInfo();

        Network network9 = new Network();
        network9.name = "EE";
        network9.type = "5G";
        network9.speed = 370.0f;
        network9.price = 899.0f;
        network9.country = "UK";
        network9.isUnlimited = true;
        network9.GetInfo();

        Network network10 = new Network();
        network10.name = "O2";
        network10.type = "4G";
        network10.speed = 120.0f;
        network10.price = 650.0f;
        network10.country = "UK";
        network10.isUnlimited = false;
        network10.GetInfo();

        Network network11 = new Network();
        network11.name = "Spectrum";
        network11.type = "Broadband";
        network11.speed = 100.0f;
        network11.price = 1200.0f;
        network11.country = "USA";
        network11.isUnlimited = true;
        network11.GetInfo();

        Network network12 = new Network();
        network12.name = "Comcast Xfinity";
        network12.type = "Broadband";
        network12.speed = 120.0f;
        network12.price = 1500.0f;
        network12.country = "USA";
        network12.isUnlimited = true;
        network12.GetInfo();

        Network network13 = new Network();
        network13.name = "Idea Broadband";
        network13.type = "Broadband";
        network13.speed = 60.0f;
        network13.price = 599.0f;
        network13.country = "India";
        network13.isUnlimited = false;
        network13.GetInfo();

        Network network14 = new Network();
        network14.name = "MTNL";
        network14.type = "4G";
        network14.speed = 90.0f;
        network14.price = 399.0f;
        network14.country = "India";
        network14.isUnlimited = false;
        network14.GetInfo();

        Network network15 = new Network();
        network15.name = "Google Fiber";
        network15.type = "Broadband";
        network15.speed = 1000.0f;
        network15.price = 2000.0f;
        network15.country = "USA";
        network15.isUnlimited = true;
        network15.GetInfo();

        Network network16 = new Network();
        network16.name = "ACT Fibernet";
        network16.type = "Broadband";
        network16.speed = 500.0f;
        network16.price = 1299.0f;
        network16.country = "India";
        network16.isUnlimited = true;
        network16.GetInfo();

        Network network17 = new Network();
        network17.name = "Reliance Netconnect";
        network17.type = "4G";
        network17.speed = 70.0f;
        network17.price = 450.0f;
        network17.country = "India";
        network17.isUnlimited = false;
        network17.GetInfo();

        Network network18 = new Network();
        network18.name = "Tata Play Fiber";
        network18.type = "Broadband";
        network18.speed = 300.0f;
        network18.price = 999.0f;
        network18.country = "India";
        network18.isUnlimited = true;
        network18.GetInfo();

        Network network19 = new Network();
        network19.name = "Hathway";
        network19.type = "Broadband";
        network19.speed = 200.0f;
        network19.price = 899.0f;
        network19.country = "India";
        network19.isUnlimited = true;
        network19.GetInfo();

        Network network20 = new Network();
        network20.name = "BSNL Fiber";
        network20.type = "Broadband";
        network20.speed = 150.0f;
        network20.price = 849.0f;
        network20.country = "India";
        network20.isUnlimited = true;
        network20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
