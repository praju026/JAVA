class Zomato{

public static double search(String foodName){
double foodRate=0;
if(foodName=="Burger"){
	foodRate=199.00;
	return foodRate;
}else if(foodName=="Pizza"){
	foodRate=299.00;
	return foodRate;
}else if(foodName=="Fries"){
	foodRate=149.00;
	return foodRate;
}else if(foodName=="Pasta"){
	foodRate=249.00;
	return foodRate;
}else if(foodName=="Sandwich"){
	foodRate=179.00;
	return foodRate;
}else if(foodName=="Wrap"){
	foodRate=159.00;
	return foodRate;
}else if(foodName=="Noodles"){
	foodRate=139.00;
	return foodRate;
}else if(foodName=="Fried Rice"){
	foodRate=189.00;
	return foodRate;
}else if(foodName=="Momos"){
	foodRate=129.00;
	return foodRate;
}else if(foodName=="Biryani"){
	foodRate=219.00;
	return foodRate;
}else if(foodName=="Paneer Tikka"){
	foodRate=239.00;
	return foodRate;
}else if(foodName=="Chicken 65"){
	foodRate=259.00;
	return foodRate;
}else if(foodName=="Malai Kofta"){
	foodRate=199.00;
	return foodRate;
}else if(foodName=="Tandoori Roti"){
	foodRate=25.00;
	return foodRate;
}else if(foodName=="Butter Naan"){
	foodRate=35.00;
	return foodRate;
}else if(foodName=="Gobi Manchurian"){
	foodRate=179.00;
	return foodRate;
}else if(foodName=="Veg Korma"){
	foodRate=199.00;
	return foodRate;
}else if(foodName=="Kebab"){
	foodRate=249.00;
	return foodRate;
}else if(foodName=="Hakka Noodles"){
	foodRate=159.00;
	return foodRate;
}else if(foodName=="Veg Pulao"){
	foodRate=189.00;
	return foodRate;
}else if(foodName=="Chicken Curry"){
	foodRate=269.00;
	return foodRate;
}else if(foodName=="Fish Fry"){
	foodRate=289.00;
	return foodRate;
}else if(foodName=="Dal Makhani"){
	foodRate=169.00;
	return foodRate;
}else if(foodName=="Chole Bhature"){
	foodRate=159.00;
	return foodRate;
}else if(foodName=="Rajma Chawal"){
	foodRate=149.00;
	return foodRate;
}else if(foodName=="Masala Dosa"){
	foodRate=99.00;
	return foodRate;
}else if(foodName=="Idli Vada"){
	foodRate=89.00;
	return foodRate;
}else if(foodName=="Samosa"){
	foodRate=49.00;
	return foodRate;
}else if(foodName=="Kachori"){
	foodRate=59.00;
	return foodRate;
}else if(foodName=="Chaat Platter"){
	foodRate=139.00;
	return foodRate;
}else{
System.out.println("INVALID FOOD NAME : "+foodName);
}
return foodRate;
}

public static double search(String foodName,int quantity){
double foodRate=0;
if(foodName=="Burger"){
	foodRate=199.00*quantity;
	return foodRate;
}else if(foodName=="Pizza"){
	foodRate=299.00*quantity;
	return foodRate;
}else if(foodName=="Fries"){
	foodRate=149.00*quantity;
	return foodRate;
}else if(foodName=="Pasta"){
	foodRate=249.00*quantity;
	return foodRate;
}else if(foodName=="Sandwich"){
	foodRate=179.00*quantity;
	return foodRate;
}else if(foodName=="Wrap"){
	foodRate=159.00*quantity;
	return foodRate;
}else if(foodName=="Noodles"){
	foodRate=139.00*quantity;
	return foodRate;
}else if(foodName=="Fried Rice"){
	foodRate=189.00*quantity;
	return foodRate;
}else if(foodName=="Momos"){
	foodRate=129.00*quantity;
	return foodRate;
}else if(foodName=="Biryani"){
	foodRate=219.00*quantity;
	return foodRate;
}else if(foodName=="Paneer Tikka"){
	foodRate=239.00*quantity;
	return foodRate;
}else if(foodName=="Chicken 65"){
	foodRate=259.00*quantity;
	return foodRate;
}else if(foodName=="Malai Kofta"){
	foodRate=199.00*quantity;
	return foodRate;
}else if(foodName=="Tandoori Roti"){
	foodRate=25.00*quantity;
	return foodRate;
}else if(foodName=="Butter Naan"){
	foodRate=35.00*quantity;
	return foodRate;
}else if(foodName=="Gobi Manchurian"){
	foodRate=179.00*quantity;
	return foodRate;
}else if(foodName=="Veg Korma"){
	foodRate=199.00*quantity;
	return foodRate;
}else if(foodName=="Kebab"){
	foodRate=249.00*quantity;
	return foodRate;
}else if(foodName=="Hakka Noodles"){
	foodRate=159.00*quantity;
	return foodRate;
}else if(foodName=="Veg Pulao"){
	foodRate=189.00*quantity;
	return foodRate;
}else if(foodName=="Chicken Curry"){
	foodRate=269.00*quantity;
	return foodRate;
}else if(foodName=="Fish Fry"){
	foodRate=289.00*quantity;
	return foodRate;
}else if(foodName=="Dal Makhani"){
	foodRate=169.00*quantity;
	return foodRate;
}else if(foodName=="Chole Bhature"){
	foodRate=159.00*quantity;
	return foodRate;
}else if(foodName=="Rajma Chawal"){
	foodRate=149.00*quantity;
	return foodRate;
}else if(foodName=="Masala Dosa"){
	foodRate=99.00*quantity;
	return foodRate;
}else if(foodName=="Idli Vada"){
	foodRate=89.00*quantity;
	return foodRate;
}else if(foodName=="Samosa"){
	foodRate=49.00*quantity;
	return foodRate;
}else if(foodName=="Kachori"){
	foodRate=59.00*quantity;
	return foodRate;
}else if(foodName=="Chaat Platter"){
	foodRate=139.00*quantity;
	return foodRate;
}else{
System.out.println("INVALID FOOD NAME : "+foodName);
}
return foodRate;
}
}
