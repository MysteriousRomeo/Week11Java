//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.
package questions;

import java.util.HashMap;

public class Test07 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Indian", 20);
        people.put("Pakistani", 15);
        people.put("Nepali", 8);

        for(Integer value : people.values()){
            System.out.println(value);
        }


    }
}
