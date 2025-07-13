class OneplusAccountRunner {
    public static void main(String[] args) {
        boolean user = OneplusAccount.registrationUser("yogi@gmail.com","123asd","123asd","Yogi","babu");
        System.out.println("The user is registered: " + user);
        OneplusAccount.getDetails();
    }
}