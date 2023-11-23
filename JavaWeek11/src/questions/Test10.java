//Write program and add all group members names in to array and iterates
//through for each loop and print your name.
package questions;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayan");
        names.add("Zarana");
        names.add("Miten");
        names.add("Sonal");
        names.add("Pankti");

        for (String myName:names){
            if(myName.equals("Ayan")){
                System.out.println("My name is: " + myName);
                break;
            }
        }
    }
}
