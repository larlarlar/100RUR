public class Main {
    public static void main(String[] args) {

        int balance = 0;
        int refill = 1301;
        int newbalance = balance + refill;
        if (refill >= 1000) {
            newbalance = balance + refill + refill / 100;
        }
        System.out.println(newbalance);
    }
}