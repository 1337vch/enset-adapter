package ma.moustahsane.ensetadapter.impls;

import ma.moustahsane.ensetadapter.interfaces.IVGA;
import org.springframework.stereotype.Component;


@Component("TV")
public class TVImpl implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("TV prints : " + message );
    }
}
