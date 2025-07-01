public class Hospital {

    // static String drPrajwal = "Dr. Prajwal";
    // static String drSujay = "Dr. Sujay";
    // static String drJashir = "Dr. Jashir";
    // static String drDeva = "Dr. Deva";
    // static String drRama = "Dr. Rama";
    // static String drAryan = "Dr. Aryan";
    // static String drSneha = "Dr. Sneha";
    // static String drVarun = "Dr. Varun";
    // static String drKavya = "Dr. Kavya";
    // static String drRishi = "Dr. Rishi";

    // static String doctorNames[] = {
    //     drPrajwal, drSujay, drJashir, drDeva, drRama,
    //     drAryan, drSneha, drVarun, drKavya, drRishi
    // };

    public static void main(String hospital[]) {

        String drPrajwal = "Dr. Prajwal";
        String drSujay = "Dr. Sujay";
        String drJashir = "Dr. Jashir";
        String drDeva = "Dr. Deva";
        String drRama = "Dr. Rama";
        String drAryan = "Dr. Aryan";
        String drSneha = "Dr. Sneha";
        String drVarun = "Dr. Varun";
        String drKavya = "Dr. Kavya";
        String drRishi = "Dr. Rishi";

        String doctorNames[] = {
            drPrajwal, drSujay, drJashir, drDeva, drRama,
            drAryan, drSneha, drVarun, drKavya, drRishi
        };

        System.out.println("=== Hospital - Doctors List ===");
        for (String doctorName : doctorNames) {
            System.out.println(doctorName);
        }
    }
}
