package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        /*
         Implement the program that will consume a character from method argument
         which will be from english alphabet and print vowel
         if it is "Vowel" or consonant if it's "Consonant".
         And If it is not from eng alphabet than print "wrong alphabet!"
        */
        char lowerCaseChar = Character.toLowerCase(character);

        if (lowerCaseChar < 'a' || lowerCaseChar > 'z') {
            System.out.println("wrong alphabet!");
        } else if (lowerCaseChar == 'a' ||
                lowerCaseChar == 'e' ||
                lowerCaseChar == 'i' ||
                lowerCaseChar == 'o' ||
                lowerCaseChar =='u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
