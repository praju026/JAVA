class RiverRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = River.getName();
        System.out.println("RIVER NAME : " + name);

        double length = River.getLengthInKm();
        System.out.println("LENGTH (km) : " + length);

        String origin = River.getOrigin();
        System.out.println("ORIGIN : " + origin);

        boolean isPolluted = River.getIsPolluted();
        System.out.println("IS POLLUTED : " + isPolluted);

        String flowsThrough = River.getFlowsThrough();
        System.out.println("FLOWS THROUGH : " + flowsThrough);

        int bridges = River.getNumberOfBridges();
        System.out.println("NUMBER OF BRIDGES : " + bridges);

        System.out.println("MAIN ENDED");
    }
}
