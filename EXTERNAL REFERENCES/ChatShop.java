public class ChatShop {

    // static String masalaPuttu = "Masala Puttu";
    // static String kappa = "Kappa";
    // static String vada = "Vada";
    // static String bananaFry = "Banana Fry";
    // static String bonda = "Bonda";
    // static String pazhamNirachathu = "Pazham Nirachathu";
    // static String parippuVada = "Parippu Vada";
    // static String ulliVada = "Ulli Vada";
    // static String dhelPuri = "Dhel puri";
    // static String masalPuri = "Masal puri";

    // static String chats[] = {
    //     masalaPuttu, kappa, vada, bananaFry, bonda,
    //     pazhamNirachathu, parippuVada, ulliVada, dhelPuri, masalPuri
    // };

    public static void main(String chatts[]) {

        String masalaPuttu = "Masala Puttu";
        String kappa = "Kappa";
        String vada = "Vada";
        String bananaFry = "Banana Fry";
        String bonda = "Bonda";
        String pazhamNirachathu = "Pazham Nirachathu";
        String parippuVada = "Parippu Vada";
        String ulliVada = "Ulli Vada";
        String dhelPuri = "Dhel puri";
        String masalPuri = "Masal puri";

        String chats[] = {
            masalaPuttu, kappa, vada, bananaFry, bonda,
            pazhamNirachathu, parippuVada, ulliVada, dhelPuri, masalPuri
        };

        System.out.println("=== Chat Items ===");
        for (String chat : chats) {
            System.out.println(chat);
        }
    }
}
