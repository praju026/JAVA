class ZeptoRunner{
public static void main(String grocery[]){

System.out.println("MAIN STARTED");

String itemName="Milk";
int quantity = 5;
double price=Zepto.getItemDetails(itemName);
System.out.println(" "+itemName+": Rs"+price);

double priceWithQuantity=Zepto.getItemDetails(itemName,quantity);
System.out.println(" "+itemName+" with quantity "+quantity+": Rs "+priceWithQuantity);

System.out.println("MAIN ENDED");

}
}
