class GardenRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Garden.getName();
        System.out.println("GARDEN NAME : " + name);

        int trees = Garden.getNumberOfTrees();
        System.out.println("TOTAL TREES : " + trees);

        boolean isPublic = Garden.getIsPublic();
        System.out.println("IS PUBLIC : " + isPublic);

        double area = Garden.getAreaInAcres();
        System.out.println("AREA (acres) : " + area);

        String location = Garden.getLocation();
        System.out.println("LOCATION : " + location);

        boolean hasPlayArea = Garden.getHasPlayArea();
        System.out.println("HAS PLAY AREA : " + hasPlayArea);

        System.out.println("MAIN ENDED");
    }
}
