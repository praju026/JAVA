public class StockMarket {

    static String[] stockNames = {"Bajaj Finance LTD","Colgate","Reliance","HDFC Bank","Nestle","Wipro","Asian Paints","SBI","Adani Enterprises","BTC"};

    public static void main(String stock[]) {

        System.out.println("=== Stock Market Companies ===");
	for(String stockName:stockNames){
	System.out.println(stockName);
	}
    }
}
