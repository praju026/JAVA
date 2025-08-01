class Balloon{

	String color;
	double price;
	String material;
	String netQuantity;
	int size;
	String occassion;
	float diameter;

	Balloon(){
	this("Blue");
	System.out.println("Defualt constructor");
		}

	Balloon(String color){
	this(149.99,"Plastic");
	System.out.println("1st CONSTRUCTOR INVOKED");
	this.color = color;
		}

	Balloon(double price,String material){
	this(50);
	System.out.println("2nd CONSTRUCTOR INVOKED");
	this.price=price;
	this.material=material;
		}

	Balloon(int size){
	this("Birth Day","50 Piece");
	System.out.println("3rd CONSTRUCTOR INVOKED");
	this.size=size;
		}

	Balloon(String occassion,String netQuantity){
	this(10.2f);
	System.out.println("4th CONSTRUCTOR INVOKED");
	this.occassion=occassion;
	this.netQuantity=netQuantity;
		}
	
	Balloon(float diameter){
	this("Green",300.00,"Plastic","200 pieces",200,"Farewell",7.5f);
	System.out.println("5th CONSTRUCTOR INVOKED");
	//this.diameter=diameter;
		}
	
	Balloon(String color,double price,String material,String netQuantity,int size,String occassion,float diameter){
	System.out.println("LAST CONSTRUCTOR(6)");
	this.color=color;
	this.price=price;
	this.material=material;
	this.netQuantity=netQuantity;
	this.size=size;
	this.occassion=occassion;
	this.diameter=diameter;
		}

	public void display() {
        System.out.println("COLOR         : " + color);
        System.out.println("PRICE (Rs)    : " + price);
        System.out.println("MATERIAL      : " + material);
        System.out.println("NET QUANTITY  : " + netQuantity);
        System.out.println("SIZE (inches) : " + size);
        System.out.println("OCCASSION     : " + occassion);
        System.out.println("DIAMETER (cm) : " + diameter);
        System.out.println("--------------------------------------");
    }
}