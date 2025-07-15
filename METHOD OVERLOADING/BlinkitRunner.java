class BlinkitRunner{
public static void main(String grocery[]){

System.out.println("MAIN STARTED");

String itemName="Tomato";
double price=Blinkit.getItemDetails(itemName);
System.out.println(" "+itemName+": Rs "+price);

int quantity = 10;
double priceWithQuantity=Blinkit.getItemDetails(itemName,quantity);
System.out.println(" "+itemName+" with quantity "+quantity+": Rs "+priceWithQuantity);


System.out.println("MAIN ENDED");

}
}
