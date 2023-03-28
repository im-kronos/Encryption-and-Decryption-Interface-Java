/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encrypdecryp;

/**
 *
 * @author 91861
 */
public class Decryption {
    public String getTextKey(String text,int key){
        System.out.println("From encryption class");
        System.out.println(text+" "+key);
        String entext = DecryptProcess(text, key);
        return entext;
        
    }

    private String DecryptProcess (String text,int key){
        System.out.println("from private decryption class");
        String decrypted = " ";
        for(int i=0;i<text.length();i++){
            char chr = text.charAt(i) ;
            System.out.println("string letter:"+chr);
            int chrcode = (int) chr;
            System.out.println("charcode:"+chrcode);
            if(chrcode == 32){
                System.out.println("space found");
                decrypted = decrypted + " " ;
            }
            // for small letters 
            else if (chrcode>=97 && chrcode <=122){
                System.out.println("inside small letters");
//                int asciicode = (chrcode - key - 97)%26 + 97;
                int convert = (chrcode-key-97);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,26)+97;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;
                
//                FOUND THE BUG -2%26 SHOULD GIVE 24 BUT IT IS GIVING -2 SO NEED TO SOLVE


            }
            // for capital letters
            else if (chrcode>=65 && chrcode <=90){
                System.out.println("inside capital letters");
                int convert = (chrcode-key-65);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,26)+65;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;

            }
            // for numbers
            else if (chrcode>=48 && chrcode <=57){
                System.out.println("inside numbers letters");
                int convert = (chrcode-key-48);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,10)+48;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;

            }
            // for symbols set 1
            else if (chrcode>=33 && chrcode <=47){
                System.out.println("inside symbols ! / letters");
                int convert = (chrcode-key-33);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,15)+33;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;

            }
            // for symbols set 2
            else if (chrcode>=58 && chrcode <=64){
                System.out.println("inside symbols : @ letters");
                int convert = (chrcode-key-58);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,7)+58;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;

            }
            // for symbols set 3
            else if (chrcode>=91 && chrcode <=96){
                System.out.println("inside symbols [ ` letters");
                int convert = (chrcode-key-91);
                System.out.print(convert);
                int modulo = Math.floorMod(convert,6)+91;
                System.out.println(modulo);
                char dechr = (char) (modulo);
                System.out.println("decrypted text: " + dechr);
                decrypted = decrypted + dechr;

            }
            

        }
        System.out.println("final output of encrypted text:"+decrypted);
        return decrypted;
    }
    
}
