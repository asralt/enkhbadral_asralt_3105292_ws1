package griffith.Word;

public class Word {
    private char[] letters;

    public Word(char[] letters) {
        this.letters = (letters != null) ? letters : new char[0];
    }

    // loops and checks for the symbol in the array if there is it will return true
    // if not false
    public boolean contains(char symbol) {
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }

    // returns length
    public int length() {
        return letters.length;
    }

    // returns the array
    public char[] getLetters() {
        return letters;
    }
}
