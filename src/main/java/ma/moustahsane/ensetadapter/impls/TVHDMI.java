package ma.moustahsane.ensetadapter.impls;

import ma.moustahsane.ensetadapter.interfaces.IHDMI;
import org.springframework.stereotype.Component;


@Component("hdmitv")
public class TVHDMI implements IHDMI {
    @Override
    public void print(byte[] data) {
        System.out.println("TVHDMI Data");
    }
}
