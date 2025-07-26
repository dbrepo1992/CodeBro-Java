import java.sql.SQLOutput;

public class Main {

    static int x = 3; // visible for every class BUT if within class is another variable int x,
                        // then only LOCAL int x will be used.

    public static void main(String[] args){

        //-------------------- SECOND EXAMPLE

        System.out.println(x); // in here output is 3 because there wasn't local int x.

        // VARIABLE SCOPE = WHERE A VARIABLE CAN BE ACCESSED
        // ---- FIRST EXAMPLE

        /*
        int x = 1;  // LOCAL
                    // A VARIABLE DECLARED INSIDE OF THE METHOD HAS A LOCAL SCOPE

        doSomething(); // OUTPUT: 2
                        // within a context of our doSomething() method,
                        // our doSomething() isn't aware of existence of int x = 1 within main.

         */
        doSomething2();
    }

    //---------------------------- SECOND EXAMPLE
    static void doSomething2() {
        int x = 2; // in here output is 2 because there is LOCAL variable and ignore GLOBAL variable from the top.
        System.out.println(x);
    }
    //---------------------------- FIRST EXAMPLE
    /*
    static void doSomething(){
        int x = 2; // LOCAL SO main class doesn't see this variable because it is abroad of main class scope

        System.out.println(x);
    }

     */

}
