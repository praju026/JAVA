class Calculator{



public static void main(String []calc){

add(7,3);
sub(10,5);
div(10,2);
mod(10,3);
mult(2,5);


}


public static void add(int add1,int add2){
int addition=add1+add2;
System.out.println(add1+"+"+add2+"="+addition);

}

public static void sub(int sub1,int sub2){

int subtraction=sub1-sub2;
System.out.println(sub1+"-"+sub2+"="+subtraction);
}

public static void mult(int mult1, int mult2){
int multiplication=mult1*mult2;
System.out.println(mult1+"*"+mult2+"="+multiplication);

}

public static void div(double div1, double div2){
double division=div1/div2;
System.out.println(div1+"/"+div2+"="+division);
}

public static void mod(int mod1 ,int mod2){
int modulus =mod1%mod2;
System.out.println(mod1+"%"+mod2+"="+modulus);

}
}