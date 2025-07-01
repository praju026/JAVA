public class City {

    // static int pinA = 560001;
    // static int pinB = 560002;
    // static int pinC = 560003;
    // static int pinD = 560004;
    // static int pinE = 560005;
    // static int pinF = 560006;
    // static int pinG = 560007;
    // static int pinH = 560008;
    // static int pinI = 560009;
    // static int pinJ = 560010;
    // static int pinK = 560011;
    // static int pinL = 560012;
    // static int pinM = 560013;

    // static int pinCodes[] = {
    //     pinA, pinB, pinC, pinD, pinE, pinF, pinG,
    //     pinH, pinI, pinJ, pinK, pinL, pinM
    // };

    public static void main(String city[]) {

        int pinA = 560001;
        int pinB = 560002;
        int pinC = 560003;
        int pinD = 560004;
        int pinE = 560005;
        int pinF = 560006;
        int pinG = 560007;
        int pinH = 560008;
        int pinI = 560009;
        int pinJ = 560010;
        int pinK = 560011;
        int pinL = 560012;
        int pinM = 560013;

        int pinCodes[] = {
            pinA, pinB, pinC, pinD, pinE, pinF, pinG,
            pinH, pinI, pinJ, pinK, pinL, pinM
        };

        System.out.println("=== City Pin Codes ===");
        for (int pin : pinCodes) {
            System.out.println(pin);
        }
    }
}
