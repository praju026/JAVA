class Marble {
    String color;
    String type;
    String origin;
    float pricePerKg;
    boolean isPolished;
    String pattern;

public Marble(String color, String type, String origin, float pricePerKg, boolean isPolished, String pattern) {
    this.color = color;
    this.type = type;
    this.origin = origin;
    this.pricePerKg = pricePerKg;
    this.isPolished = isPolished;
    this.pattern = pattern;
}

	public void GetInfo(){
	System.out.println("COLOR : " + color);
        System.out.println("TYPE : " + type);
        System.out.println("ORIGIN : " + origin);
        System.out.println("PRICE/KG : " + pricePerKg);
        System.out.println("POLISHED : " + isPolished);
        System.out.println("PATTERN : " + pattern);

	}
}
