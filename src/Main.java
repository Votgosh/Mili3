public class Main {
    public static void main(String[] args) {
        double tiketPrice = 7_012.20;
        int oneMilePrice = 20;

        System.out.println("Поздравляем! Вам начислится " + Math.floor(tiketPrice / oneMilePrice) + " бонусных миль.");

    }
}