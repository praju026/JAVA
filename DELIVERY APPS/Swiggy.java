class Swiggy{

static double foodRate;

public static double getFoodDetails(String foodName){

if(foodName=="Dosa"){
foodRate=80.00;
}else if(foodName=="Idli"){
foodRate=50.00;
}else if(foodName=="Vada"){
foodRate=40.00;
}else if(foodName=="Upma"){
foodRate=60.00;
}else if(foodName=="Pongal"){
foodRate=70.00;
}else if(foodName=="Paratha"){
foodRate=90.00;
}else if(foodName=="Chole Bhature"){
foodRate=110.00;
}else if(foodName=="Poha"){
foodRate=55.00;
}else if(foodName=="Aloo Tikki"){
foodRate=75.00;
}else if(foodName=="Paneer Roll"){
foodRate=120.00;
}else{
System.out.println("INVALID FOOD NAME : "+foodName);
}
return foodRate;
}
}
