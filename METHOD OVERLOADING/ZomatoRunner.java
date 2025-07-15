class ZomatoRunner{
public static void main(String food[]){

System.out.println("MAIN STARTED");
int quantity = 5;
String foodName="Pizza";
double price=Zomato.search(foodName);
System.out.println(" "+foodName+": Rs "+price);

double priceWithQuantity=Zomato.search(foodName,quantity);
System.out.println(" "+foodName+" with quantity u7"+quantity+": Rs "+priceWithQuantity);

System.out.println("MAIN ENDED");

}
}
