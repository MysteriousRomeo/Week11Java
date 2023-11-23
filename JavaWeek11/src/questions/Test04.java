//Write a Java program to iterate through all elements in an array list using
//Iterator.
package questions;

import java.util.ArrayList;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        ArrayList<String> arr = new ArrayList<String>(); //Making collection
        arr.add("Code2");
        arr.add("Selenium");
        arr.add("Java");
        arr.add("Agile");

        //Getting the iterator
        Iterator<String> iter = arr.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

}
