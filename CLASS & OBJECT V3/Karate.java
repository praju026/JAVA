class Karate {

Karate(String style,String beltColor,String trainerName,int durationMonths,float fees){
    this.style=style;
    this.beltColor=beltColor;
    this.trainerName=trainerName;
    this.durationMonths=durationMonths;
    this.fees=fees;
}
    String style;
    String beltColor;
    String trainerName;
    int durationMonths;
    float fees;

	public void GetInfo(){
        System.out.println("STYLE : " + style);
        System.out.println("BELT COLOR : " + beltColor);
        System.out.println("TRAINER : " + trainerName);
        System.out.println("DURATION (Months) : " + durationMonths);
        System.out.println("FEES : " + fees);

	}
}
