package app;

import xlib.MyInter;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<MyInter> loader = ServiceLoader.load(MyInter.class);
        Iterator<MyInter> iter = loader.iterator();

        while (iter.hasNext()) {
            MyInter obj = iter.next();
            System.out.println(obj.sayHello());
        }
    }
}
