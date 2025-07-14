class Blinkit{

static double itemPrice;

public static double getItemDetails(String itemName){

if(itemName=="Toor Dal"){
itemPrice=140.00;
}else if(itemName=="Onion"){
itemPrice=30.00;
}else if(itemName=="Tomato"){
itemPrice=28.00;
}else if(itemName=="Potato"){
itemPrice=25.00;
}else if(itemName=="Shampoo"){
itemPrice=180.00;
}else if(itemName=="Toothpaste"){
itemPrice=95.00;
}else if(itemName=="Handwash"){
itemPrice=85.00;
}else if(itemName=="Soap"){
itemPrice=45.00;
}else if(itemName=="Detergent"){
itemPrice=115.00;
}else if(itemName=="Paneer"){
itemPrice=90.00;
}else{
System.out.println("INVALID ITEM NAME : "+itemName);
}
return itemPrice;
}
}
