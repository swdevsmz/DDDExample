public class Application {

    public static void main(String[] args){

        Reservation reservation = new Reservation();

        reservation.addFee(FeeFactory.feeByName("adult"));
        reservation.addFee(FeeFactory.feeByName("child"));

        System.out.println(reservation.feeTotal().value);

    }
}
