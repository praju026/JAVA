class CoinsRunner {

    public static void main(String coin[]) {
        System.out.println("MAIN STARTED");

        Coins coin1 = new Coins("Indian 1 Rupee", "India", "Stainless Steel", 1.0f, 2022, 4.85f);
        // coin1.name = "Indian 1 Rupee";
        // coin1.country = "India";
        // coin1.material = "Stainless Steel";
        // coin1.value = 1.0f;
        // coin1.year = 2022;
        // coin1.weight = 4.85f;
        coin1.GetInfo();

        Coins coin2 = new Coins("Indian 2 Rupees", "India", "Stainless Steel", 2.0f, 2020, 4.5f);
        // coin2.name = "Indian 2 Rupees";
        // coin2.country = "India";
        // coin2.material = "Stainless Steel";
        // coin2.value = 2.0f;
        // coin2.year = 2020;
        // coin2.weight = 4.5f;
        coin2.GetInfo();

        Coins coin3 = new Coins("Indian 5 Rupees", "India", "Nickel Brass", 5.0f, 2018, 6.0f);
        // coin3.name = "Indian 5 Rupees";
        // coin3.country = "India";
        // coin3.material = "Nickel Brass";
        // coin3.value = 5.0f;
        // coin3.year = 2018;
        // coin3.weight = 6.0f;
        coin3.GetInfo();

        Coins coin4 = new Coins("Indian 10 Rupees", "India", "Bimetallic", 10.0f, 2021, 7.7f);
        // coin4.name = "Indian 10 Rupees";
        // coin4.country = "India";
        // coin4.material = "Bimetallic";
        // coin4.value = 10.0f;
        // coin4.year = 2021;
        // coin4.weight = 7.7f;
        coin4.GetInfo();

        Coins coin5 = new Coins("US Penny", "USA", "Copper Plated Zinc", 0.01f, 2019, 2.5f);
        // coin5.name = "US Penny";
        // coin5.country = "USA";
        // coin5.material = "Copper Plated Zinc";
        // coin5.value = 0.01f;
        // coin5.year = 2019;
        // coin5.weight = 2.5f;
        coin5.GetInfo();

        Coins coin6 = new Coins("US Nickel", "USA", "Cupro-Nickel", 0.05f, 2018, 5.0f);
        // coin6.name = "US Nickel";
        // coin6.country = "USA";
        // coin6.material = "Cupro-Nickel";
        // coin6.value = 0.05f;
        // coin6.year = 2018;
        // coin6.weight = 5.0f;
        coin6.GetInfo();

        Coins coin7 = new Coins("US Dime", "USA", "Cupro-Nickel", 0.10f, 2022, 2.27f);
        // coin7.name = "US Dime";
        // coin7.country = "USA";
        // coin7.material = "Cupro-Nickel";
        // coin7.value = 0.10f;
        // coin7.year = 2022;
        // coin7.weight = 2.27f;
        coin7.GetInfo();

        Coins coin8 = new Coins("US Quarter", "USA", "Cupro-Nickel", 0.25f, 2017, 5.67f);
        // coin8.name = "US Quarter";
        // coin8.country = "USA";
        // coin8.material = "Cupro-Nickel";
        // coin8.value = 0.25f;
        // coin8.year = 2017;
        // coin8.weight = 5.67f;
        coin8.GetInfo();

        Coins coin9 = new Coins("US Half Dollar", "USA", "Cupro-Nickel", 0.50f, 2015, 11.34f);
        // coin9.name = "US Half Dollar";
        // coin9.country = "USA";
        // coin9.material = "Cupro-Nickel";
        // coin9.value = 0.50f;
        // coin9.year = 2015;
        // coin9.weight = 11.34f;
        coin9.GetInfo();

        Coins coin10 = new Coins("US Dollar Coin", "USA", "Manganese-Brass", 1.0f, 2019, 8.1f);
        // coin10.name = "US Dollar Coin";
        // coin10.country = "USA";
        // coin10.material = "Manganese-Brass";
        // coin10.value = 1.0f;
        // coin10.year = 2019;
        // coin10.weight = 8.1f;
        coin10.GetInfo();

        Coins coin11 = new Coins("Euro 1 Cent", "European Union", "Copper Plated Steel", 0.01f, 2021, 2.3f);
        // coin11.name = "Euro 1 Cent";
        // coin11.country = "European Union";
        // coin11.material = "Copper Plated Steel";
        // coin11.value = 0.01f;
        // coin11.year = 2021;
        // coin11.weight = 2.3f;
        coin11.GetInfo();

        Coins coin12 = new Coins("Euro 2 Cent", "European Union", "Copper Plated Steel", 0.02f, 2016, 3.06f);
        // coin12.name = "Euro 2 Cent";
        // coin12.country = "European Union";
        // coin12.material = "Copper Plated Steel";
        // coin12.value = 0.02f;
        // coin12.year = 2016;
        // coin12.weight = 3.06f;
        coin12.GetInfo();

        Coins coin13 = new Coins("Euro 5 Cent", "European Union", "Copper Plated Steel", 0.05f, 2017, 3.92f);
        // coin13.name = "Euro 5 Cent";
        // coin13.country = "European Union";
        // coin13.material = "Copper Plated Steel";
        // coin13.value = 0.05f;
        // coin13.year = 2017;
        // coin13.weight = 3.92f;
        coin13.GetInfo();

        Coins coin14 = new Coins("Euro 10 Cent", "European Union", "Nordic Gold", 0.10f, 2019, 4.1f);
        // coin14.name = "Euro 10 Cent";
        // coin14.country = "European Union";
        // coin14.material = "Nordic Gold";
        // coin14.value = 0.10f;
        // coin14.year = 2019;
        // coin14.weight = 4.1f;
        coin14.GetInfo();

        Coins coin15 = new Coins("Euro 20 Cent", "European Union", "Nordic Gold", 0.20f, 2020, 5.74f);
        // coin15.name = "Euro 20 Cent";
        // coin15.country = "European Union";
        // coin15.material = "Nordic Gold";
        // coin15.value = 0.20f;
        // coin15.year = 2020;
        // coin15.weight = 5.74f;
        coin15.GetInfo();

        Coins coin16 = new Coins("Euro 50 Cent", "European Union", "Nordic Gold", 0.50f, 2018, 7.8f);
        // coin16.name = "Euro 50 Cent";
        // coin16.country = "European Union";
        // coin16.material = "Nordic Gold";
        // coin16.value = 0.50f;
        // coin16.year = 2018;
        // coin16.weight = 7.8f;
        coin16.GetInfo();

        Coins coin17 = new Coins("Euro 1", "European Union", "Bimetallic", 1.0f, 2021, 7.5f);
        // coin17.name = "Euro 1";
        // coin17.country = "European Union";
        // coin17.material = "Bimetallic";
        // coin17.value = 1.0f;
        // coin17.year = 2021;
        // coin17.weight = 7.5f;
        coin17.GetInfo();

        Coins coin18 = new Coins("Euro 2", "European Union", "Bimetallic", 2.0f, 2016, 8.5f);
        // coin18.name = "Euro 2";
        // coin18.country = "European Union";
        // coin18.material = "Bimetallic";
        // coin18.value = 2.0f;
        // coin18.year = 2016;
        // coin18.weight = 8.5f;
        coin18.GetInfo();

        Coins coin19 = new Coins("British 1 Pound", "UK", "Nickel-Brass", 1.0f, 2020, 8.75f);
        // coin19.name = "British 1 Pound";
        // coin19.country = "UK";
        // coin19.material = "Nickel-Brass";
        // coin19.value = 1.0f;
        // coin19.year = 2020;
        // coin19.weight = 8.75f;
        coin19.GetInfo();

        Coins coin20 = new Coins("British 2 Pounds", "UK", "Bimetallic", 2.0f, 2018, 12.0f);
        // coin20.name = "British 2 Pounds";
        // coin20.country = "UK";
        // coin20.material = "Bimetallic";
        // coin20.value = 2.0f;
        // coin20.year = 2018;
        // coin20.weight = 12.0f;
        coin20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
