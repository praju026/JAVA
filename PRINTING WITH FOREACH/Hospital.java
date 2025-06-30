public class Hospital {
    static String doctorNames[] = {
        "Dr. Prajwal", "Dr. Sujay", "Dr. Jashir", "Dr. Deva", "Dr. Rama","Dr. Aryan", "Dr. Sneha", "Dr. Varun", "Dr. Kavya", "Dr. Rishi"
    };

    public static void main(String hospital[]) {
        System.out.println("=== Hospital - Doctors List ===");
	for(String doctorName:doctorNames){
	System.out.println(doctorName);
	}
    }
}
