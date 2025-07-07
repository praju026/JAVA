class Speaker {
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume = 5;
    static int minVolume;

    public static void onOrOff(){
        System.out.println("ONOROFF STARTED");
        if(isConnected==false){
            isConnected = true;
            System.out.println("Speaker Turned on");
        }else{
            isConnected=false;
            System.out.println("Speaker Turned Off");
        }
    }

    public static void increaseVolume(){
        System.out.println("Increase Volume Started");
        if(isConnected==true){
            if(currentVolume<maxVolume) {
                currentVolume=currentVolume+1;
                System.out.println("Current Volume="+currentVolume);
            }else{
                System.out.println("MAX VOLUME REACHED ........");
            }
        }else{
            System.out.println("TURN ON PLSSS");
        }
        System.out.println("Increase Volume Ended");
    }

    public static void decreaseVolume(){
        System.out.println("DECREASE STARTED");
        if (isConnected==true){
            if (currentVolume>minVolume){
                currentVolume=currentVolume-1;
                System.out.println("Current Volume="+currentVolume);
            } else {
                System.out.println("MIN VOLUME REACHED");
            }
        } else {
            System.out.println("TURN ONNNNN............");
        }
        System.out.println("DECREASE ENDED");
    }
}
