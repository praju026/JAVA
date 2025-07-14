class BlinkitRunner{
public static void main(String grocery[]){

System.out.println("MAIN STARTED");

String itemName="Paneer";
double price=Blinkit.getItemDetails(itemName);
System.out.println(" "+itemName+": Rs"+price);

System.out.println("MAIN ENDED");

}
}
