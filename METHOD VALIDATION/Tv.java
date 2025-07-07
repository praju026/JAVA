class Tv{
    static boolean isConnected;
    static int volume;
    static int maxVolume=15;
    static int minVolume;

    public static void onOrOff(){
        System.out.println("TV ONOROFF STARTED");
        if(isConnected==true){
            isConnected=true;
            System.out.println("TV Turned ON");
        }else{
            isConnected=false;
            System.out.println("TV Turned OFF");
        }
    }

    public static void increaseVolume() {
        System.out.println("TV Increase Volume STARTED");
        if(isConnected==true){
            if(volume<maxVolume){
                volume=volume+1;
                System.out.println("TV Volume="+volume);
            }else{
                System.out.println("MAX VOLUME REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON TV");
        }
        System.out.println("TV Increase Volume ENDED");
    }

    public static void decreaseVolume(){
        System.out.println("TV Decrease Volume STARTED");
        if(isConnected){
            if(volume>minVolume){
                volume=volume-1;
                System.out.println("TV Volume="+volume);
            }else{
                System.out.println("MIN VOLUME REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON TV");
        }
        System.out.println("TV Decrease Volume ENDED");
    }
}
