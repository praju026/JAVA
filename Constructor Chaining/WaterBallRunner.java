class WaterBallRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        WaterBall w1 = new WaterBall();
        w1.display();
        WaterBall w2 = new WaterBall("Rainbow");
        w2.display();
        WaterBall w3 = new WaterBall(129.0, "Latex");
        w3.display();
        WaterBall w4 = new WaterBall(80);
        w4.display();
        WaterBall w5 = new WaterBall(6.8f, "Yes");
        w5.display();
        WaterBall w6 = new WaterBall(159.0, 150);
        w6.display();
        WaterBall w7 = new WaterBall("Neon Mix", 179.0, "Latex", 200, 7.2f, "No");
        w7.display();
        System.out.println("Main ended");
    }
}
