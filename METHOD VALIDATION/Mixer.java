class Mixer {
    static boolean isConnected;
    static int speed;
    static int maxSpeed = 3;
    static int minSpeed;

    public static void onOrOff(){
        System.out.println("Mixer ONOROFF STARTED");
        if (isConnected==false){
            isConnected = true;
            System.out.println("Mixer Turned ON");
        }else{
            isConnected = false;
            System.out.println("Mixer Turned OFF");
        }
    }

    public static void increaseSpeed(){
        System.out.println("Mixer Increase Speed STARTED");
        if(isConnected==true){
            if(speed<maxSpeed){
                speed=speed+1;
                System.out.println("Mixer Speed="+speed);
            }else{
                System.out.println("MAX SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON MIXER");
        }
        System.out.println("Mixer Increase Speed ENDED");
    }

    public static void decreaseSpeed(){
        System.out.println("Mixer Decrease Speed STARTED");
        if(isConnected==true){
            if(speed>minSpeed){
                speed=speed-1;
                System.out.println("Mixer Speed="+speed);
            }else{
                System.out.println("MIN SPEED REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON MIXER");
        }
        System.out.println("Mixer Decrease Speed ENDED");
    }
}
