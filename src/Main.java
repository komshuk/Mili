public class Main {
    public static void main(String[] args) {

        int ticketPrice = 10_000;
        int costMile = 20;
        int accruedMiles = ticketPrice / costMile;
        System.out.println("Итоговый бонус:" + accruedMiles);
    }
}