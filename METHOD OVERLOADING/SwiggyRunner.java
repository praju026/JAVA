class SwiggyRunner{
public static void main(String food[]){

System.out.println("MAIN STARTED");

String foodName="Dosa";
int quantity = 4;
double price=Swiggy.getFoodDetails(foodName);
System.out.println(" "+foodName+": Rs"+price);

double priceWithQuantity=Swiggy.getFoodDetails(foodName,quantity);
System.out.println(" "+foodName+" with quantity u7"+quantity+": Rs "+priceWithQuantity);

System.out.println("MAIN ENDED");

}
}
