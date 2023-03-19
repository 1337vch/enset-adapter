package ma.moustahsane.ensetadapter.impls;

import ma.moustahsane.ensetadapter.interfaces.IUSB;
import org.springframework.stereotype.Component;


@Component("mouse")
public class Mouse implements IUSB {
    @Override
    public int readData() {
        return 100010;
    }


}
