class TailorRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Tailor.getName();
        System.out.println("TAILOR NAME : " + name);

        int experience = Tailor.getYearsExperience();
        System.out.println("EXPERIENCE (years) : " + experience);

        boolean hasBoutique = Tailor.getHasBoutique();
        System.out.println("HAS BOUTIQUE : " + hasBoutique);

        String specialty = Tailor.getSpecialty();
        System.out.println("SPECIALTY : " + specialty);

        double rate = Tailor.getStitchingRate();
        System.out.println("STITCHING RATE : " + rate);

        String location = Tailor.getLocation();
        System.out.println("LOCATION : " + location);

        System.out.println("MAIN ENDED");
    }
}
