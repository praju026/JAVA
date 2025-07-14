class Contact{

static long phoneNumber;
static String contactName;

public static long getPhoneNumber(String contactName){

if(contactName=="Praju"){
phoneNumber=9645566258L;
}else if(contactName=="sujay"){
phoneNumber=9564268652L;
}else if(contactName=="jash"){
phoneNumber=9642658562L;
}else if(contactName=="raaman"){
phoneNumber=9246568561L;
}else if(contactName=="salimcha"){
phoneNumber=9265548661L;
}else if(contactName=="midlaj"){
phoneNumber=9462658561L;
}else if(contactName=="safwan"){
phoneNumber=9652546861L;
}else if(contactName=="damu"){
phoneNumber=9542668561L;
}else if(contactName=="achan"){
phoneNumber=9562648562L;
}else if(contactName=="amma"){
phoneNumber=9645268561L;
}else if(contactName=="sister"){
phoneNumber=9466528561L;
}else if(contactName=="appoos"){
phoneNumber=9264658561L;
}else if(contactName=="arun"){
phoneNumber=9642568156L;
}else if(contactName=="sneha"){
phoneNumber=9562645816L;
}else if(contactName=="rahul"){
phoneNumber=9265468156L;
}else if(contactName=="deepa"){
phoneNumber=9546281656L;
}else if(contactName=="arjun"){
phoneNumber=9642568516L;
}else if(contactName=="meera"){
phoneNumber=9465628516L;
}else if(contactName=="john"){
phoneNumber=9654281656L;
}else if(contactName=="vijay"){
phoneNumber=9264581656L;
}else if(contactName=="kiran"){
phoneNumber=9562481656L;
}else if(contactName=="asha"){
phoneNumber=9642865156L;
}else if(contactName=="divya"){
phoneNumber=9465821656L;
}else if(contactName=="shiva"){
phoneNumber=9542681656L;
}else if(contactName=="naveen"){
phoneNumber=9654285166L;
}
return phoneNumber;
}

public static String getContactName(long phoneNumber){

String contactName=null;
if(phoneNumber==9645566258L){
contactName="Praju";
}else if(phoneNumber==9564268652L){
contactName="sujay";
}else if(phoneNumber==9642658562L){
contactName="jash";
}else if(phoneNumber==9246568561L){
contactName="raaman";
}else if(phoneNumber==9265548661L){
contactName="salimcha";
}else if(phoneNumber==9462658561L){
contactName="midlaj";
}else if(phoneNumber==9652546861L){
contactName="safwan";
}else if(phoneNumber==9542668561L){
contactName="damu";
}else if(phoneNumber==9562648562L){
contactName="achan";
}else if(phoneNumber==9645268561L){
contactName="amma";
}else if(phoneNumber==9466528561L){
contactName="sister";
}else if(phoneNumber==9264658561L){
contactName="appoos";
}else if(phoneNumber==9642568156L){
contactName="arun";
}else if(phoneNumber==9562645816L){
contactName="sneha";
}else if(phoneNumber==9265468156L){
contactName="rahul";
}else if(phoneNumber==9546281656L){
contactName="deepa";
}else if(phoneNumber==9642568516L){
contactName="arjun";
}else if(phoneNumber==9465628516L){
contactName="meera";
}else if(phoneNumber==9654281656L){
contactName="john";
}else if(phoneNumber==9264581656L){
contactName="vijay";
}else if(phoneNumber==9562481656L){
contactName="kiran";
}else if(phoneNumber==9642865156L){
contactName="asha";
}else if(phoneNumber==9465821656L){
contactName="divya";
}else if(phoneNumber==9542681656L){
contactName="shiva";
}else if(phoneNumber==9654285166L){
contactName="naveen";
}
return contactName;
}
}
