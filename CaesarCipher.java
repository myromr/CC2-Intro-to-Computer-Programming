import java.util.Scanner;

public class CaesarCipher {
    /** Method for text encryption */
    public static String encrypt(String plainText){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numeric key for encryption: ");
        int shift = sc.nextInt();
        /* In using the English alphabet and only letter
           shift must be between 0 to 26 */
        if(shift>26){
            shift = shift % 26;
        }
        else if(shift<0){
            shift = (shift % 26) + 26;
        }

        String cipherText = ""; // This will be the return value
        int length = plainText.length();
        //
        for(int i = 0; i<length; i++ ){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){ //Check if ch is a letter
                /*Check if the character is UPPERCASE or lowercase.
                Why? We will need the integer value of each character because
                this integer value of the character represents the value from the ASCII table
                that we will use to shift our characters
                */
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shift); // The new shifted character
                    //Check if character is out of bound
                    //if out of bound it will go at the beginning and loop until it finds a suitable letter
                    if(c>'z'){
                        cipherText += (char)(ch - (26-shift));
                    }
                    else{ // if not out of bound
                        cipherText += c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch+shift); // The new shifted character
                    if(c>'Z'){
                        cipherText += (char)(ch - (26-shift));
                    }
                    else{
                        cipherText += c;
                    }
                }
            }
            else{
                cipherText += ch;
            }
        }
        return cipherText;
    }
    /** Method for text decryption */
    public static String decrypt(String plainText){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numeric key for decryption: ");
        int shift = sc.nextInt();
        /* In using the English alphabet and only letter
           shift must be between 0 to 26 */
        if(shift>26){
            shift = shift % 26;
        }
        else if(shift<0){
            shift = (shift % 26) + 26;
        }

        String cipherText = ""; // This will be the return value
        int length = plainText.length();
        //
        for(int i = 0; i<length; i++ ){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){ //Check if ch is a letter
                /*Check if the character is UPPERCASE or lowercase.
                Why? We will need the integer value of each character because
                this integer value of the character represents the value from the ASCII table
                that we will use to shift our characters
                */
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-shift); // The new shifted character
                    //Check if character is out of bound
                    //if out of bound it will go at the beginning and loop until it finds a suitable letter
                    if(c<'a'){
                        cipherText += (char)(ch + (26-shift));
                    }
                    else{ // if not out of bound
                        cipherText += c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch-shift); // The new shifted character
                    //Check if character is out of bound
                    //if out of bound it will go at the beginning and loop until it finds a suitable lette
                    if(c<'A'){
                        cipherText += (char)(ch + (26-shift));
                    }
                    else{
                        cipherText += c;
                    }
                }
            }
            else{
                cipherText += ch;
            }
        }
        return cipherText;
    }
    /** Main method */
    public static void main(String[] args){
        // Input message and print encrypted and decrypted message
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message here: ");
        String text = sc.nextLine();

        String cipher = encrypt(text); //text is the first parameter. Second, 5 is the number of shift/s
        System.out.println("Encrypted message: " + cipher);

        String decrypted = decrypt(cipher); //text is the first parameter. Second, 5 is the number of shift/s
        System.out.println("Decrypted message: " + decrypted);
    }
}