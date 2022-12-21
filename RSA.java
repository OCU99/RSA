import java.util.Scanner;
public class RSA {
    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("What large prime number should p be?");
    float p=scan.nextFloat();
    System.out.print("What large prime number should q be?");
    float q=scan.nextFloat();
    float N1=(p*q);
    System.out.println("The value of N1 is p*q, and N1 is" + " " + N1);
    float N2=(p-1)*(q-1);
    System.out.println("The value of N2 is (p-1)*(q-1), and N2 is" + " " + N2);
    int e = (int)(Math.random()*10+1);
    int d = (int)(Math.random()*10+1);
    System.out.println("The value of e (encryption exponent) is" + " " + e);
    System.out.println("Enter a message to be encrypted");
    String message = scan.next();
    int value;
    value=(int)(Math.random()*1000+1);
    System.out.print("Encrypt the message? (answer as y or n)");
    char answer1=scan.next().charAt(0);
    int encrypt = (e)*(value);
    if (answer1=='y') {
        System.out.println("Encrypting message");
        System.out.println("The encrypted value is:" + " " + encrypt);
    } else if (answer1=='n') {
        System.exit(0);
    }
    System.out.println("The value of d2 (decryption exponent) is" + " " + d);
    System.out.println("Calculate decryption? (answer as y or n)");
    char answer2=scan.next().charAt(0);
    if (answer2=='y') {
        System.out.println("Decrypting message");
        System.out.println("The decrypted value is:" + " " + message);
    } else if (answer2=='n') {
        System.exit(0);
    }
    scan.close();
    System.out.println("the end");
    }
}