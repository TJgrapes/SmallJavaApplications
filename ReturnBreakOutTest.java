class ReturnBreakOut {

static int number = 2;
    
public static int breakOut() {

	System.out.println("This will print because it is before return statement");

	return 1;

	// Nothing after return statement will be printed; exits immediately


    
}

}

class ReturnBreakOutTest {

    public static void main (String[] args) {

	System.out.println(ReturnBreakOut.breakOut());
        
    }
    
    
}