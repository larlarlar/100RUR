public class Main {
    public static void main(String[] args) {

        long amount = 0;
        long sum = 1100;
        long bonus = amount + sum;
        if (sum >= 1000) {
            bonus = amount + sum + sum / 100;
        }
        System.out.println(bonus);
    }
}