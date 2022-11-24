import edu.duke.*;
import java.lang.*;
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class encrypt {
    public String encrypt(String input,int key) {
        String inputL = input.toLowerCase();
        StringBuilder encrypt = new StringBuilder(input);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String shiftAlpha = alpha.substring(key) + alpha.substring(0,key);
        for (int i = 0; i < input.length(); i++) {
            char currChar = encrypt.charAt(i);
            int idx = alpha.indexOf(Character.toLowerCase(currChar));
            if (idx != -1) {
                char newWord = shiftAlpha.charAt(idx);
                if (Character.isUpperCase(currChar)) {
                    encrypt.setCharAt(i, Character.toUpperCase(newWord));
                } else {
                    encrypt.setCharAt(i, newWord);
                }
            } else {
                encrypt.setCharAt(i, currChar);
            }
        }
        return encrypt.toString();
    }
    
    public String encryptTwoKeys(String input,int key1,int key2) {
        String inputL = input.toLowerCase();
        StringBuilder encrypt = new StringBuilder(input);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String shiftAlpha1 = alpha.substring(key1) + alpha.substring(0,key1);
        String shiftAlpha2 = alpha.substring(key2) + alpha.substring(0,key2);
        for (int i = 0; i < input.length(); i++) {
            if (i%2==0) {
                char currChar = encrypt.charAt(i);
            int idx = alpha.indexOf(Character.toLowerCase(currChar));
            if (idx != -1) {
                char newWord = shiftAlpha1.charAt(idx);
                if (Character.isUpperCase(currChar)) {
                    encrypt.setCharAt(i, Character.toUpperCase(newWord));
                } else {
                    encrypt.setCharAt(i, newWord);
                }
            } else {
                encrypt.setCharAt(i, currChar);
            }
            } else {
                char currChar = encrypt.charAt(i);
            int idx = alpha.indexOf(Character.toLowerCase(currChar));
            if (idx != -1) {
                char newWord = shiftAlpha2.charAt(idx);
                if (Character.isUpperCase(currChar)) {
                    encrypt.setCharAt(i, Character.toUpperCase(newWord));
                } else {
                    encrypt.setCharAt(i, newWord);
                }
            } else {
                encrypt.setCharAt(i, currChar);
            }
            }
        }
        return encrypt.toString();
    }
    
    public void testCaesar() {
        //FileResource fr = new FileResource();
        //String message = fr.asString();
        String encrypted2 = encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
        String encrypted = encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15);
        System.out.println("key is " + "\n" + encrypted2);
    }
}
