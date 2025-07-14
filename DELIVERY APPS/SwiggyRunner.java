class SwiggyRunner{
public static void main(String food[]){

System.out.println("MAIN STARTED");

String foodName="Dosa";
double price=Swiggy.getFoodDetails(foodName);
System.out.println(" "+foodName+": Rs"+price);

System.out.println("MAIN ENDED");

}
}
