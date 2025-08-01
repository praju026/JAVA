class Holi {
    String theme;
    double gulalKg;
    String city;
    String date;
    int waterTanks;
    float budget;

    Holi() {
        this("Classic");
        System.out.println("Default constructor");
    }

    Holi(String theme) {
        this(25.0, "Mathura");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.theme = theme;
    }

    Holi(double gulalKg, String city) {
        this(10);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.gulalKg = gulalKg;
        this.city = city;
    }

    Holi(int waterTanks) {
        this("2025-03-14", "Vrindavan");
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.waterTanks = waterTanks;
    }

    Holi(String date, String city) {
        this(45000.0f);
        System.out.println("4th CONSTRUCTOR INVOKED");
        this.date = date;
        this.city = city;
    }

    Holi(float budget) {
        this("Neon", 40.0, "Jaipur", "2025-03-24", 12, budget);
        System.out.println("5th CONSTRUCTOR INVOKED");
    }

    Holi(String theme, double gulalKg, String city, String date, int waterTanks, float budget) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.theme = theme;
        this.gulalKg = gulalKg;
        this.city = city;
        this.date = date;
        this.waterTanks = waterTanks;
        this.budget = budget;
    }

    public void display() {
        System.out.println("THEME         : " + theme);
        System.out.println("GULAL (kg)    : " + gulalKg);
        System.out.println("CITY          : " + city);
        System.out.println("DATE          : " + date);
        System.out.println("WATER TANKS   : " + waterTanks);
        System.out.println("BUDGET (Rs)   : " + budget);
        System.out.println("--------------------------------------");
    }

}

