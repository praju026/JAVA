class Netflix {

    static String Mollywood[] = {"THUDARUM", "LUCIFER", "MARCO", "HELLO", "MINNAL MURALI", "PREMAM", "PADAKKALAM", "KUMBALANGHI NIGHTS", "EMPURAAN", "GOAT LIFE"};
    static String Sandalwood[] = {"KGF", "KGF2", "KANTHARA", "MAX", "SHHH", "GHOST", "KIRIKK PARTY", "777 CHARLIE", "LUCIA", "DIA"};
    static String Kollywood[] = {"THERI", "GOAT", "VIKRAM", "KAITHI", "LEO", "JAILER", "KATHI", "JILLA", "COBRA", "GILLI"};
    static String Tollywood[] = {"BAHUBALI-1", "BAHUBALI-2", "SAAHO", "PUSHPA-1", "SALAAR", "PUSHPA-2", "ARYA", "RRR", "MAGADHEERA", "SITA RAMAM"};
    static String Bollywood[] = {"WAR", "ASHIQUE", "ASHIQUE-2", "SIKINDAR", "HOUSEFULL", "HOUSEFULL 2", "PATHAAN", "CHENNAI EXPRESS", "LOVE AJKAL", "BABY"};
    static String Hollywood[] = {"IRON MAN", "RAGNORAK", "WINTER SOLDIER", "CIVIL WAR", "AVENGERS", "INFINITY WAR", "END GAME", "AGE OF ULTRON", "ANT MAN", "BLACK PANTHER"};
    static String Webseries[] = {"DARK", "GAME OF THRONES", "12 MONKEYS", "MONEY HEIST", "STRANGER THINGS", "VIKINGS", "LOST", "THE BOYS", "VAMPIRE DIARIES", "ORIGINALS"};

    public static void main(String netflix[]) {

        System.out.println("=== Mollywood ===");
        for(String Malayalam:Mollywood){
	System.out.println(Malayalam);
	}

        System.out.println("=== Sandalwood ===");
	for(String Kannada:Sandalwood){
	System.out.println(Kannada);
	}

        System.out.println("=== Kollywood ===");
        for(String Tamil:Kollywood){
	System.out.println(Kollywood);
	}

        System.out.println("=== Tollywood ===");
        for(String Telugu:Tollywood){
	System.out.println(Telugu);
	}

        System.out.println("=== Bollywood ===");
        for(String Hindi:Hollywood){
	System.out.println(Hindi);
	}

        System.out.println("=== Hollywood ===");
	for(String English:Hollywood){
	System.out.println(English);
	}

        System.out.println("=== Webseries ===");
        for(String Series:Webseries){
	System.out.println(Series);
	}
    }
}
