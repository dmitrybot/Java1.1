public class Test {
    public static void main(String[] args) {
        Ball ball1 = new Ball("basketball", 20);
        Ball ball2 = new Ball("tennis", 5);
        Ball ball3 = new Ball("football", 15);
        System.out.println(ball1.getRadius());
        ball2.setType("table tennis");
        System.out.println(ball2);
    }
}
