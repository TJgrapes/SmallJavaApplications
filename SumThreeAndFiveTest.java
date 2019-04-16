class SumThreeAndFive {
    

    
}

class SumThreeAndFiveTest {

    public static void main (String[] args) {

	int sum = 0;

	int numberCount = 0;

	for (int i = 1; i <= 1000; i++) {

		if ( i % 3 == 0 && i % 5 == 0 ) {
		
			sum +=i;
			
			System.out.println(i);

			numberCount++;

			if ( numberCount == 5 ) {

			break;
        
    			}

		}

	
    
    
	}

	System.out.println("Sum = : " + sum);

	}

}