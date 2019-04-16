import java.util.HashMap;

class Hashmappy {

public static void main (String [] args) {

HashMap <String, String> userPasswords = new HashMap<String, String>();

userPasswords.put("Anthony12", "password1");

userPasswords.put("Sara1", "password2");

userPasswords.put("Tyler7", "password3");

for ( String username : userPasswords.keySet()) {

System.out.println(userPasswords.get(username));


}

}

}

