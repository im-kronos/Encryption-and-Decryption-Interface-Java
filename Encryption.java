
package encrypdecryp;

public class Encryption {
    public String getTextKey(String text,int key){
        System.out.println("From encryption class");
        System.out.println(text+" "+key);
        String entext = EncryptProcess(text, key);
        return entext;a
    }

    private String EncryptProcess (String text,int key){
        System.out.println("from private encryption class");
        String encrypted = " ";
        for(int i=0;i<text.length();i++){
            char chr = text.charAt(i) ;
            System.out.println("string letter:"+chr);
            int chrcode = (int) chr;
            System.out.println("charcode:"+chrcode);
            if(chrcode == 32){
                System.out.println("space found");
                encrypted = encrypted + " " ;
            }
            // for small letters 
            else if (chrcode>=97 && chrcode <=122){
                System.out.println("inside small letters");
                int asciicode = (chrcode + key - 97)%26 + 97;
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            // for capital letters
            else if (chrcode>=65 && chrcode <=90){
                System.out.println("inside capital letters");
                int asciicode = (chrcode + key - 65)%26 + 65;
                System.out.println("ascii value: " + asciicode);
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            // for numbers
            else if (chrcode>=48 && chrcode <=57){
                System.out.println("inside numbers letters");
                int asciicode = (chrcode + key - 48)%10 + 48;
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            // for symbols set 1
            else if (chrcode>=33 && chrcode <=47){
                System.out.println("inside symbols ! / letters");
                int asciicode = (chrcode + key - 33)%15 + 33;
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            // for symbols set 2
            else if (chrcode>=58 && chrcode <=64){
                System.out.println("inside symbols : @ letters");
                int asciicode = (chrcode + key - 58)%7 + 58;
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            // for symbols set 3
            else if (chrcode>=91 && chrcode <=96){
                System.out.println("inside symbols [ ` letters");
                int asciicode = (chrcode + key - 91)%6 + 91;
                char enchr = (char) (asciicode);
                System.out.println("Encrypted text: " + enchr);
                encrypted = encrypted + enchr;

            }
            

        }
        System.out.println("final output of encrypted text:"+encrypted);
        return encrypted;
    }
    
}
