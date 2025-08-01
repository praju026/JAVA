class Tomato {

    String variety;
    String originState;
    double pricePerKg;
    int avgSizeMm;
    String grade;
    float waterContentPercent;

    Tomato() {
        this("Roma");
        System.out.println("Default constructor");
    }

    Tomato(String variety) {
        this(28.0, "Karnataka");
        System.out.println("1st CONSTRUCTOR INVOKED");
        this.variety = variety;
    }

    Tomato(double pricePerKg, String originState) {
        this(45);
        System.out.println("2nd CONSTRUCTOR INVOKED");
        this.pricePerKg = pricePerKg;
        this.originState = originState;
    }

    Tomato(int avgSizeMm) {
        this("A+", 94.0f);
        System.out.println("3rd CONSTRUCTOR INVOKED");
        this.avgSizeMm = avgSizeMm;
    }

    Tomato(String grade, float waterContentPercent) {
        this("Heirloom", "Kerala", 32.0, 50, grade, waterContentPercent);
        System.out.println("4th CONSTRUCTOR INVOKED");
    }

    Tomato(double pricePerKg, int avgSizeMm) {
        this("AA", 93.0f);
        System.out.println("5th CONSTRUCTOR INVOKED");
        this.pricePerKg = pricePerKg;
        this.avgSizeMm = avgSizeMm;
    }

    Tomato(String variety, String originState, double pricePerKg, int avgSizeMm, String grade, float waterContentPercent) {
        System.out.println("LAST CONSTRUCTOR (6)");
        this.variety = variety;
        this.originState = originState;
        this.pricePerKg = pricePerKg;
        this.avgSizeMm = avgSizeMm;
        this.grade = grade;
        this.waterContentPercent = waterContentPercent;
    }

    public void display() {
        System.out.println("VARIETY       : " + variety);
        System.out.println("ORIGIN        : " + originState);
        System.out.println("PRICE/KG (Rs) : " + pricePerKg);
        System.out.println("AVG SIZE (mm) : " + avgSizeMm);
        System.out.println("GRADE         : " + grade);
        System.out.println("WATER %       : " + waterContentPercent);
        System.out.println("--------------------------------------");
    }

}
