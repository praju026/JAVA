class KarateRunner {
    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Karate k1 = new Karate();
        k1.style = "Shotokan";
        k1.beltColor = "White";
        k1.trainerName = "Sensei Hiroshi";
        k1.durationMonths = 6;
        k1.fees = 5000f;
        k1.GetInfo();

        Karate k2 = new Karate();
        k2.style = "Goju-Ryu";
        k2.beltColor = "Yellow";
        k2.trainerName = "Sensei Akira";
        k2.durationMonths = 8;
        k2.fees = 6000f;
        k2.GetInfo();

        Karate k3 = new Karate();
        k3.style = "Wado-Ryu";
        k3.beltColor = "Orange";
        k3.trainerName = "Sensei Kenji";
        k3.durationMonths = 10;
        k3.fees = 7000f;
        k3.GetInfo();

        Karate k4 = new Karate();
        k4.style = "Shito-Ryu";
        k4.beltColor = "Green";
        k4.trainerName = "Sensei Yuki";
        k4.durationMonths = 12;
        k4.fees = 7500f;
        k4.GetInfo();

        Karate k5 = new Karate();
        k5.style = "Kyokushin";
        k5.beltColor = "Blue";
        k5.trainerName = "Sensei Takashi";
        k5.durationMonths = 14;
        k5.fees = 8000f;
        k5.GetInfo();

        Karate k6 = new Karate();
        k6.style = "Shorin-Ryu";
        k6.beltColor = "Purple";
        k6.trainerName = "Sensei Masaru";
        k6.durationMonths = 16;
        k6.fees = 8500f;
        k6.GetInfo();

        Karate k7 = new Karate();
        k7.style = "Uechi-Ryu";
        k7.beltColor = "Brown";
        k7.trainerName = "Sensei Nobu";
        k7.durationMonths = 18;
        k7.fees = 9000f;
        k7.GetInfo();

        Karate k8 = new Karate();
        k8.style = "Isshin-Ryu";
        k8.beltColor = "Red";
        k8.trainerName = "Sensei Ryota";
        k8.durationMonths = 20;
        k8.fees = 9500f;
        k8.GetInfo();

        Karate k9 = new Karate();
        k9.style = "Gensei-Ryu";
        k9.beltColor = "Black";
        k9.trainerName = "Sensei Haruki";
        k9.durationMonths = 22;
        k9.fees = 10000f;
        k9.GetInfo();

        Karate k10 = new Karate();
        k10.style = "Chito-Ryu";
        k10.beltColor = "White-Red";
        k10.trainerName = "Sensei Ren";
        k10.durationMonths = 24;
        k10.fees = 10500f;
        k10.GetInfo();

        Karate k11 = new Karate();
        k11.style = "Ashihara";
        k11.beltColor = "White";
        k11.trainerName = "Sensei Taro";
        k11.durationMonths = 6;
        k11.fees = 5500f;
        k11.GetInfo();

        Karate k12 = new Karate();
        k12.style = "Enshin";
        k12.beltColor = "Yellow";
        k12.trainerName = "Sensei Koji";
        k12.durationMonths = 7;
        k12.fees = 6000f;
        k12.GetInfo();

        Karate k13 = new Karate();
        k13.style = "Kudo";
        k13.beltColor = "Orange";
        k13.trainerName = "Sensei Dai";
        k13.durationMonths = 9;
        k13.fees = 6200f;
        k13.GetInfo();

        Karate k14 = new Karate();
        k14.style = "Seido";
        k14.beltColor = "Green";
        k14.trainerName = "Sensei Taiki";
        k14.durationMonths = 11;
        k14.fees = 6800f;
        k14.GetInfo();

        Karate k15 = new Karate();
        k15.style = "Seishin";
        k15.beltColor = "Blue";
        k15.trainerName = "Sensei Sho";
        k15.durationMonths = 13;
        k15.fees = 7300f;
        k15.GetInfo();

        Karate k16 = new Karate();
        k16.style = "Shinjin-Ryu";
        k16.beltColor = "Purple";
        k16.trainerName = "Sensei Ryo";
        k16.durationMonths = 15;
        k16.fees = 7800f;
        k16.GetInfo();

        Karate k17 = new Karate();
        k17.style = "ShinKyokushin";
        k17.beltColor = "Brown";
        k17.trainerName = "Sensei Yuji";
        k17.durationMonths = 17;
        k17.fees = 8300f;
        k17.GetInfo();

        Karate k18 = new Karate();
        k18.style = "Okinawan";
        k18.beltColor = "Red";
        k18.trainerName = "Sensei Eita";
        k18.durationMonths = 19;
        k18.fees = 8800f;
        k18.GetInfo();

        Karate k19 = new Karate();
        k19.style = "Kanku-Ryu";
        k19.beltColor = "Black";
        k19.trainerName = "Sensei Gaku";
        k19.durationMonths = 21;
        k19.fees = 9300f;
        k19.GetInfo();

        Karate k20 = new Karate();
        k20.style = "Budokan";
        k20.beltColor = "White-Black";
        k20.trainerName = "Sensei Kazuki";
        k20.durationMonths = 23;
        k20.fees = 9800f;
        k20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
