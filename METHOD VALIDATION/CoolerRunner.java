class CoolerRunner {
    public static void main(String cool[]) {
        System.out.println("MAIN STARTED");
        Cooler.onOrOff();
        Cooler.increaseSpeed();
        Cooler.increaseSpeed();
        Cooler.decreaseSpeed();
        Cooler.onOrOff();
        Cooler.increaseSpeed();
        System.out.println("MAIN ENDED");
    }
}