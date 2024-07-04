public class day3 {
    public static void main(String[] args) {

        // simple is statment
        System.out.println("Simple if statement");
        int x = 10;
        int y = 12;
        if (x + y > 20) {
            System.out.println("x + y is greater than 20");
        }

        // if... else statement
        System.out.println("if...else statement");
        int a = 10;
        int b = 12;
        if (a + b < 10) {
            System.out.println("a + b is less than      10");
        } else {
            System.out.println("a + b is greater than 20");
        }

        // if-else-if ladder

        System.out.println("if-else-if ladder");

        String city = "Delhi";
        if (city == "Meerut") {
            System.out.println("city is meerut");
        } else if (city == "Noida") {
            System.out.println("city is noida");
        } else if (city == "Agra") {
            System.out.println("city is agra");
        } else {
            System.out.println(city);
        }

        // Nested if-statement

        System.out.println("Nested if-statement.");

        String address = "Delhi, India";

        if (address.endsWith("India")) {
            if (address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            } else if (address.contains("Noida")) {
                System.out.println("Your city is Noida");
            } else {
                System.out.println(address.split(",")[0]);
            }
        } else {
            System.out.println("You are not living in India");
        }

        // Switch Statement:

        System.out.println("Switch Statement");

        int num = 2;
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

        // for loop

        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        // for-each loop
        System.out.println("for-each loop");
        // create an array
        int[] numbers = { 3, 9, 5, -5 };
        for (int number : numbers) {
            System.out.println(number);
        }

        // while loop
        System.out.println(" while loop");

        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }

        // do-while loop
        System.out.println("do-while loop");

        int j = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(j);
            j = j + 2;
        } while (j <= 10);

        // break statement

        System.out.println("break statement");

        for (int k = 0; k <= 10; k++) {
            System.out.println(k);
            if (k == 6) {
                break;
            }
        }

        //continue statement
        System.out.println("continue statement");

        for(int m = 0; m<= 2; m++) {  
  
            for (int n = m; n<=5; n++) {  
              
            if(n == 4) {  
            continue;  
            }  
            System.out.println(n);  
            }  
            } 
    }

}
