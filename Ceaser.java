import java.util.*;

public class Ceaser
{ 
public static final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
public static final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
public static String encrypt(String plainText, int shiftKey)
{
    String cipherText = "";
    for (int i = 0; i < plainText.length(); i++)
    {
        int charPosition = -1;
        char replaceVal;
        int keyVal = -1;
        char val = plainText.charAt(i);
        //System.out.println(val);
        if(Character.isUpperCase(val)) {
            charPosition = ALPHABET_UPPER.indexOf(val);
            if(charPosition != -1) {
                keyVal = (shiftKey + charPosition) % 26;
                replaceVal = ALPHABET_UPPER.charAt(keyVal);
            } else {
                replaceVal = plainText.charAt(i);
            }           
        } else {
            charPosition = ALPHABET_LOWER.indexOf(val);
            if(charPosition != -1) {
                keyVal = (shiftKey + charPosition) % 26;
                replaceVal = ALPHABET_LOWER.charAt(keyVal);
            } else {
                replaceVal = plainText.charAt(i);
            }
        }       
        //System.out.println("Cipher: "+cipherText);
        cipherText += replaceVal;        
    }
    return cipherText;
}

public static String decrypt(String cipherText, int shiftKey)
{
    String plainText = "";
    for (int i = 0; i < cipherText.length(); i++)
    {
        int charPosition = -1;
        char replaceVal;
        int keyVal = -1;
        char val = cipherText.charAt(i);

        if(Character.isUpperCase(val)) {
            charPosition = ALPHABET_UPPER.indexOf(val);
            if(charPosition != -1) {
                keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET_UPPER.length() + keyVal;
                }
                replaceVal = ALPHABET_UPPER.charAt(keyVal);
            } else {
                replaceVal = cipherText.charAt(i);
            }           
        } else {
            charPosition = ALPHABET_LOWER.indexOf(val);
            if(charPosition != -1) {
                keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET_LOWER.length() + keyVal;
                }
                replaceVal = ALPHABET_LOWER.charAt(keyVal);
            } else {
                replaceVal = cipherText.charAt(i);
            }
        }
        plainText += replaceVal;
    }
    return plainText;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String for Encryption: ");
    String message = new String();
    message = sc.nextLine();
    int key;
    System.out.println("Enter key");
    key=sc.nextInt();
    System.out.println("Encrypted:"+encrypt(message, key));
    System.out.println("Decrypted:"+ decrypt(encrypt(message, key), key));
    sc.close();
}
}
