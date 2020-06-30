
import java.util.ArrayList;
public class ShowActivity implements Activity {



    @Override
    public void activate() {
        System.out.println("1 : stop\n" +
                           "2 : start\n" +
                           "3 : next\n" +
                           "4 : prev\n");
    }
}
