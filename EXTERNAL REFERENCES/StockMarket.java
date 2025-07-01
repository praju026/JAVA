public class StockMarket {

    // static String bajajFinance = "Bajaj Finance LTD";
    // static String colgate = "Colgate";
    // static String reliance = "Reliance";
    // static String hdfcBank = "HDFC Bank";
    // static String nestle = "Nestle";
    // static String wipro = "Wipro";
    // static String asianPaints = "Asian Paints";
    // static String sbi = "SBI";
    // static String adaniEnterprises = "Adani Enterprises";
    // static String btc = "BTC";

    // static String stockNames[] = {
    //     bajajFinance, colgate, reliance, hdfcBank, nestle,
    //     wipro, asianPaints, sbi, adaniEnterprises, btc
    // };

    public static void main(String stock[]) {

        String bajajFinance = "Bajaj Finance LTD";
        String colgate = "Colgate";
        String reliance = "Reliance";
        String hdfcBank = "HDFC Bank";
        String nestle = "Nestle";
        String wipro = "Wipro";
        String asianPaints = "Asian Paints";
        String sbi = "SBI";
        String adaniEnterprises = "Adani Enterprises";
        String btc = "BTC";

        String stockNames[] = {
            bajajFinance, colgate, reliance, hdfcBank, nestle,
            wipro, asianPaints, sbi, adaniEnterprises, btc
        };

        System.out.println("=== Stock Market Companies ===");
        for (String stockName : stockNames) {
            System.out.println(stockName);
        }
    }
}
