
class ProjectorRunner {
    public static void main(String view[]) {
        System.out.println("MAIN STARTED");
        Projector.onOrOff();
        Projector.increaseVolume();
        Projector.increaseVolume();
        Projector.increaseVolume();
        Projector.decreaseVolume();
        Projector.onOrOff();
        Projector.increaseVolume();
        System.out.println("MAIN ENDED");
    }
}
