class Cooler {
    static boolean isConnected;
    static int speed;
    static int maxSpeed=3;
    static int minSpeed;

    public static void onOrOff(){
        System.out.println("Cooler ONOROFF STARTED");
        if(isConnected==false){
            isConnected=true;
            System.out.println("Cooler Turned ON");
        }else{
            isConnected=false;
            System.out.println("Cooler Turned OFF");
        }
    }

    public static void increaseSpeed(){
        System.out.println("Cooler Increase Speed STARTED");
        if(isConnected==true){
            if(speed<maxSpeed) {
                speed=speed+1;
                System.out.println("Cooler Speed="+speed);
            }else{
                System.out.println("MAX SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON COOLER");
        }
        System.out.println("Cooler Increase Speed ENDED");
    }

    public static void decreaseSpeed(){
        System.out.println("Cooler Decrease Speed STARTED");
        if(isConnected==false){
            if(speed>minSpeed){
                speed=speed-1;
                System.out.println("Cooler Speed="+speed);
            }else{
                System.out.println("MIN SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON COOLER");
        }
        System.out.println("Cooler Decrease Speed ENDED");
    }
}
