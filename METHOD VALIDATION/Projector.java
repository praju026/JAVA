class Projector {
    static boolean isConnected;
    static int volume;
    static int maxVolume=10;
    static int minVolume;

    public static void onOrOff(){
        System.out.println("Projector ONOROFF STARTED");
        if(isConnected==false){
            isConnected=true;
            System.out.println("Projector Turned ON");
        }else{
            isConnected=false;
            System.out.println("Projector Turned OFF");
        }
    }

    public static void increaseVolume(){
        System.out.println("Projector Increase Volume STARTED");
        if(isConnected==true){
            if(volume<maxVolume){
                volume=volume+1;
                System.out.println("Projector Volume="+volume);
            }else{
                System.out.println("MAX VOLUME REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON PROJECTOR");
        }
        System.out.println("Projector Increase Volume ENDED");
    }

    public static void decreaseVolume(){
        System.out.println("Projector Decrease Volume STARTED");
        if(isConnected==true){
            if(volume>minVolume){
                	volume=volume-1;
                System.out.println("Projector Volume="+volume);
            }else{
                System.out.println("MIN VOLUME REACHED");
            }
        }else{
            System.out.println("PLEASE TURN ON PROJECTOR");
        }
        System.out.println("Projector Decrease Volume ENDED");
    }
}
