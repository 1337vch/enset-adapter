package ma.moustahsane.ensetadapter;

import ma.moustahsane.ensetadapter.interfaces.IUSB;
import ma.moustahsane.ensetadapter.interfaces.IVGA;
import org.springframework.stereotype.Component;

@Component("CU")
public class CentralUnit {

    public CentralUnit() {
    }

    public CentralUnit(IVGA VGA, IUSB USB) {
        this.VGA = VGA;
        this.USB = USB;
    }

    private IVGA VGA;
    private IUSB USB;


    public int readData() {
        return USB.readData();
    }


    public void printData(String data) {
        System.out.println("data from CU : " + data);
        VGA.print(data);
    }



    public IVGA getVGA() {
        return VGA;
    }

    public IUSB getUSB() {
        return USB;
    }


    public void setVGA(IVGA VGA) {
        this.VGA = VGA;
    }

    public void setUSB(IUSB USB) {
        this.USB = USB;
    }
}

