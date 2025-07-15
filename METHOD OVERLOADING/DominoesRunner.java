class DominoesRunner{
public static void main(String pizza[]){

System.out.println("MAIN STARTED");

String pizzaName="Farmhouse";
double rate=Dominoes.getPizzaDetails(pizzaName);
System.out.println(" "+pizzaName+": Rs"+rate);

int quantity =2;
double priceWithQuantity=Dominoes.getPizzaDetails(pizzaName,quantity);
System.out.println(" "+pizzaName+" with quantity "+quantity+": Rs "+priceWithQuantity);


System.out.println("MAIN ENDED");

}
}
