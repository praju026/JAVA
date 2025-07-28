class Blazer{


	Blazer(){
	
	System.out.println("CONSTRUCTER INVOKED ->->->");

	}

	Blazer(String color,String fabric,String style,float price,int noOfButtons,String size){
	System.out.println(" PARAMETEREZED CONSTRUCTER INVOKED ->->->");
	this.color=color;
	this.fabric=fabric;
	this.style=style;
	this.price=price;
	this.noOfButtons=noOfButtons;
	this.size=size;
	}

	String color;
	String fabric;
	String style;
	float price;
	int noOfButtons;
	String size;

	public void GetInfo(){
        System.out.println("COLOR : " + color);
        System.out.println("FABRIC : " + fabric);
        System.out.println("STYLE : " + style);
        System.out.println("PRICE : " + price);
        System.out.println("NO OF BUTTONS : " + noOfButtons);
        System.out.println("SIZE : " + size);
	System.out.println(" ");
	}
}