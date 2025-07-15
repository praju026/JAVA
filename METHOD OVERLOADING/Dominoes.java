class Dominoes{

public static double getPizzaDetails(String pizzaName){
double pizzaRate = 0;
if(pizzaName=="Margherita"){
	pizzaRate=229.00;
	return pizzaRate;
}else if(pizzaName=="Farmhouse"){
	pizzaRate=349.00;
	return pizzaRate;
}else if(pizzaName=="Peppy Paneer"){
	pizzaRate=379.00;
	return pizzaRate;
}else if(pizzaName=="Mexican Green Wave"){
	pizzaRate=359.00;
	return pizzaRate;
}else if(pizzaName=="Deluxe Veggie"){
	pizzaRate=389.00;
	return pizzaRate;
}else if(pizzaName=="Chicken Golden Delight"){
	pizzaRate=419.00;
	return pizzaRate;
}else if(pizzaName=="Non Veg Supreme"){
	pizzaRate=459.00;
	return pizzaRate;
}else if(pizzaName=="Indi Tandoori Paneer"){
	pizzaRate=399.00;
	return pizzaRate;
}else if(pizzaName=="Veg Extravaganza"){
	pizzaRate=429.00;
	return pizzaRate;
}else if(pizzaName=="Cheese n Corn"){
	pizzaRate=279.00;
	return pizzaRate;
}else if(pizzaName=="Paneer Makhani"){
	pizzaRate=389.00;
	return pizzaRate;
}else if(pizzaName=="Keema Do Pyaza"){
	pizzaRate=449.00;
	return pizzaRate;
}else if(pizzaName=="Pepper Barbecue Chicken"){
	pizzaRate=409.00;
	return pizzaRate;
}else if(pizzaName=="Veggie Paradise"){
	pizzaRate=369.00;
	return pizzaRate;
}else if(pizzaName=="Double Cheese Margherita"){
	pizzaRate=289.00;
	return pizzaRate;
}else if(pizzaName=="Chicken Sausage"){
	pizzaRate=319.00;
	return pizzaRate;
}else if(pizzaName=="Peri Peri Chicken"){
	pizzaRate=439.00;
	return pizzaRate;
}else if(pizzaName=="Zesty Paneer"){
	pizzaRate=399.00;
	return pizzaRate;
}else if(pizzaName=="Tikka Masala Pizza"){
	pizzaRate=389.00;
	return pizzaRate;
}else if(pizzaName=="Cheesy Sausage"){
	pizzaRate=349.00;
	return pizzaRate;
}else if(pizzaName=="Classic Hand Tossed"){
	pizzaRate=259.00;
	return pizzaRate;
}else if(pizzaName=="Garlic Breadsticks"){
	pizzaRate=109.00;
	return pizzaRate;
}else if(pizzaName=="Stuffed Garlic Bread"){
	pizzaRate=139.00;
	return pizzaRate;
}else if(pizzaName=="Taco Mexicana"){
	pizzaRate=129.00;
	return pizzaRate;
}else if(pizzaName=="Crinkle Fries"){
	pizzaRate=99.00;
	return pizzaRate;
}else if(pizzaName=="Brownie Fantasy"){
	pizzaRate=89.00;
	return pizzaRate;
}else if(pizzaName=="Choco Lava Cake"){
	pizzaRate=99.00;
	return pizzaRate;
}else if(pizzaName=="Pepsi Can"){
	pizzaRate=60.00;
	return pizzaRate;
}else if(pizzaName=="7Up Bottle"){
	pizzaRate=60.00;
	return pizzaRate;
}else if(pizzaName=="Cheesy Dip"){
	pizzaRate=25.00;
	return pizzaRate;
}else{
	System.out.println("INVALID PIZZA NAME : "+pizzaName);
}
	return pizzaRate;
}

public static double getPizzaDetails(String pizzaName,int quantity){
double pizzaRate = 0;
if(pizzaName=="Margherita"){
	pizzaRate=229.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Farmhouse"){
	pizzaRate=349.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Peppy Paneer"){
	pizzaRate=379.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Mexican Green Wave"){
	pizzaRate=359.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Deluxe Veggie"){
	pizzaRate=389.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Chicken Golden Delight"){
	pizzaRate=419.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Non Veg Supreme"){
	pizzaRate=459.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Indi Tandoori Paneer"){
	pizzaRate=399.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Veg Extravaganza"){
	pizzaRate=429.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Cheese n Corn"){
	pizzaRate=279.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Paneer Makhani"){
	pizzaRate=389.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Keema Do Pyaza"){
	pizzaRate=449.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Pepper Barbecue Chicken"){
	pizzaRate=409.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Veggie Paradise"){
	pizzaRate=369.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Double Cheese Margherita"){
	pizzaRate=289.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Chicken Sausage"){
	pizzaRate=319.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Peri Peri Chicken"){
	pizzaRate=439.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Zesty Paneer"){
	pizzaRate=399.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Tikka Masala Pizza"){
	pizzaRate=389.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Cheesy Sausage"){
	pizzaRate=349.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Classic Hand Tossed"){
	pizzaRate=259.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Garlic Breadsticks"){
	pizzaRate=109.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Stuffed Garlic Bread"){
	pizzaRate=139.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Taco Mexicana"){
	pizzaRate=129.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Crinkle Fries"){
	pizzaRate=99.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Brownie Fantasy"){
	pizzaRate=89.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Choco Lava Cake"){
	pizzaRate=99.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Pepsi Can"){
	pizzaRate=60.00*quantity;
	return pizzaRate;
}else if(pizzaName=="7Up Bottle"){
	pizzaRate=60.00*quantity;
	return pizzaRate;
}else if(pizzaName=="Cheesy Dip"){
	pizzaRate=25.00*quantity;
	return pizzaRate;
}else{
	System.out.println("INVALID PIZZA NAME : "+pizzaName);
}
	return pizzaRate;
}
}
