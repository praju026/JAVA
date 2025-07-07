class Fan{
    static boolean isConnected;
    static int speed;
    static int maxSpeed=5;
    static int minSpeed;

    public static void onOrOff() {
        System.out.println("Fan ONOROFF STARTED");
        if(isConnected==false){
            isConnected=true;
            System.out.println("Fan Turned ON");
        }else{
            isConnected=false;
            System.out.println("Fan Turned OFF");
        }
    }

    public static void increaseSpeed(){
        System.out.println("Fan Increase Speed STARTED");
        if(isConnected==true){
            if(speed<maxSpeed){
                speed=speed+1;
                System.out.println("Fan Speed="+speed);
            }else{
                System.out.println("MAX SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON FAN");
        }
        System.out.println("Fan Increase Speed ENDED");
    }

    public static void decreaseSpeed(){
        System.out.println("Fan Decrease Speed STARTED");
        if(isConnected==true){
            if(speed>minSpeed){
                speed=speed-1;
                System.out.println("Fan Speed="+speed);
            }else{
                System.out.println("MIN SPEED REACHED");
            }
        } else {
            System.out.println("PLEASE TURN ON FAN");
        }
        System.out.println("Fan Decrease Speed ENDED");
    }
}
