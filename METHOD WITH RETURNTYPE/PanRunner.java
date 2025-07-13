class PanRunner {
    public static void main(String[] card) {
        boolean user = Pan.registrationUser("Yogi","Kumar","01-01-2000","yogi@gmail.com",1234567809L,"1234");
        System.out.println("The user is registered: " + user);
        Pan.getDetails();
    }
}