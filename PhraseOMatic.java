// PhraseOMatic Program

public class PhraseOMatic {

public static void main (String[] args) {

// Make three sets of words to choose from

/// Creating 3 String arrays

String [] wordsListOne = {
"Smart", "Alpha", "BetaAsFuck", "SuperWeak"};

String [] wordsListTwo = { "awesome", "super", "dope"};

String [] wordsListThree = { "haha", "lol", "hehehehe"};



// Find out how many words are in each list and store it as an int

int lengthListOne = wordsListOne.length;

int lengthListTwo = wordsListTwo.length;

int lengthListThree = wordsListThree.length;

// Generate three random numbers and store in an int variable

int rand1 = (int) (Math.random() * lengthListOne);
int rand2 = (int) (Math.random() * lengthListTwo);
int rand3 = (int) (Math.random() * lengthListThree);

// Build a new phrase

String phrase = wordsListOne[rand1] + " " + wordsListTwo[rand2] + " " + wordsListThree[rand3];

// Print out the phrase

System.out.println("What we need is a " + phrase);
}
}

