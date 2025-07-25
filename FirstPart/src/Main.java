import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        // VARIABLES

    /*
        int age = 33;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char word = 'A';
        char symbol = '@';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;


        String name = "Damian";
        String car = "Mustang";
        String color = "Red";

        System.out.println(name);


        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }


        System.out.println(isOnline);
        System.out.println(forSale);
        System.out.println(isStudent);

        System.out.println(word);

        System.out.println(price + "$");

        System.out.println("The year is " + year);

        System.out.println(age);
        System.out.println("Hello World!");
        System.out.println("My name is Java");
        System.out.println("I'm a programming language");

        System.out.println("Your choice is a " + year + " " + car + " " + color);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }
    */

        // ---------------------------------------------------------------------

        // SCANNER

    /*
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + student);

        if (student) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }
*/


        // COMMON ISSUES

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // <--- So this method clear the input buffer , pushing the "Enter" button you create \n which is your input for the String colour.Check it by delete this line.


        System.out.print("Enter your favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("Your age is: " + age);
        System.out.println("Your favourite colour is: " + colour);

        scanner.close();

         */

        // ---------------------------------------------------------------

        // Calculate area of a triangle

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your a? ");
        double a = scanner.nextDouble();

        System.out.println("What is your h? ");
        double h = scanner.nextDouble();

        System.out.println("Your area of triangle is: " + (a * h)/2);
        System.out.println("Sum of a and h is: " + (a + h));

         */

        // Calculate area of rectangle

        /*
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your width? ");
        width = scanner.nextDouble();

        System.out.println("What is your height? ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Your rectangle area is: " + area + "cm^2");



        scanner.close();

         */

        //  ---------------------------------------------

        /*
        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjecitve (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjecitve (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action):");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

        */

        // -----------------------------------------------------------

        /*
        // ARITHMETIC OPERATORS

        int x = 10;
        int y = 3;
        int z;

        //z = x + y; <-- 13
        //z = x - y;`<-- 7
        //z = x * y; <-- 30
        //z = x / y; <-- 3 and if you want result as floating-point numbers you need to use double type instead of int.
        //z = x % y; <-- 1 (rest from division) becasue you can put only 3 x 3 = 9 in 10 number. So the rest is 1.

        System.out.println(z);

         */

        // ----------------------------------------------------------

        // AUGMENTED ASSIGNMENT OPERATORS

        /*

        int x = 10;
        int y = 3;

        x += y; // it's same as x = x + y;
        x -= y; // it's same as x = x - y;
        x /= y; // it's same as x = x / y;
        x *= y; // it's same as x = x * y;
        x %= y; // it's same as x = x % y;


        System.out.println(x);

         */

        // ----------------------------------------------------------

        // INCREMENT AND DECREMENT OPERATORS

        /*
        int x = 1;

        x++; // the same as x = x + 1;
        x--; // the same as x = x - 1;

        System.out.println(x);



        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // - Parentheses
        // - Exponents
        // - Multiplication
        // - Division
        // - Addition
        // - Substraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

         */

        // -------------------------------------------------------------------

        // IF STATEMENT = PERFORMS A BLOCK OF CODE IF ITS CONDITION IS TRUE

        /*

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (true/false)" );
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }

        // GROUP 2
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        // GROUP 3

        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student!");
        }

         */


        //------------------------------------------------------------

        // RANDOM NUMBERS

        /*

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number4;
        double number5;
        double number6;

        boolean isHeads; // game flip a coin

        isHeads = random.nextBoolean();

        System.out.println(isHeads);

        if(isHeads){
            System.out.println("It's a Heads, you will survive!");
        }
        else {
            System.out.println("It's a Tale, you will die!");
        }

        number1 = random.nextInt(1, 101); // it gives us random number from first toone before last (without last number)
        number2 = random.nextInt(1, 101); // it gives us random number from first toone before last (without last number)
        number3 = random.nextInt(1, 101); // it gives us random number from first toone before last (without last number)

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        number4 = random.nextDouble(); // it gives us random number from first toone before last (without last number)
        number5 = random.nextDouble(1, 101); // it gives us random number from first toone before last (without last number)
        number6 = random.nextDouble(1, 101); // it gives us random number from first toone before last (without last number)

        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);

         */

        //--------------------------------------------------

        // MATH CLASSES

        /*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3); // it's just 2^3 = 8, another instance --> 2^5=32 etc.
        result = Math.abs(-5); // this method is for absolute value
        result = Math.sqrt(9); // method of square root
        result = Math.round(3.14); // round to nearest integer number
        result = Math.ceil(3.14); // ceil method rounded number to nearest top integer number. In this case it will be 4.0;
        result = Math.floor(3.85); // floor method rounded number to nearest bottom integer number. In this case it will be 3.0;
        result = Math.max(6.58, 2.44); // this method looking for highest value from all values.
        result = Math.min(6.58, 2.44); // this method looking for lowest value from all values.


        System.out.println(result);

         */

        //---------------------------------------------------------------------

        //HYPOTENUSE c = Math.sqrt(a^2  + b^2) -- Pythagorean theorem

        /*

        double a;
        double b;
        double c;

        System.out.println("Enter the length of a side of triangle: ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of b side of traingle: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse ( side c) is: " + c + "cm");

         */


        //-----------------------

        // CIRCUMFERENCE = 2 * Math.PI * radius;
        // AREA = Math.PI * Math.pow(radius, 2);
        // VOLUME = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        /*

        double radius;
        double circumference;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is the radius of the circle? ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Normal println statement
        /*
        System.out.println("For radius " + radius + " circumference is " + circumference + "cm");
        System.out.println("The area of the circle with radius " + radius + " is " + area + "cm2");
        System.out.println("The volume of the circle with radius " + radius + " is " + volume + "cm3");



        // printf statement with placeholder (less digits).

        System.out.printf("For radius " + radius + " circumference is %.1fcm\n", circumference); // this .1 betwen % and f means that you want only 1 digit
        System.out.printf("The area of the circle with radius " + radius + " is %.1fcm2\n", area);
        System.out.printf("The volume of the circle with radius " + radius + " is %.1fcm3\n", volume);

        scanner.close();

        */

        //--------------------------------------------------------------------------------------------

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        /*

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 6.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f ft tall\n", height); // f instead of d (double) because f as FLOATING POINT
        System.out.printf("Are you employed? %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive



        double price1 = -90000000.99;
        double price2 = 1000000.15;
        double price3 = -5400000.01;

        System.out.printf(Locale.US,"Price1: %(.2f\n", price1); // f instead of d (double) because f as FLOATING POINT (if you use 1f for floating point number, then program will round your number.
        System.out.printf(Locale.US, "Price2: %,.3f\n", price2); // Locale.US let you format your number with commas. Without it your output is 90 000 000,990000
        System.out.printf("Price3: %,.2f\n", price3); // example with no Locale.US. Another case, when you use "(" negative value will be closed in parentheses. ( sout above)


        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%02d\n", id1);
        System.out.printf("%-5d\n", id2); // 5 left justified padding
        System.out.printf("%4d\n", id3);
        System.out.printf("%06d\n", id4);

         */

        //-------------------------------------------------------------

        // compound interest calculator

        /*

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate (in%): ");
        rate = scanner.nextDouble();
        rate = rate / 100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years); // --> A = P * ([1 + (r/n)])^nt

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();

         */

        //-----------------------------------------------------

        // NESTED IF STATEMENTS

        /*

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price = price * 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }


        System.out.printf("The price of a ticket is: $ %.2f", price);

         */


        //-------------------------------------------------------------------

        // STRING METHODS

        // String name = "Password";

        // int length = name.length();
        // char letter = name.charAt(0);
        // int index = name.indexOf("d");
        // int lastIndex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLoweCase();
        // name = name.replace("o", "u");
        // name = name.trim();  // this method remove white spaces before and after your String.


        /*
        if(name.isEmpty()){
            System.out.println("You have to insert your name");
        } else{
            System.out.println("Your name is " + name);
        }

         */


        // System.out.println(length);
        // System.out.println(letter);
        // System.out.println(index);
        // System.out.println(lastIndex);
        // System.out.println(name);
        // System.out.println(name.isEmpty()); // This method check that your String is empty. It's return boolean value (true / false)

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name does not contain any spaces");
        }

         */

        /*

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }

         */


        //----------------------------------------------------------

        // SUBSTRINGS
        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        /*

        String email = "pigeon2312@mairoo.com";
        String userName = email.substring(0,10);
        String domain = email.substring(11, 21);

        System.out.println(userName);
        System.out.println(domain);

        // to make this method flexible

        Scanner scanner = new Scanner(System.in);
        String email1;
        String username1;
        String domain1;

        System.out.println("Enter your email? ");
        email1 = scanner.nextLine();
        if(email1.contains("@")){
            String userName1 = email1.substring(0,email1.indexOf("@"));
            domain1 = email1.substring(email1.indexOf("@") + 1); // + 1 removed "@" from output

            System.out.println(userName1);
            System.out.println(domain1);
        } else {
            System.out.println("Your email is incorrect! Email must contain @");
        }



        scanner.close();

         */


        // WEIGHT CONVERSION PROGRAM

        /*
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);




        double weight;
        double newWeight;
        int choice;





        System.out.println("Welcome to WEIGHT CONVERSION PROGRAM!");


        System.out.println("What is your choice?\n 1: Convert lbs to kgs\n 2: Convert kgs to lbs");
        choice = scanner.nextInt();



    if (choice == 1){
        System.out.println("Please enter the weight in lbs: ");
        weight = scanner.nextDouble();
        newWeight = weight * 0.45359237;
        System.out.printf("The new weight in kgs is: %.2f", newWeight);
    } else if (choice == 2) {
        System.out.println("Please enter the weight in kgs: ");
        weight = scanner.nextDouble();
        newWeight = weight * 2.20462262;
        System.out.printf("The new weight in lbs is: %.2f", newWeight);
    } else {
        System.out.println("Invalid choice!");
    }

    scanner.close();

         */

        //---------------------------------------------------------------------------

        // TERNARY OPERATOR
        // ternary operator ?= Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        /*

        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.println("What is your score?: ");
        score = scanner.nextInt();
        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println("Your result is: " + passOrFail);

        int number;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours;
        System.out.println("Enter a number of hours: ");
        hours = scanner.nextInt();
        String timeOfDay = (hours < 12) ? "a.m" : "p.m";
        System.out.println(timeOfDay);

        int income;
        System.out.println("What is your income? ");
        income = scanner.nextInt();

        double taxes = (income >= 40000) ? income * 0.25 : income * 0.15;
        System.out.println("$" + taxes);

        scanner.close();
         */

        //------------------------------------------------------------------

        // TEMPERATURE CONVENTER

        /*

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double temperature;
        double newTemperature;
        String unit;    // we can use char also for unit but String had a lot more methods.

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();


        newTemperature = (unit.equals("C")) ? (temperature - 32) / 1.8 : (temperature * 1.8) + 32;

        System.out.printf("%.1f°%s", newTemperature, unit);
        scanner.close();

         */

        //-----------------------------------------------------------------------

        // ENHANCED SWITCH = A replacement to many else if statements (Java14 feature)

        /*

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String day;

        System.out.println("Enter the day of the week: ");
        day = scanner.nextLine();

         */

        /*

        // if,else statements


        if (day.equals("MONDAY")){
            System.out.println("It is a weekday");
        } else if(day.equals("TUESDAY")){
            System.out.println("It is a weekday");
        } else if(day.equals("WEDNESDAY")){
            System.out.println("It is a weekday");
        } else if(day.equals("THURSDAY")){
            System.out.println("It is a weekday");
        } else if(day.equals("FRIDAY")){
            System.out.println("It is a weekday");
        } else if(day.equals("SATURDAY")){
            System.out.println("It is the weekend");
        } else if(day.equals("SUNDAY")){
            System.out.println("It is the weekend");
        } else {
            System.out.println("There is no day like " + day + "!");
        }

         */

        // okay so alternative instance with ENHANCED SWITCH

        /*

        switch(day){
            case "MONDAY" -> System.out.println("It is a weekday.");
            case "TUESDAY" -> System.out.println("It is a weekday.");
            case "WEDNESDAY" -> System.out.println("It is a weekday.");
            case "THURSDAY" -> System.out.println("It is a weekday.");
            case "FRIDAY" -> System.out.println("It is a weekday.");
            case "SATURDAY" -> System.out.println("It is the weekend!");
            case "SUNDAY" -> System.out.println("It is the weekend!");
            default -> System.out.println("There no day like " + day + "!");
        }

         */

        // ENHANCED SWITCH with DRY ( Don't Repeat Yourself! ) methodology.
        /*

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("This is a weekday.");
            case "Saturday", "Sunday" ->
                    System.out.println("This is the weekend!");
            default ->
                    System.out.println("There no day like " + day + "!");
        }

        scanner.close();

        */

        //----------------------------------------------------------------------

        // CALCULATOR PROGRAM

        /*

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0; // in this case you can't leave result uninitialized because program
        boolean zeroDivision = true; // this boolean is used to stop the program while user divide by zero.

        System.out.println("Enter first number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^)");
        operator = scanner.next().charAt(0); // this method let you return a single character.
                                            // In this case U using type of something and want only first character.

        System.out.println("Enter second number: ");
        secondNumber = scanner.nextDouble();

        switch (operator){
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("You can't divide by zero!");
                    zeroDivision = false;
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = (Math.pow(firstNumber, secondNumber));
            default -> {
                    System.out.println("There is no operator like " + operator + "!");
                    zeroDivision = false;
            }
        }
        if(zeroDivision == true) {  // u can also use if(zeroDivision) because default in boolean is true;
            System.out.println(result);
        }

        scanner.close();

         */

        //-----------------------------------------------------------------

        // LOGICAL OPERATORS

        // && = AND  // in this LOGICAL OPERATOR all conditions must be TRUE
        // || = OR // in this LOGICAL OPERATOR at least one condition must be TRUE
        // !  = NOT // in this LOGICAL OPERATOR at least one condition must be FALSE

        // Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // First example
        /*
        double temp = -20;
        boolean isSunny = true;

        if(temp >= 5 && temp <= 30 && isSunny) {
            System.out.println("The weather is nice");
            System.out.println("It is SUNNY outside");
        } else if (temp >= 5 && temp <= 30 && !isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp < 0 || temp > 30){
            System.out.println("The weather is BAD");
        }

         */

        // Second example

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        /*

        String username;
        System.out.println("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() > 12 || username.length() < 4) {
            System.out.println("Your username must be between 4-12 characters!");
        } else if (username.contains("_") || username.contains(" ")) {
            System.out.println("Username can't contain spaces or underscores");
        } else {
            System.out.println("Welcome " + username);
        }



        scanner.close();

         */

        // ---------------------------------------------------------------

        // WHILE LOOP = repeat some code forever
        //              while some condition remains true

        // Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // String name = "";

        /*
        //  EXAMPLE OF INFINITY LOOP [Before you run this code, make sure that your pc will not explode :D

        while(1 == 1) {
            System.out.println("HELP! I'M STUCK IN A LOOP!");
        }
         */

        /*
        // SECOND EXAMPLE WITH String method .isEmpty()

        while (name.isEmpty()){
            System.out.println("Enter your name (cannot be empty!): ");
            name = scanner.nextLine();
        }

        System.out.println("Welcome " + name);

         */

        // THIRD EXAMPLE with require response from user with check condition using String method .equals()

        /*
        String response = "";

        while(!response.equals("Q")) {  // So in this condition loop is working while response is not (!) equal to Q. Q is requirement to quit the game.
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase(); // You can use next() for single character in output
        }

        System.out.println("You have quit the game");

         */

        /*

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        // IF YOU TYPE IN SOMETHING IT'S VALID, YOU DON'T ENTER THE WHILE LOOP AT ALL.
        // YOU ENTER THE WHILE LOOP ONLY IF YOUR TYPE IS NOT VALID WITH CONDITION.
        // PROGRAM CHECK THE CONDITION BEFORE ENTER THE LOOP
        // age = 25; -->
        // so it's valid and skip the loop and go straight to the -->
        // System.out.println("You are " + age + " years old");

        while (age < 0){
            System.out.println("Age cannot be negative!");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        */

        // FOURTH EXAMPLE WITH DO/WHILE LOOP

        // In DO/WHILE loop we do the code first and then check the condition at the end.
        // So in DO/WHILE loop you enter the loop at least once.

        /*

        int age = 0;

        do{
            System.out.println("Age cannot be negative!");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");

         */

        // FIFTH EXAMPLE

        /*

        int number = 0;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);

         */

        //------------------------------------------------------------------------

        // NUMBER GUESSING GAME

        /*

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); // +1 because last number is exclusive

        System.out.println("NUMBER GUESSING GAME!");

        do{
            System.out.printf("Guess a number between %d-%d\n", min, max);
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Too low, try bit higher");
            } else if (guess > randomNumber){
                System.out.println("Too high, try bit lower");
            }  else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        } while(guess != randomNumber);

         */

        //-----------------------------------------------------------

        // FOR LOOP = EXECUTE SOME CODE A CERTAIN AMOUNT OF TIMES
        // however WHILE LOOP could execute infinity amount of times

        /*



        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter how many times you want to loop: ");

        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println("Pizza");
            System.out.println(i);
        }


        scanner.close();


         */

        // PROGRAM TO SIMULATE A COUNTDOWN

        /*
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("You set the timer on the bomb, set the time in seconds it takes to leave the explosion area: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); // In this line, Java require to add [throws InterruptedException] to void main(String[] args) at the top.
        }                             // This exception typically occurs when a thread running the method is interrupted while it is sleeping, waiting,
                                      // or otherwise paused in its execution.

        System.out.println("BOOM!");

        scanner.close();

         */

        // -----------------------------------------------------------------------------

        // BREAK = BREAK OUT OF A LOOP (STOP)
        // CONTINUE = SKIP CURRENT ITERATION OF A LOOP (SKIP)

        /* BREAK example
        for (int i = 0; i < 10; i++){

            if (i == 5) {
                break;      // Once we have 5, we break up the the loop
            }
            System.out.print(i + " ");
        }

         */
        /* CONTINUE example

        for (int i = 0; i < 10; i++){

            if (i == 5) {
                continue;   // Once we have 5, we skip this iteration and continue the rest
            }
            System.out.print(i + " ");
        }

         */

        //------------------------------------------------------------------------------

        // NESTED LOOP = A LOOP INSIDE ANOTHER LOOP
        // USED OFTEN WITH MATRICES OR DATA STRUCTURES AND ALGORITHMS


        /*

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");Thread.sleep(500);
            }
            System.out.println();
        }


         */

        /*

        int rows;
        int columns;
        char symbol;


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0); // you need  method like charAt for example to input char symbol in scanner method.


        for( int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }


        scanner.close();


         */
    }
}
