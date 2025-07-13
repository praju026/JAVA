class AdhaarRunner {
    public static void main(String[] args) {
        boolean user = Adhaar.registrationUser("yogi@gmail.com","123asd","123asd","babu",8088403508L);
        System.out.println("The user is registered: " + user);
        Adhaar.getDetails();
    }
}