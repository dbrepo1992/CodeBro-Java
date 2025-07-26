public class Main {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                               but different parameters
        //                               signature = name + parameters

        // ---------------- FIRST EXAMPLE
        // System.out.println(add(1, 2, 3));


        // -------------------- SECOND EXAMPLE

        String pizza = bakePizza("flat bread", "mozarella", "pepperoni");

        System.out.println(pizza);



    }
        // ------------------- FIRST EXAMPLE
    /*
    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

     */

    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
