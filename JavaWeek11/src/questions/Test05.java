//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
package questions;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Oxford Circus");
        arr.add("Paddington");
        arr.add("London Bridge");
        arr.add("Victoria");
        arr.add("Westminster");

        System.out.println("Print the Station List : " + arr);
        System.out.println("Is the list empty? : " + arr.isEmpty());
        System.out.println("Removing all stations from the list.....");
        arr.removeAll(arr);
        System.out.println("Is the list empty? : " + arr.isEmpty());

    }
}
