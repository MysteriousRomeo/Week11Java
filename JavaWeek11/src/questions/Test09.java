//Write program and add all group names in to array and iterates through for
//each loop.
package questions;

import java.util.ArrayList;
import java.util.Iterator;

public class Test09 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        ArrayList<String> names = new ArrayList<>();
        names.add("code2");
        names.add("Selenium");
        names.add("Agile");
        names.add("Java");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}


