class KarateRunner {
    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Karate k1 = new Karate("Shotokan","White","Sensei Hiroshi",6,5000f);
        k1.GetInfo();

        Karate k2 = new Karate("Goju-Ryu","Yellow","Sensei Akira",8,6000f);
        k2.GetInfo();

        Karate k3 = new Karate("Wado-Ryu","Orange","Sensei Kenji",10,7000f);
        k3.GetInfo();

        Karate k4 = new Karate("Shito-Ryu","Green","Sensei Yuki",12,7500f);
        k4.GetInfo();

        Karate k5 = new Karate("Kyokushin","Blue","Sensei Takashi",14,8000f);
        k5.GetInfo();

        Karate k6 = new Karate("Shorin-Ryu","Purple","Sensei Masaru",16,8500f);
        k6.GetInfo();

        Karate k7 = new Karate("Uechi-Ryu","Brown","Sensei Nobu",18,9000f);
        k7.GetInfo();

        Karate k8 = new Karate("Isshin-Ryu","Red","Sensei Ryota",20,9500f);
        k8.GetInfo();

        Karate k9 = new Karate("Gensei-Ryu","Black","Sensei Haruki",22,10000f);
        k9.GetInfo();

        Karate k10 = new Karate("Chito-Ryu","White-Red","Sensei Ren",24,10500f);
        k10.GetInfo();

        Karate k11 = new Karate("Ashihara","White","Sensei Taro",6,5500f);
        k11.GetInfo();

        Karate k12 = new Karate("Enshin","Yellow","Sensei Koji",7,6000f);
        k12.GetInfo();

        Karate k13 = new Karate("Kudo","Orange","Sensei Dai",9,6200f);
        k13.GetInfo();

        Karate k14 = new Karate("Seido","Green","Sensei Taiki",11,6800f);
        k14.GetInfo();

        Karate k15 = new Karate("Seishin","Blue","Sensei Sho",13,7300f);
        k15.GetInfo();

        Karate k16 = new Karate("Shinjin-Ryu","Purple","Sensei Ryo",15,7800f);
        k16.GetInfo();

        Karate k17 = new Karate("ShinKyokushin","Brown","Sensei Yuji",17,8300f);
        k17.GetInfo();

        Karate k18 = new Karate("Okinawan","Red","Sensei Eita",19,8800f);
        k18.GetInfo();

        Karate k19 = new Karate("Kanku-Ryu","Black","Sensei Gaku",21,9300f);
        k19.GetInfo();

        Karate k20 = new Karate("Budokan","White-Black","Sensei Kazuki",23,9800f);
        k20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
