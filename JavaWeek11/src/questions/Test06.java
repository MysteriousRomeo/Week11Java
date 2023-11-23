//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)
package questions;

import java.util.HashSet;

public class Test06 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(4);
        num.add(7);
        num.add(8);
        num.add(11);

        System.out.println(num);
        System.out.println("The numbers betweek 1 and 10 are :");
        for(int i = 1; i<=10; i++){
            if (num.contains(i)){
                System.out.println(i);
            }
        }
    }
}
