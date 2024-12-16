import java.util.*;
import cryptography.CaeserCipher;

public class CipherChild{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n!!!!    Welcome to Ceaser Cipher Game   !!!!");
        System.out.println("Enter your String:");
        String input = sc.nextLine();

        System.out.println("\nEnter the shift value :");
        int shift = sc.nextInt(); 

        CaeserCipher algo = new CaeserCipher(input,shift);

        System.out.println("\nEnter Your Process:");
        System.out.println("\n1.Encryption");
        System.out.println("\n2.Decryption");
        try {
            
            int n = sc.nextInt();
            switch (n) {
                case 1:
                        System.out.println("\nThe Encrypted message is : "+algo.encryption());
                        break;
                case 2:
                        System.out.println("\nThe Decrypted message is : "+algo.decryption());
                        break;
                default:
                    System.out.println("\nInvalid Input. Please enter 1 or 2.");
            }

        } catch (InputMismatchException e) {

            System.out.println("\nInvalid Input. Please enter a number.");

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
        
    }

}