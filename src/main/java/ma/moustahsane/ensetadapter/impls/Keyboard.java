package ma.moustahsane.ensetadapter.impls;

import ma.moustahsane.ensetadapter.interfaces.IUSB;
import org.springframework.stereotype.Component;


@Component("keyboard")
public class Keyboard implements IUSB {
    @Override
    public int readData() {
        return 1234;
    }


}
