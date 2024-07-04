public class day2 {
    public static void main(String[] args) { 
    
//--------  Examples : Arithmetic Operators
        // declare variables

    System.out.println("Arithmetic Operators");    
    int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));


//------- Examples : Assignment Operators
System.out.println("Assignment Operators"); 
    // create variables
    int c = 4;
    int var;

    // assign value using =
    var = c;
    System.out.println("var using =: " + var);

    // assign value using =+
    var += c;
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= c;
    System.out.println("var using *=: " + var);


//--------- Examples : Relational Operators

System.out.println("Relational Operators"); 
    // create variables
    int d = 7, e = 11;

    // value of d and e
    System.out.println("d is " + d + " and e is " + e);

    // == operator
    System.out.println(d == e);  // false

    // != operator
    System.out.println(d != e);  // true

    // > operator
    System.out.println(d > e);  // false

    // < operator
    System.out.println(d < e);  // true

    // >= operator
    System.out.println(d >= e);  // false

    // <= operator
    System.out.println(d <= e);  // true


//---------  Examples : Logical Operators

System.out.println("Logical Operators"); 
         // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println(5 > 3);  // true
    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false


//--------- Examples: Increment final and Decrement Operators
System.out.println("Increment final and Decrement Operators"); 
         // declare variables
    int f = 12, g = 12;
    int result1, result2;

    // original value
    System.out.println("Value of f: " + f);

    // increment operator
    result1 = ++f;
    System.out.println("After increment: " + result1);

    System.out.println("Value of g: " + g);

    // decrement operator
    result2 = --g;
    System.out.println("After decrement: " + result2);


//-------  Java Ternary Operator
System.out.println("Ternary Operators"); 
int februaryDays = 29;
String result;

// ternary operator
result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
System.out.println(result);


    }
}
