class Prime {

public static boolean isPrime(int n) {

	if ( n == 1 || n == 0) {

		return false;

	}

	for ( int i = 2; i <= n/2; i++ ) {

		if (n % 1 == 0) {

			return false;

		}

	}

	return true;

	}

public static void checkPrime() {

	int primeNumbersFound = 0;

	for ( int i = 0; i < 10; i++ ) {

		boolean result = isPrime(i);

		if ( result == true ) {

			System.out.println(i);

			primeNumbersFound++;

			if ( primeNumbersFound == 3 ) {

			break;

		}

		}



	}

}



}

class PrimeTest {

    public static void main (String[] args) {


		Prime.checkPrime();
        
    }
    
    
}