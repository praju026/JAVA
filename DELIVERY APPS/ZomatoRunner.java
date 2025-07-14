class ZomatoRunner{
public static void main(String food[]){

System.out.println("MAIN STARTED");

String foodName="Pizza";
double price=Zomato.getFoodDetails(foodName);
System.out.println(" "+foodName+": Rs"+price);

System.out.println("MAIN ENDED");

}
}
