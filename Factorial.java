import java.util.Scanner;
import java.math.BigInteger;
 
class Factorial {

  public static void main(String args[])
  {
    int n, c;
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
   
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter an interger: ");
    n = input.nextInt();
 
    for (c = 1; c <= n; c++) {
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
    }
 
    System.out.println(n + "! = " + fact);
  }
}