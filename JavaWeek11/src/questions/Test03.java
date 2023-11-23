//Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.
package questions;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Pink");

        for (String c : colors) {
            System.out.println(c);
        }
    }
}

