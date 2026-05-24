import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("How many characters would you like?:");
        int passwordlength = scanner.nextInt();
        System.out.print("Would you like Numbers? (yes/no) :");
        boolean useNumbers = false;
        String numbersincluded = scanner.nextLine.toLowerCase;
        if (numbersincluded.equals("yes")) {
            useNumbers = true;
        } else {
            useNumbers = false;
        }
        System.out.print("Would you like Special characters? (yes/no) : ");
        boolean useSpecialcharacters
        String specialincluded = scanner.nextBoolean.toLowerCase;
        if (specialincluded.equals("yes")) {
            useSpecialcharacters = true;
        } else {
            useSpecialcharacters = false;
        }
        scanner.close;

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[{]};:", "<>?";

        if (useSpecialcharacters && useNumbers){
            String useCharacters = letters + numbers + specialChars
            SecureRamdom ramdom = new SecureRandom(passwordlength);
        }

        } else if (useNumbers) {
        String useCharacters = letters + numbers
        SecureRamdom ramdom = new SecureRandom(passwordlength);
        }else {
        String useCharacters = letters
        SecureRamdom ramdom = new SecureRandom(passwordlength);
    }

    }
}