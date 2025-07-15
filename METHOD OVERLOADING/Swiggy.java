class Swiggy{

public static double getFoodDetails(String foodName){
double foodRate = 0;
if(foodName=="Dosa"){
	foodRate=80.00;
	return foodRate;
}else if(foodName=="Idli"){
	foodRate=50.00;
	return foodRate;
}else if(foodName=="Vada"){
	foodRate=40.00;
	return foodRate;
}else if(foodName=="Upma"){
	foodRate=60.00;
	return foodRate;
}else if(foodName=="Pongal"){
	foodRate=70.00;
	return foodRate;
}else if(foodName=="Paratha"){
	foodRate=90.00;
	return foodRate;
}else if(foodName=="Poha"){
	foodRate=55.00;
	return foodRate;
}else if(foodName=="Aloo Tikki"){
	foodRate=75.00;
	return foodRate;
}else if(foodName=="Paneer Roll"){
	foodRate=120.00;
	return foodRate;
}else if(foodName=="Kathi Roll"){
	foodRate=130.00;
	return foodRate;
}else if(foodName=="Egg Curry"){
	foodRate=160.00;
	return foodRate;
}else if(foodName=="Tandoori Chicken"){
	foodRate=240.00;
	return foodRate;
}else if(foodName=="Chicken Shawarma"){
	foodRate=190.00;
	return foodRate;
}else if(foodName=="Egg Fried Rice"){
	foodRate=150.00;
	return foodRate;
}else if(foodName=="Mutton Biryani"){
	foodRate=270.00;
	return foodRate;
}else if(foodName=="Rava Dosa"){
	foodRate=95.00;
	return foodRate;
}else if(foodName=="Chana Masala"){
	foodRate=130.00;
	return foodRate;
}else if(foodName=="Lassi"){
	foodRate=60.00;
	return foodRate;
}else if(foodName=="Cold Coffee"){
	foodRate=80.00;
	return foodRate;
}else if(foodName=="Milkshake"){
	foodRate=90.00;
	return foodRate;
}else if(foodName=="Gulab Jamun"){
	foodRate=55.00;
	return foodRate;
}else if(foodName=="Rasgulla"){
	foodRate=60.00;
	return foodRate;
}else if(foodName=="Jalebi"){
	foodRate=50.00;
	return foodRate;
}else if(foodName=="Ice Cream"){
	foodRate=70.00;
	return foodRate;
}else if(foodName=="Falooda"){
	foodRate=95.00;
	return foodRate;
}else if(foodName=="Pav Bhaji"){
	foodRate=99.00;
	return foodRate;
}else if(foodName=="Misal Pav"){
	foodRate=89.00;
	return foodRate;
}else if(foodName=="Sabudana Khichdi"){
	foodRate=85.00;
	return foodRate;
}else if(foodName=="Thali"){
	foodRate=199.00;
	return foodRate;
}else if(foodName=="Veg Cutlet"){
	foodRate=69.00;
	return foodRate;
}else{
	System.out.println("INVALID FOOD NAME : "+foodName);
}
	return foodRate;
}

public static double getFoodDetails(String foodName,int quantity){
double foodRate = 0;
if(foodName=="Dosa"){
	foodRate=80.00*quantity;
	return foodRate;
}else if(foodName=="Idli"){
	foodRate=50.00*quantity;
	return foodRate;
}else if(foodName=="Vada"){
	foodRate=40.00*quantity;
	return foodRate;
}else if(foodName=="Upma"){
	foodRate=60.00*quantity;
	return foodRate;
}else if(foodName=="Pongal"){
	foodRate=70.00*quantity;
	return foodRate;
}else if(foodName=="Paratha"){
	foodRate=90.00*quantity;
	return foodRate;
}else if(foodName=="Poha"){
	foodRate=55.00*quantity;
	return foodRate;
}else if(foodName=="Aloo Tikki"){
	foodRate=75.00*quantity;
	return foodRate;
}else if(foodName=="Paneer Roll"){
	foodRate=120.00*quantity;
	return foodRate;
}else if(foodName=="Kathi Roll"){
	foodRate=130.00*quantity;
	return foodRate;
}else if(foodName=="Egg Curry"){
	foodRate=160.00*quantity;
	return foodRate;
}else if(foodName=="Tandoori Chicken"){
	foodRate=240.00*quantity;
	return foodRate;
}else if(foodName=="Chicken Shawarma"){
	foodRate=190.00*quantity;
	return foodRate;
}else if(foodName=="Egg Fried Rice"){
	foodRate=150.00*quantity;
	return foodRate;
}else if(foodName=="Mutton Biryani"){
	foodRate=270.00*quantity;
	return foodRate;
}else if(foodName=="Rava Dosa"){
	foodRate=95.00*quantity;
	return foodRate;
}else if(foodName=="Chana Masala"){
	foodRate=130.00*quantity;
	return foodRate;
}else if(foodName=="Lassi"){
	foodRate=60.00*quantity;
	return foodRate;
}else if(foodName=="Cold Coffee"){
	foodRate=80.00*quantity;
	return foodRate;
}else if(foodName=="Milkshake"){
	foodRate=90.00*quantity;
	return foodRate;
}else if(foodName=="Gulab Jamun"){
	foodRate=55.00*quantity;
	return foodRate;
}else if(foodName=="Rasgulla"){
	foodRate=60.00*quantity;
	return foodRate;
}else if(foodName=="Jalebi"){
	foodRate=50.00*quantity;
	return foodRate;
}else if(foodName=="Ice Cream"){
	foodRate=70.00*quantity;
	return foodRate;
}else if(foodName=="Falooda"){
	foodRate=95.00*quantity;
	return foodRate;
}else if(foodName=="Pav Bhaji"){
	foodRate=99.00*quantity;
	return foodRate;
}else if(foodName=="Misal Pav"){
	foodRate=89.00*quantity;
	return foodRate;
}else if(foodName=="Sabudana Khichdi"){
	foodRate=85.00*quantity;
	return foodRate;
}else if(foodName=="Thali"){
	foodRate=199.00*quantity;
	return foodRate;
}else if(foodName=="Veg Cutlet"){
	foodRate=69.00*quantity;
	return foodRate;
}else{
	System.out.println("INVALID FOOD NAME : "+foodName);
}
	return foodRate;
}
}
