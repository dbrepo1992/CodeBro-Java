public class Main {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data



        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"carrot", "potato", "tomato"};
        String[] meats = {"chicken", "pork", "beef", "fish"};


        // String[][] groceries = {fruits, vegetables, meats}; // example with arrays names

        String[][] groceries = {{"apple", "orange", "banana"}, // example with data from each array where
                                {"carrot", "potato", "tomato"},// you can see the matrix already.
                                {"chicken", "pork", "beef", "fish"}};


        // EXAMPLE HOW TO CHANGE DATA IN 2D ARRAYS
        groceries[1][1]  = "onion";
        groceries[2][1]  = "lamb";
        groceries[0][0]  = "watermelon";

        // FIRST SOLUTION (generate the column because of println instead of print

        for ( String[] foods : groceries){
            for (int i = 0; i < foods.length; i++){
                System.out.println(foods[i]);
            }
            System.out.println();
        }

        // SECOND SOLUTION (generate a matrix (columns, rows) of data because of print.

        for ( String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }



    }
}
