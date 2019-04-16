import java.util.Date;
import java.util.Calendar;

class NumberFormat {

public static void main (String[] args) {

int int1 = 42000;

double double1 = 52.56;

String s1 = String.format("%,d", int1);

System.out.println(s1);

String s2 = String.format("%.1f", double1);

System.out.println(s2);

Date myDate = new Date();

System.out.println(myDate);

System.out.println(String.format("%tA, %tB, %td", myDate, myDate, myDate));

// Same as above, without repeating arguments

System.out.println(String.format("%tA, %<tB, %<td", myDate));

Calendar c = Calendar.getInstance();

c.set(2018,11,5,13,53);

System.out.println(c.getTime());



}

}