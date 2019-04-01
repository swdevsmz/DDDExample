import java.util.ArrayList;
import java.util.List;

public class Reservation {

    List<Fee> fees;

    Reservation(){
        fees = new ArrayList<Fee>();
    }

    void addFee(Fee fee){
        fees.add(fee);
    }

    Yen feeTotal(){

        Yen total = new Yen();

        fees.forEach( e -> total.add(e.yen()));

        return total;
    }
}
