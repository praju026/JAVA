class Country{

static int countryCode;

public static int getCountryCode(String countryName){

if(countryName=="India"){
countryCode=91;
}else if(countryName=="Australia"){
countryCode=61;
}else if(countryName=="Srilanka"){
countryCode=94;
}else if(countryName=="USA"){
countryCode=1;
}else if(countryName=="France"){
countryCode=33;
}else if(countryName=="Japan"){
countryCode=81;
}else if(countryName=="China"){
countryCode=86;
}else if(countryName=="Brazil"){
countryCode=55;
}else if(countryName=="Russia"){
countryCode=7;
}else if(countryName=="South Africa"){
countryCode=27;
}else if(countryName=="Germany"){
countryCode=49;
}else if(countryName=="Italy"){
countryCode=39;
}else if(countryName=="Spain"){
countryCode=34;
}else if(countryName=="United Kingdom"){
countryCode=44;
}else if(countryName=="Canada"){
countryCode=1;
}else if(countryName=="Mexico"){
countryCode=52;
}else if(countryName=="New Zealand"){
countryCode=64;
}else if(countryName=="South Korea"){
countryCode=82;
}else if(countryName=="Singapore"){
countryCode=65;
}else if(countryName=="Malaysia"){
countryCode=60;
}else if(countryName=="Indonesia"){
countryCode=62;
}else if(countryName=="Thailand"){
countryCode=66;
}else if(countryName=="Philippines"){
countryCode=63;
}else if(countryName=="Vietnam"){
countryCode=84;
}else if(countryName=="Nepal"){
countryCode=977;
}else if(countryName=="Bangladesh"){
countryCode=880;
}else if(countryName=="Pakistan"){
countryCode=92;
}else if(countryName=="Afghanistan"){
countryCode=93;
}else if(countryName=="Iran"){
countryCode=98;
}else if(countryName=="Iraq"){
countryCode=964;
}else if(countryName=="Turkey"){
countryCode=90;
}else if(countryName=="Saudi Arabia"){
countryCode=966;
}else if(countryName=="UAE"){
countryCode=971;
}else if(countryName=="Qatar"){
countryCode=974;
}else if(countryName=="Kuwait"){
countryCode=965;
}else if(countryName=="Egypt"){
countryCode=20;
}else if(countryName=="Kenya"){
countryCode=254;
}else if(countryName=="Nigeria"){
countryCode=234;
}else if(countryName=="Ethiopia"){
countryCode=251;
}else if(countryName=="Argentina"){
countryCode=54;
}else if(countryName=="Chile"){
countryCode=56;
}else if(countryName=="Colombia"){
countryCode=57;
}else if(countryName=="Peru"){
countryCode=51;
}else if(countryName=="Venezuela"){
countryCode=58;
}else if(countryName=="Ukraine"){
countryCode=380;
}else if(countryName=="Poland"){
countryCode=48;
}else if(countryName=="Sweden"){
countryCode=46;
}else if(countryName=="Norway"){
countryCode=47;
}else{
System.out.println("INVALID COUNTRY NAME:"+countryName);
}
return countryCode;
}
}
