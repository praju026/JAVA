class Ac{
    static boolean isConnected;
    static int temperature;
    static int maxTemp=30;
    static int minTemp;

    public static void onOrOff(){
        System.out.println("AC ONOROFF STARTED");
        if (isConnected==false){
            isConnected=true;
            System.out.println("AC Turned ON");
        }else{
            isConnected=false;
            System.out.println("AC Turned OFF");
        }
    }

    public static void increaseTemperature(){
        System.out.println("AC Increase Temperature STARTED");
        if(isConnected==true){
            if(temperature<maxTemp){
                temperature=temperature+1;
                System.out.println("AC Temperature="+temperature);
            }else{
                System.out.println("MAX TEMPERATURE REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON AC");
        }
        System.out.println("AC Increase Temperature ENDED");
    }

    public static void decreaseTemperature(){
        System.out.println("AC Decrease Temperature STARTED");
        if(isConnected==true){
            if(temperature>minTemp){
                temperature=temperature-1;
                System.out.println("AC Temperature = " + temperature);
            }else{
                System.out.println("MIN TEMPERATURE REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON AC");
        }
        System.out.println("AC Decrease Temperature ENDED");
    }
}
