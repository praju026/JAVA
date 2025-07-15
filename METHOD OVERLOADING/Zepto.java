class Zepto{

public static double getItemDetails(String itemName){
double itemPrice=0;
if(itemName=="Milk"){
	itemPrice=52.00;
	return itemPrice;
}else if(itemName=="Eggs"){
	itemPrice=65.00;
	return itemPrice;
}else if(itemName=="Bread"){
	itemPrice=40.00;
	return itemPrice;
}else if(itemName=="Butter"){
	itemPrice=90.00;
	return itemPrice;
}else if(itemName=="Rice"){
	itemPrice=72.00;
	return itemPrice;
}else if(itemName=="Atta"){
	itemPrice=60.00;
	return itemPrice;
}else if(itemName=="Oil"){
	itemPrice=120.00;
	return itemPrice;
}else if(itemName=="Sugar"){
	itemPrice=45.00;
	return itemPrice;
}else if(itemName=="Salt"){
	itemPrice=25.00;
	return itemPrice;
}else if(itemName=="Tea Powder"){
	itemPrice=150.00;
	return itemPrice;
}else if(itemName=="Coffee Powder"){
	itemPrice=170.00;
	return itemPrice;
}else if(itemName=="Green Gram"){
	itemPrice=95.00;
	return itemPrice;
}else if(itemName=="Urad Dal"){
	itemPrice=110.00;
	return itemPrice;
}else if(itemName=="Toor Dal"){
	itemPrice=140.00;
	return itemPrice;
}else if(itemName=="Moong Dal"){
	itemPrice=105.00;
	return itemPrice;
}else if(itemName=="Besan"){
	itemPrice=60.00;
	return itemPrice;
}else if(itemName=="Maida"){
	itemPrice=45.00;
	return itemPrice;
}else if(itemName=="Suji"){
	itemPrice=42.00;
	return itemPrice;
}else if(itemName=="Paneer"){
	itemPrice=90.00;
	return itemPrice;
}else if(itemName=="Curd"){
	itemPrice=50.00;
	return itemPrice;
}else if(itemName=="Ghee"){
	itemPrice=180.00;
	return itemPrice;
}else if(itemName=="Honey"){
	itemPrice=135.00;
	return itemPrice;
}else if(itemName=="Ketchup"){
	itemPrice=85.00;
	return itemPrice;
}else if(itemName=="Pickle"){
	itemPrice=70.00;
	return itemPrice;
}else if(itemName=="Chilli Powder"){
	itemPrice=40.00;
	return itemPrice;
}else if(itemName=="Turmeric Powder"){
	itemPrice=35.00;
	return itemPrice;
}else if(itemName=="Coriander Powder"){
	itemPrice=38.00;
	return itemPrice;
}else if(itemName=="Garlic Paste"){
	itemPrice=60.00;
	return itemPrice;
}else if(itemName=="Ginger Paste"){
	itemPrice=58.00;
	return itemPrice;
}else if(itemName=="Coconut Oil"){
	itemPrice=130.00;
	return itemPrice;
}else{
	System.out.println("INVALID ITEM NAME : "+itemName);
}
	return itemPrice;
}

public static double getItemDetails(String itemName,int quantity){
double itemPrice=0;
if(itemName=="Milk"){
	itemPrice=52.00*quantity;
	return itemPrice;
}else if(itemName=="Eggs"){
	itemPrice=65.00*quantity;
	return itemPrice;
}else if(itemName=="Bread"){
	itemPrice=40.00*quantity;
	return itemPrice;
}else if(itemName=="Butter"){
	itemPrice=90.00*quantity;
	return itemPrice;
}else if(itemName=="Rice"){
	itemPrice=72.00*quantity;
	return itemPrice;
}else if(itemName=="Atta"){
	itemPrice=60.00*quantity;
	return itemPrice;
}else if(itemName=="Oil"){
	itemPrice=120.00*quantity;
	return itemPrice;
}else if(itemName=="Sugar"){
	itemPrice=45.00*quantity;
	return itemPrice;
}else if(itemName=="Salt"){
	itemPrice=25.00*quantity;
	return itemPrice;
}else if(itemName=="Tea Powder"){
	itemPrice=150.00*quantity;
	return itemPrice;
}else if(itemName=="Coffee Powder"){
	itemPrice=170.00*quantity;
	return itemPrice;
}else if(itemName=="Green Gram"){
	itemPrice=95.00*quantity;
	return itemPrice;
}else if(itemName=="Urad Dal"){
	itemPrice=110.00*quantity;
	return itemPrice;
}else if(itemName=="Toor Dal"){
	itemPrice=140.00*quantity;
	return itemPrice;
}else if(itemName=="Moong Dal"){
	itemPrice=105.00*quantity;
	return itemPrice;
}else if(itemName=="Besan"){
	itemPrice=60.00*quantity;
	return itemPrice;
}else if(itemName=="Maida"){
	itemPrice=45.00*quantity;
	return itemPrice;
}else if(itemName=="Suji"){
	itemPrice=42.00*quantity;
	return itemPrice;
}else if(itemName=="Paneer"){
	itemPrice=90.00*quantity;
	return itemPrice;
}else if(itemName=="Curd"){
	itemPrice=50.00*quantity;
	return itemPrice;
}else if(itemName=="Ghee"){
	itemPrice=180.00*quantity;
	return itemPrice;
}else if(itemName=="Honey"){
	itemPrice=135.00*quantity;
	return itemPrice;
}else if(itemName=="Ketchup"){
	itemPrice=85.00*quantity;
	return itemPrice;
}else if(itemName=="Pickle"){
	itemPrice=70.00*quantity;
	return itemPrice;
}else if(itemName=="Chilli Powder"){
	itemPrice=40.00*quantity;
	return itemPrice;
}else if(itemName=="Turmeric Powder"){
	itemPrice=35.00*quantity;
	return itemPrice;
}else if(itemName=="Coriander Powder"){
	itemPrice=38.00*quantity;
	return itemPrice;
}else if(itemName=="Garlic Paste"){
	itemPrice=60.00*quantity;
	return itemPrice;
}else if(itemName=="Ginger Paste"){
	itemPrice=58.00*quantity;
	return itemPrice;
}else if(itemName=="Coconut Oil"){
	itemPrice=130.00*quantity;
	return itemPrice;
}else{
	System.out.println("INVALID ITEM NAME : "+itemName);
}
	return itemPrice;
}
}
