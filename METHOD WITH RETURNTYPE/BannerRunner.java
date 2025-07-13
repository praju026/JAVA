class BannerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String message = Banner.getMessage();
        System.out.println("BANNER MESSAGE : " + message);

        String size = Banner.getSize();
        System.out.println("BANNER SIZE : " + size);

        String material = Banner.getMaterial();
        System.out.println("MATERIAL : " + material);

        boolean isPrinted = Banner.getIsPrinted();
        System.out.println("IS PRINTED : " + isPrinted);

        String location = Banner.getLocation();
        System.out.println("LOCATION : " + location);

        System.out.println("MAIN ENDED");
    }
}
