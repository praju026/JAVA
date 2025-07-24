class FestivalsRunner {

    public static void main(String args[]) {
        System.out.println("MAIN STARTED");

        Festivals fest1 = new Festivals();
        fest1.name = "Diwali";
        fest1.state = "All India";
        fest1.month = "October-November";
        fest1.durationDays = 5;
        fest1.isNationalHoliday = true;
        fest1.significance = "Festival of Lights";
        fest1.GetInfo();

        Festivals fest2 = new Festivals();
        fest2.name = "Holi";
        fest2.state = "All India";
        fest2.month = "March";
        fest2.durationDays = 2;
        fest2.isNationalHoliday = true;
        fest2.significance = "Festival of Colors";
        fest2.GetInfo();

        Festivals fest3 = new Festivals();
        fest3.name = "Navratri";
        fest3.state = "Gujarat";
        fest3.month = "September-October";
        fest3.durationDays = 9;
        fest3.isNationalHoliday = false;
        fest3.significance = "Worship of Goddess Durga";
        fest3.GetInfo();

        Festivals fest4 = new Festivals();
        fest4.name = "Pongal";
        fest4.state = "Tamil Nadu";
        fest4.month = "January";
        fest4.durationDays = 4;
        fest4.isNationalHoliday = true;
        fest4.significance = "Harvest Festival";
        fest4.GetInfo();

        Festivals fest5 = new Festivals();
        fest5.name = "Onam";
        fest5.state = "Kerala";
        fest5.month = "August-September";
        fest5.durationDays = 10;
        fest5.isNationalHoliday = true;
        fest5.significance = "Homecoming of King Mahabali";
        fest5.GetInfo();

        Festivals fest6 = new Festivals();
        fest6.name = "Baisakhi";
        fest6.state = "Punjab";
        fest6.month = "April";
        fest6.durationDays = 1;
        fest6.isNationalHoliday = true;
        fest6.significance = "Harvest Festival of Punjab";
        fest6.GetInfo();

        Festivals fest7 = new Festivals();
        fest7.name = "Ganesh Chaturthi";
        fest7.state = "Maharashtra";
        fest7.month = "August-September";
        fest7.durationDays = 10;
        fest7.isNationalHoliday = false;
        fest7.significance = "Birth of Lord Ganesha";
        fest7.GetInfo();

        Festivals fest8 = new Festivals();
        fest8.name = "Durga Puja";
        fest8.state = "West Bengal";
        fest8.month = "September-October";
        fest8.durationDays = 5;
        fest8.isNationalHoliday = true;
        fest8.significance = "Worship of Goddess Durga";
        fest8.GetInfo();

        Festivals fest9 = new Festivals();
        fest9.name = "Eid-ul-Fitr";
        fest9.state = "All India";
        fest9.month = "Varies";
        fest9.durationDays = 1;
        fest9.isNationalHoliday = true;
        fest9.significance = "End of Ramadan";
        fest9.GetInfo();

        Festivals fest10 = new Festivals();
        fest10.name = "Christmas";
        fest10.state = "All India";
        fest10.month = "December";
        fest10.durationDays = 1;
        fest10.isNationalHoliday = true;
        fest10.significance = "Birth of Jesus Christ";
        fest10.GetInfo();

        Festivals fest11 = new Festivals();
        fest11.name = "Makar Sankranti";
        fest11.state = "All India";
        fest11.month = "January";
        fest11.durationDays = 1;
        fest11.isNationalHoliday = true;
        fest11.significance = "Harvest and Kite Festival";
        fest11.GetInfo();

        Festivals fest12 = new Festivals();
        fest12.name = "Raksha Bandhan";
        fest12.state = "All India";
        fest12.month = "August";
        fest12.durationDays = 1;
        fest12.isNationalHoliday = false;
        fest12.significance = "Bond of Brother and Sister";
        fest12.GetInfo();

        Festivals fest13 = new Festivals();
        fest13.name = "Janmashtami";
        fest13.state = "Uttar Pradesh";
        fest13.month = "August";
        fest13.durationDays = 2;
        fest13.isNationalHoliday = false;
        fest13.significance = "Birth of Lord Krishna";
        fest13.GetInfo();

        Festivals fest14 = new Festivals();
        fest14.name = "Karva Chauth";
        fest14.state = "North India";
        fest14.month = "October-November";
        fest14.durationDays = 1;
        fest14.isNationalHoliday = false;
        fest14.significance = "Fasting for Husband's Long Life";
        fest14.GetInfo();

        Festivals fest15 = new Festivals();
        fest15.name = "Bihu";
        fest15.state = "Assam";
        fest15.month = "April";
        fest15.durationDays = 7;
        fest15.isNationalHoliday = true;
        fest15.significance = "Harvest Festival of Assam";
        fest15.GetInfo();

        Festivals fest16 = new Festivals();
        fest16.name = "Ugadi";
        fest16.state = "Andhra Pradesh";
        fest16.month = "March-April";
        fest16.durationDays = 1;
        fest16.isNationalHoliday = true;
        fest16.significance = "New Year of Andhra & Karnataka";
        fest16.GetInfo();

        Festivals fest17 = new Festivals();
        fest17.name = "Vishu";
        fest17.state = "Kerala";
        fest17.month = "April";
        fest17.durationDays = 1;
        fest17.isNationalHoliday = true;
        fest17.significance = "Malayalam New Year";
        fest17.GetInfo();

        Festivals fest18 = new Festivals();
        fest18.name = "Mahashivratri";
        fest18.state = "All India";
        fest18.month = "February-March";
        fest18.durationDays = 1;
        fest18.isNationalHoliday = true;
        fest18.significance = "Worship of Lord Shiva";
        fest18.GetInfo();

        Festivals fest19 = new Festivals();
        fest19.name = "Ram Navami";
        fest19.state = "All India";
        fest19.month = "March-April";
        fest19.durationDays = 1;
        fest19.isNationalHoliday = true;
        fest19.significance = "Birth of Lord Rama";
        fest19.GetInfo();

        Festivals fest20 = new Festivals();
        fest20.name = "Buddha Purnima";
        fest20.state = "All India";
        fest20.month = "April-May";
        fest20.durationDays = 1;
        fest20.isNationalHoliday = true;
        fest20.significance = "Birth of Lord Buddha";
        fest20.GetInfo();

        System.out.println("MAIN ENDED");
    }
}
