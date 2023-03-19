package ma.moustahsane.ensetadapter.impls;

import ma.moustahsane.ensetadapter.interfaces.IVGA;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("VP")
public class VedioProjectorImpl implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("VP prints : " + message );
    }
}
