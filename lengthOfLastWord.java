/*
 *  Leet code 58: Length of last word
 *  Given a string s consisting of words and spaces, return the length of the last word in the string.
 *  A word is a maximal substring consisting of non-space characters only.
 */
public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 9 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        lengthOfLastWord solution = new lengthOfLastWord();

        System.out.println(solution.lengthOfLastWord("Luffy is still joyboy"));
        System.out.println(solution.lengthOfLastWord("  fly me  to  the moon "));
        System.out.println(solution.lengthOfLastWord(" a"));
        System.out.println(solution.lengthOfLastWord("Hello programming"));
    }
}
