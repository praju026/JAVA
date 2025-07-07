class WashingMachine {
    static boolean isConnected;
    static int speed;
    static int maxSpeed=4;
    static int minSpeed;

    public static void onOrOff(){
        System.out.println("WashingMachine ONOROFF STARTED");
        if (isConnected==false){
            isConnected = true;
            System.out.println("WashingMachine Turned ON");
        } else {
            isConnected = false;
            System.out.println("WashingMachine Turned OFF");
        }
    }

    public static void increaseSpeed(){
        System.out.println("WashingMachine Increase Speed STARTED");
        if(isConnected==true){
            if(speed<maxSpeed){
                speed+speed+1;
                System.out.println("WashingMachine Speed="+speed);
            }else{
                System.out.println("MAX SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON WashingMachine");
        }
        System.out.println("WashingMachine Increase Speed ENDED");
    }

    public static void decreaseSpeed(){
        System.out.println("WashingMachine Decrease Speed STARTED");
        if (isConnected==true) {
            if (speed>minSpeed) {
                speed=speed-1;
                System.out.println("WashingMachine Speed="+speed);
            } else {
                System.out.println("MIN SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON WashingMachine");
        }
        System.out.println("WashingMachine Decrease Speed ENDED");
    }
}