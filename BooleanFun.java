import java.util.*;
public class BooleanFun {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int myAge = in.nextInt();

        in.close();

        System.out.println("Current age: " + myAge);

        //convert these into something more complete using if statements
        System.out.println("Can rent a car: " + (myAge >= 25));
        System.out.println("Gets a senior discount: "+ (myAge >= 65));
        System.out.println("Can order from children's menu: " + (myAge <=12));

        if(myAge >= 25) {
            System.out.println("You can rent a car");
        } else {
            System.out.println("You can't rent a car");
        }
        if(myAge > 65) {
            System.out.println("Get a senior discount");
        }
        if(myAge<=12) {
            System.out.println("Can order from a children's menu");
        }
        myAge++;
        System.out.println("On your next birthday out you will be: " + myAge); //complete this code, don't do math in out

        //further modification: prompt user for input and then print what they are able to do based on their age
        //and print their age on their next birthday

    }
}
