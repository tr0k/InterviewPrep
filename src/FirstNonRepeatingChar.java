/**
 * Given a string, find the first non-repeating character in it.
 * (ref. http://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/)
 */
public class FirstNonRepeatingChar {

    private static char countArr[] = new char[256];

    /*
     * First approach.
     * 1) Scan the string from left to right and construct the count array.
     * 2) Again, scan the string from left to right and check for count of each character, if you find an element
     * who's count is 1, return it.
     * Time complexity:
     */

    /*
     * Time complexity: O(n)
     */
    private static void countCharsInStr(String str){
        for(int i=0; i < str.length(); ++i)
            ++countArr[str.charAt(i)];
    }

    /*
     * Returns index of a non repeating element from the input string
     */
    private static int firstNonRepeatingChar(String str){
        countCharsInStr(str);
        for (int i=0; i < str.length(); ++i){
            if(countArr[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String testStr = "GeeksfForGeeksf";

        // First solution, complexity O(n)
        int index = firstNonRepeatingChar(testStr);
        if(index == -1)
            System.out.println("Non of the characters is non repeating.");
        else
            System.out.println("Index: " + index + " Character: " + testStr.charAt(index));
    }
}
