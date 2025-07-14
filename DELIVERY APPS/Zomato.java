class Zomato{

static double foodRate;

public static double getFoodDetails(String foodName){

if(foodName=="Burger"){
foodRate=199.00;
}else if(foodName=="Pizza"){
foodRate=299.00;
}else if(foodName=="Fries"){
foodRate=149.00;
}else if(foodName=="Pasta"){
foodRate=249.00;
}else if(foodName=="Sandwich"){
foodRate=179.00;
}else if(foodName=="Wrap"){
foodRate=159.00;
}else if(foodName=="Noodles"){
foodRate=139.00;
}else if(foodName=="Fried Rice"){
foodRate=189.00;
}else if(foodName=="Momos"){
foodRate=129.00;
}else if(foodName=="Biryani"){
foodRate=219.00;
}else{
System.out.println("INVALID FOOD NAME : "+foodName);
}
return foodRate;
}
}
