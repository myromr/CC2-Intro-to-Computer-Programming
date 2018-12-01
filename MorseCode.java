import java.util.Scanner;

public class MorseCode {
    public static void main(String [] args){


    String Alphabet [] = {"A", "B", "C", "D","E","F","G","H","I","J", "K", "L", "M","N","O","P", "Q","R","S", "T", "U", "V", "W","X","Y","Z","1", "2","3","4","5","6","7","8","9","0"," "};
    String Morse [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"," "};

    //Decide Either English to Morse or Morse to English



    System.out.println("[1]For English-->Morse \n"
                    +  "[2]For Morse-->English");

    Scanner Input = new Scanner(System.in);
    String Response = Input.next();

    //For invalid Input
    while(!(Response.equalsIgnoreCase("1") || Response.equalsIgnoreCase("2")) ){ 
        System.out.println("Invalid input, Please type in 1 or 2");
        Response = Input.next();
    }
    //English to Morse-Code
    if(Response.equalsIgnoreCase("1")){

        System.out.println("Type in English");
        Input.nextLine();
        String Ephrase = Input.nextLine();
        Ephrase = Ephrase.toUpperCase();

        for(int count = 0; count < Ephrase.length(); count++ )
        { 
            for(int index = 0; index < Alphabet.length; index++) 
            { 
                //Matches English to Morse and Prints
                if(Ephrase.substring(count, (count+1)).equals(Alphabet[index]))
                    System.out.print(Morse[index] + " "); 
            } 
        } 


    }
    //Morse-Code to English
    else if(Response.equalsIgnoreCase("2")){

        System.out.println("Type in MorseCode");
        Input.nextLine();
        String Mphrase = Input.next();

        for( int count = 0; count < Mphrase.length(); count++  )
        { 
            for (Scanner s = new Scanner(Mphrase); s.hasNext();) {

                String letter = s.next();

                for(int index = 0; index < Morse.length; index++) {

                    if(letter.equals(Morse[index])) { 

                        System.out.println(Alphabet[index]);
                        break;
                   }
                }


            }

        } 
}

    }}