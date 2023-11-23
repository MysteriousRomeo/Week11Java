//Declare global variables of your name, Add all your group names in list, using
//for each loop iterate and print ONLY your name.
package questions;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    String myName = "Ayan";
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Test11 test = new Test11();
        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("Pankti");
        groupNames.add("Zarana");
        groupNames.add("Miten");
        groupNames.add("Sonal");
        groupNames.add(test.myName);

        for(String name: groupNames){
            if(name.equals(test.myName)){
                System.out.println("My name is : " + name);
            }
        }

    }

}
