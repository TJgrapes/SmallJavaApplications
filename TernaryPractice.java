/* Practicing using Ternary: Use when you simply want to return a value depending on on boolean expression

Consists of:
A boolean expression
A single statement that gets executed if boolean expression is true
A single statement that get executed if boolean expression is false

*/


class TernaryPractice {

public static void main (String[] args) {


// the variable that will be tested (boolean condition)

boolean subscribed = true;

String hasAccess = (subscribed) ? "Yes, has Access" : "No, does not have Access";

/*
Here, subscribed is the boolean expression, which in this case, is true
"Yes, has Access", the first expression, is evaluated if the boolean expression is true
"No, does not have Access", the second expression, is evaluated if the boolean expression is false
So the hasAccess variable will store "Yes, has Access", because the boolean expression evaluated to true

*/

System.out.println(hasAccess);

}

}