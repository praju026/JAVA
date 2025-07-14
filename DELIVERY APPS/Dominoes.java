class Dominoes{

static double pizzaRate;

public static double getPizzaDetails(String pizzaName){

if(pizzaName=="Margherita"){
pizzaRate=229.00;
}else if(pizzaName=="Farmhouse"){
pizzaRate=349.00;
}else if(pizzaName=="Peppy Paneer"){
pizzaRate=379.00;
}else if(pizzaName=="Mexican Green Wave"){
pizzaRate=359.00;
}else if(pizzaName=="Deluxe Veggie"){
pizzaRate=389.00;
}else if(pizzaName=="Chicken Golden Delight"){
pizzaRate=419.00;
}else if(pizzaName=="Non Veg Supreme"){
pizzaRate=459.00;
}else if(pizzaName=="Indi Tandoori Paneer"){
pizzaRate=399.00;
}else if(pizzaName=="Veg Extravaganza"){
pizzaRate=429.00;
}else if(pizzaName=="Cheese n Corn"){
pizzaRate=279.00;
}else{
System.out.println("INVALID PIZZA NAME : "+pizzaName);
}
return pizzaRate;
}
}
