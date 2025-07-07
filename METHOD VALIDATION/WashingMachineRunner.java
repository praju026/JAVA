class WashingMachineRunner {
    public static void main(String wash[]) {
        System.out.println("MAIN STARTED");
        WashingMachine.onOrOff();
        WashingMachine.increaseSpeed();
        WashingMachine.increaseSpeed();
        WashingMachine.decreaseSpeed();
        WashingMachine.decreaseSpeed();
        WashingMachine.onOrOff();
        WashingMachine.increaseSpeed();
        System.out.println("MAIN ENDED");
    }
}
