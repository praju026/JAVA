class SignalRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String type = Signal.getType();
        System.out.println("SIGNAL TYPE : " + type);

        String location = Signal.getLocation();
        System.out.println("LOCATION : " + location);

        boolean isWorking = Signal.getIsWorking();
        System.out.println("IS WORKING : " + isWorking);

        int timer = Signal.getTimer();
        System.out.println("TIMER SECONDS : " + timer);

        String color = Signal.getColor();
        System.out.println("SIGNAL COLOR : " + color);

        System.out.println("MAIN ENDED");
    }
}
