package ma.moustahsane.ensetadapter;

import ma.moustahsane.ensetadapter.impls.TVHDMI;
import ma.moustahsane.ensetadapter.interfaces.IHDMI;
import ma.moustahsane.ensetadapter.interfaces.IUSB;
import ma.moustahsane.ensetadapter.interfaces.IVGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "ma.moustahsane.ensetadapter")
public class EnsetAdapterApplication implements   Runnable {

    public static void main(String[] args) {

        //* This example is a simulation of a central unit Connected With Mouse And HDMI TV *//


        ApplicationContext context = new  AnnotationConfigApplicationContext("ma.moustahsane.ensetadapter","ma.moustahsane.ensetadapter.impls","ma.moustahsane.ensetadapter.adapter");
        CentralUnit centralUnit = (CentralUnit) context.getBean("CU");
        IVGA ivga = (IVGA) context.getBean("VgaToHdmi");
        IUSB iusb = (IUSB) context.getBean("mouse");

        centralUnit.setVGA(ivga);
        centralUnit.setUSB(iusb);

        centralUnit.printData("HELLO JAVA");
        int usbData = centralUnit.readData();
        System.out.println("from USB : " + usbData);




    }



    @Override
    public void run() {
        //centralUnit.printData("DATA");
    }
}
