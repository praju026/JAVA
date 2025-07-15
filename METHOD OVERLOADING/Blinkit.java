class Blinkit{

public static double getItemDetails(String itemName){
double itemPrice = 0;
if(itemName=="Onion"){
	itemPrice=30.00;
	return itemPrice;
}else if(itemName=="Tomato"){
	itemPrice=28.00;
	return itemPrice;
}else if(itemName=="Potato"){
	itemPrice=25.00;
	return itemPrice;
}else if(itemName=="Shampoo"){
	itemPrice=180.00;
	return itemPrice;
}else if(itemName=="Toothpaste"){
	itemPrice=95.00;
	return itemPrice;
}else if(itemName=="Handwash"){
	itemPrice=85.00;
	return itemPrice;
}else if(itemName=="Soap"){
	itemPrice=45.00;
	return itemPrice;
}else if(itemName=="Detergent"){
	itemPrice=115.00;
	return itemPrice;
}else if(itemName=="Toilet Cleaner"){
	itemPrice=130.00;
	return itemPrice;
}else if(itemName=="Glass Cleaner"){
	itemPrice=99.00;
	return itemPrice;
}else if(itemName=="Mop Refill"){
	itemPrice=149.00;
	return itemPrice;
}else if(itemName=="Floor Cleaner"){
	itemPrice=155.00;
	return itemPrice;
}else if(itemName=="Room Freshener"){
	itemPrice=135.00;
	return itemPrice;
}else if(itemName=="Toilet Paper Roll"){
	itemPrice=70.00;
	return itemPrice;
}else if(itemName=="Almonds 500g"){
	itemPrice=360.00;
	return itemPrice;
}else if(itemName=="Cashews 250g"){
	itemPrice=295.00;
	return itemPrice;
}else if(itemName=="Kurkure"){
	itemPrice=20.00;
	return itemPrice;
}else if(itemName=="Lays Chips"){
	itemPrice=20.00;
	return itemPrice;
}else if(itemName=="Perk Chocolate"){
	itemPrice=10.00;
	return itemPrice;
}else if(itemName=="Dairy Milk Silk"){
	itemPrice=85.00;
	return itemPrice;
}else if(itemName=="Ice Cream Family Pack"){
	itemPrice=199.00;
	return itemPrice;
}else if(itemName=="Frozen Paratha Pack"){
	itemPrice=120.00;
	return itemPrice;
}else if(itemName=="Frozen Green Peas"){
	itemPrice=80.00;
	return itemPrice;
}else if(itemName=="Frozen Sweet Corn"){
	itemPrice=75.00;
	return itemPrice;
}else if(itemName=="Ready-to-eat Poha"){
	itemPrice=60.00;
	return itemPrice;
}else if(itemName=="Ready-to-eat Upma"){
	itemPrice=65.00;
	return itemPrice;
}else if(itemName=="Instant Noodles"){
	itemPrice=50.00;
	return itemPrice;
}else if(itemName=="Coke Bottle"){
	itemPrice=45.00;
	return itemPrice;
}else if(itemName=="Frooti Pack"){
	itemPrice=35.00;
	return itemPrice;
}else if(itemName=="Maggie Atta Noodles"){
	itemPrice=55.00;
	return itemPrice;
}else{
	System.out.println("INVALID ITEM NAME : "+itemName);
}
	return itemPrice;
}

public static double getItemDetails(String itemName,int quantity){
double itemPrice = 0;
if(itemName=="Onion"){
	itemPrice=30.00*quantity;
	return itemPrice;
}else if(itemName=="Tomato"){
	itemPrice=28.00*quantity;
	return itemPrice;
}else if(itemName=="Potato"){
	itemPrice=25.00*quantity;
	return itemPrice;
}else if(itemName=="Shampoo"){
	itemPrice=180.00*quantity;
	return itemPrice;
}else if(itemName=="Toothpaste"){
	itemPrice=95.00*quantity;
	return itemPrice;
}else if(itemName=="Handwash"){
	itemPrice=85.00*quantity;
	return itemPrice;
}else if(itemName=="Soap"){
	itemPrice=45.00*quantity;
	return itemPrice;
}else if(itemName=="Detergent"){
	itemPrice=115.00*quantity;
	return itemPrice;
}else if(itemName=="Toilet Cleaner"){
	itemPrice=130.00*quantity;
	return itemPrice;
}else if(itemName=="Glass Cleaner"){
	itemPrice=99.00*quantity;
	return itemPrice;
}else if(itemName=="Mop Refill"){
	itemPrice=149.00*quantity;
	return itemPrice;
}else if(itemName=="Floor Cleaner"){
	itemPrice=155.00*quantity;
	return itemPrice;
}else if(itemName=="Room Freshener"){
	itemPrice=135.00*quantity;
	return itemPrice;
}else if(itemName=="Toilet Paper Roll"){
	itemPrice=70.00*quantity;
	return itemPrice*quantity;
}else if(itemName=="Almonds 500g"){
	itemPrice=360.00*quantity;
	return itemPrice;
}else if(itemName=="Cashews 250g"){
	itemPrice=295.00*quantity;
	return itemPrice;
}else if(itemName=="Kurkure"){
	itemPrice=20.00*quantity;
	return itemPrice;
}else if(itemName=="Lays Chips"){
	itemPrice=20.00*quantity;
	return itemPrice;
}else if(itemName=="Perk Chocolate"){
	itemPrice=10.00*quantity;
	return itemPrice;
}else if(itemName=="Dairy Milk Silk"){
	itemPrice=85.00*quantity;
	return itemPrice;
}else if(itemName=="Ice Cream Family Pack"){
	itemPrice=199.00*quantity;
	return itemPrice;
}else if(itemName=="Frozen Paratha Pack"){
	itemPrice=120.00*quantity;
	return itemPrice;
}else if(itemName=="Frozen Green Peas"){
	itemPrice=80.00*quantity;
	return itemPrice;
}else if(itemName=="Frozen Sweet Corn"){
	itemPrice=75.00*quantity;
	return itemPrice;
}else if(itemName=="Ready-to-eat Poha"){
	itemPrice=60.00*quantity;
	return itemPrice;
}else if(itemName=="Ready-to-eat Upma"){
	itemPrice=65.00*quantity;
	return itemPrice;
}else if(itemName=="Instant Noodles"){
	itemPrice=50.00*quantity;
	return itemPrice;
}else if(itemName=="Coke Bottle"){
	itemPrice=45.00*quantity;
	return itemPrice;
}else if(itemName=="Frooti Pack"){
	itemPrice=35.00*quantity;
	return itemPrice;
}else if(itemName=="Maggie Atta Noodles"){
	itemPrice=55.00*quantity;
	return itemPrice;
}else{
	System.out.println("INVALID ITEM NAME : "+itemName);
}
	return itemPrice;
}
}
