import java.util.Scanner;

public class BinaryConversion {

    /** Method for Hex to Binary conversion*/
    public static int hex_to_decimal(String s) {
            String digits = "0123456789ABCDEF";
            s = s.toUpperCase();
            int val = 0;
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                int d = digits.indexOf(c);
                val = 16*val + d;
            }
            return val;
        }
    /**Main method */
    public static void main(String[] args){
        //Variable declaration
        int decimal;
        String octal, hexadecimal;

        System.out.println("        Binary Conversion");
        System.out.println("[A] Decimal to Binary\n" +
                "[B] Octal to Binary\n" +
                "[C] Hexadecimal to Binary\n");


        Scanner sc = new Scanner(System.in);
        System.out.print("What mode do you want?");
        char mode = sc.next().charAt(0);
        switch (mode) {
            // decimal to binary
            case 'A': {
                System.out.println("Decimal to Binary");
                int n, count = 0, a;
                String x = "";
                Scanner s = new Scanner(System.in);
                System.out.print("Enter any decimal number:");
                n = s.nextInt();
                while(n > 0)
                {
                    a = n % 2;
                    if(a == 1)
                    {
                        count++;
                    }
                    x = x + "" + a;
                    n = n / 2;
                }
                System.out.println("Binary number:"+x);
                break;
            }
            case 'B': {
                System.out.println("Octal to Binary");
                Scanner in = new Scanner(System.in);
                int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
                long octal_num, tempoctal_num, binary_num, place;
                int rem;
                System.out.print("Enter any octal number: ");
                octal_num = in.nextLong();
                tempoctal_num = octal_num;
                binary_num = 0;
                place = 1;
                while (tempoctal_num != 0)
                {
                    rem = (int)(tempoctal_num % 10);
                    binary_num = octal_numvalues[rem] * place + binary_num;
                    tempoctal_num /= 10;
                    place *= 1000;
                }
                System.out.print("Binary number: " + binary_num+"\n");
                break;
            }
            case 'C': {
                System.out.println("Hexadecimal to Binary");
                String hexdec_num;
                int dec_num, i=1, j;
                int bin_num[] = new int[100];
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter any hexadecimal number: ");
                hexdec_num = scan.nextLine();

                /* convert hexadecimal to decimal */
                dec_num = hex_to_decimal(hexdec_num);

                /* convert decimal to binary */
                while(dec_num != 0)
                {
                    bin_num[i++] = dec_num%2;
                    dec_num = dec_num/2;
                }

                System.out.print("Binary number is: ");
                for(j=i-1; j>0; j--)
                {
                    System.out.print(bin_num[j]);
                }
                System.out.print("\n");
                break;
                }
            default: break;
            }
        }
    }

