class HackerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String alias = Hacker.getAlias();
        System.out.println("ALIAS : " + alias);

        String skillSet = Hacker.getSkillSet();
        System.out.println("SKILL SET : " + skillSet);

        boolean isEthical = Hacker.getIsEthical();
        System.out.println("IS ETHICAL : " + isEthical);

        int knownLang = Hacker.getKnownLanguages();
        System.out.println("KNOWN LANGUAGES : " + knownLang);

        String country = Hacker.getCountry();
        System.out.println("COUNTRY : " + country);

        int experience = Hacker.getExperienceYears();
        System.out.println("EXPERIENCE (years) : " + experience);

        System.out.println("MAIN ENDED");
    }
}
