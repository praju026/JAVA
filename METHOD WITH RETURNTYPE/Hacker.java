class Hacker {
    static String alias;
    static String skillSet;
    static boolean isEthical;
    static int knownLanguages;
    static String country;
    static int experienceYears;

    public static String getAlias() {
        alias = "ZeroCool";
        return alias;
    }

    public static String getSkillSet() {
        skillSet = "PenTesting, Reverse Engineering, Exploits";
        return skillSet;
    }

    public static boolean getIsEthical() {
        isEthical = false;
        return isEthical;
    }

    public static int getKnownLanguages() {
        knownLanguages = 5;
        return knownLanguages;
    }

    public static String getCountry() {
        country = "Russia";
        return country;
    }

    public static int getExperienceYears() {
        experienceYears = 7;
        return experienceYears;
    }
}