class ZeptoRunner{
public static void main(String grocery[]){

System.out.println("MAIN STARTED");

String itemName="Milk";
double price=Zepto.getItemDetails(itemName);
System.out.println(" "+itemName+": Rs"+price);

System.out.println("MAIN ENDED");

}
}
