class Festivals {

Festivals(String name,String state,String month,int durationDays,boolean isNationalHoliday,String significance){
System.out.println("PARAMETERIZED CONST");
    this.name=name;
    this.state=state;
    this.month=month;
    this.durationDays=durationDays;
    this.isNationalHoliday=isNationalHoliday;
    this.significance=significance;
	}
    String name;
    String state;
    String month;
    int durationDays;
    boolean isNationalHoliday;
    String significance;

	public void GetInfo(){
        System.out.println("NAME : " + name);
        System.out.println("STATE : " + state);
        System.out.println("MONTH : " + month);
        System.out.println("DURATION DAYS : " + durationDays);
        System.out.println("NATIONAL HOLIDAY : " + isNationalHoliday);
        System.out.println("SIGNIFICANCE : " + significance);

	}
}
