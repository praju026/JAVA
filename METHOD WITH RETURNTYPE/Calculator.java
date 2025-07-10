class Calculator{
   
    public static int add(int add1,int add2){
	int addition=add1+add2;
	System.out.println(add1+"+"+add2+"="+addition);
	return addition;
	}

    public static int sub(int sub1,int sub2){
	int subtraction=sub1-sub2;
	System.out.println(sub1+"-"+sub2+"="+subtraction);
	return subtraction;
	}

    public static int mult(int mult1, int mult2){
	int multiplication=mult1*mult2;
	System.out.println(mult1+"*"+mult2+"="+multiplication);
	return multiplication;
	}

    public static double div(double div1, double div2){
	double division=div1/div2;
	System.out.println(div1+"/"+div2+"="+division);
	return division;
	}

    public static int mod(int mod1 ,int mod2){
	int modulus =mod1%mod2;
	System.out.println(mod1+"%"+mod2+"="+modulus);
	return modulus;
	}
}