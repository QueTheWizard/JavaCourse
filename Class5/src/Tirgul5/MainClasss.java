package Tirgul5;

import java.util.ArrayList;

public class MainClasss {
    public static void main(String[] args) {
        Device d = new Device();
        TV tv = new TV();
        Washer w = new Washer();

        Device d2 = new TV();

        Device d3 = new Washer();
        d3.on();

        ArrayList<Device> devices = new ArrayList<Device>();
        devices.add(d);
        devices.add(tv);
        devices.add(w);
        devices.add(d2);
        devices.add(d3);

//        for (Device i : devices) {
//            i.on();
//
//            if (i instanceof TV) {
//                ((TV) i).play();
//            }
//        }

//        for (Device i : devices) {
//            func(i);
//        }

        func(w);
    }

    public static void func(Device d) {
        d.on();
    }
}