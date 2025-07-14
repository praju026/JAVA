class Zepto{

static double itemPrice;

public static double getItemDetails(String itemName){

if(itemName=="Milk"){
itemPrice=52.00;
}else if(itemName=="Eggs"){
itemPrice=65.00;
}else if(itemName=="Bread"){
itemPrice=40.00;
}else if(itemName=="Butter"){
itemPrice=90.00;
}else if(itemName=="Rice"){
itemPrice=72.00;
}else if(itemName=="Atta"){
itemPrice=60.00;
}else if(itemName=="Oil"){
itemPrice=120.00;
}else if(itemName=="Sugar"){
itemPrice=45.00;
}else if(itemName=="Salt"){
itemPrice=25.00;
}else if(itemName=="Tea"){
itemPrice=150.00;
}else{
System.out.println("INVALID ITEM NAME : "+itemName);
}
return itemPrice;
}
}
