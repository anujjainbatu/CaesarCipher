import edu.duke.*;
import java.lang.*;
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    public boolean isVowel(char ch) {
        char chC = Character.toLowerCase(ch);
        boolean ans = false;
        if(chC == 'a' || chC == 'e' || chC == 'i' || chC == 'o' || chC == 'u') {
            ans = true;
        }
        return ans;
    }
    
    public void testIsVowel() {
        boolean test1 = isVowel('a');
        System.out.println(test1);
        
        test1 = isVowel('b');
        System.out.println(test1);
        
        test1 = isVowel('u');
        System.out.println(test1);
    }
    
    public String replaceVowels(String phrase,char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        String ans = "";
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = sb.charAt(i);
            if (isVowel(currChar) == true) {
                ans += ch;
            } else {
                ans += currChar;
            }
        }
        return ans;
    }
    
    public void testReplaceVowels() {
        String test = replaceVowels("Hello World", '*');
        System.out.println(test);
        
        test = replaceVowels("anujjainbatu", '*');
        System.out.println(test);
    }
    
    public String emphasize(String phrase,char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        String ans = "";
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = sb.charAt(i);
            if (currChar == ch) {
                if (i%2==0) {
                    ans += '*';
                } else {
                    ans += '+';
                }
            } else {
                ans += currChar;
            }
        }
        return ans;
    }
    
    public void testEmphasize() {
        String test = emphasize("Mary Bella Abracadabra", 'a');
        System.out.println(test);
        
        test = emphasize("anujjainbatu", 'a');
        System.out.println(test);
    }
}
