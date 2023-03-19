package ma.moustahsane.ensetadapter.adapter;

import ma.moustahsane.ensetadapter.interfaces.IHDMI;
import ma.moustahsane.ensetadapter.interfaces.IVGA;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;



@Component("VgaToHdmi")
public class IVGAToHDMAdapter implements IVGA {

    public IHDMI getHdmi() {
        return hdmi;
    }

    public void setHdmi(IHDMI hdmi) {
        this.hdmi = hdmi;
    }

    private  IHDMI hdmi;

    public IVGAToHDMAdapter(IHDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("Data from Adapter");
             hdmi.print(message.getBytes(Charset.forName("UTF-8")));
    }
}
