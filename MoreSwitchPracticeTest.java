class MoreSwitchPractice {

       public static boolean isLeapYear(int year) {
        
        if( year < 1 || year > 9999) {
            return false;
            
        }
    
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            
            return true;
            
        }
        
        else {
            
            return false;
        }
        
    }
    
    public static int getDaysInMonths(int month, int year) {
        
        if ( month < 1 || month > 12 || year < 1 || year > 9999) {
            
            return -1;
            
        }
        
        else if ( month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
            
            switch (month) {
                
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
                
                case 2: 
                    
                   if (isLeapYear(year) == true) {
                       
                       return 29;
                       
                   }
                       
                    else {
                        
                        return 28;
                        
                    }
                
                case 4: case 6: case 9: case 11: return 30;
                
                
                default: System.out.println("Invalid value");
                
                return -1;
                
                
                
            }
        }
        
        return -1;
        
    }
}
class MoreSwitchPracticeTest {

    public static void main (String[] args) {

	System.out.println(MoreSwitchPractice.isLeapYear(2000));

	System.out.println(MoreSwitchPractice.getDaysInMonths(2, 2000));
        
    }
    
    
}