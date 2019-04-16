import java.util.HashMap;

class HashMapped {

public static void main (String [] args) {

HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();

myHashMap.put("Chicken Wing", 5);

myHashMap.put("Chicken Breast", 6);

myHashMap.put("Chicken Leg", 7);

//System.out.println(myHashMap.get("Chicken Breast"));

// Iterate over HashMap to print out all values

for ( String chicken : myHashMap.keySet()) {

System.out.println(myHashMap.get(chicken));

}

}

}





