package griffith.Word;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    // method that test contains method it calls the method into the
    public void testContains() {
        Word word = new Word(new char[] { 'a', 's', 'k', 'a' });
        assertTrue(word.contains('a'));
        assertTrue(word.contains('e'));
        assertFalse(word.contains('a'));
    }

    @Test
    public void testLength() {
        Word word = new Word(new char[] { 'a', 's', 'k', 'a' });
        assertEquals(4, word.length());
        assertEquals(0, new Word(new char[] {}).length());
        assertEquals(1, new Word(new char[] { 'a' }).length());
    }

    @Test
    public void testNotNull() {
        Word word = new Word(new char[] { 'a' });
        assertNotNull(word.getLetters());
        assertEquals(1, word.getLetters().length);
    }

}
