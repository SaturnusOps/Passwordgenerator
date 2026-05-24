import java.security.SecureRandom;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("How many characters would you like?:");
        int passwordlength = scanner.nextInt();
        System.out.print("Would you like Numbers? (yes/no) :");
        boolean useNumbers = false;
        String numbersincluded = scanner.nextLine().toLowerCase();
        if (numbersincluded.equals("yes")) {
            useNumbers = true;
        } else {
            useNumbers = false;
        }
        System.out.print("Would you like Special characters? (yes/no) : ");
        boolean useSpecialcharacters;
        String specialincluded = scanner.nextLine().toLowerCase();
        if (specialincluded.equals("yes")) {
            useSpecialcharacters = true;
        } else {
            useSpecialcharacters = false;
        }
        scanner.close();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!§$%&/()=?{[]}`*+'#-_.:;,<>|^°@€";

        if (useSpecialcharacters && useNumbers){
            String useCharacters = letters + numbers + specialChars;
            String[] password = new String[passwordlength];
            SecureRandom random = new SecureRandom();
            for (int i = 0; i < passwordlength; i++){
                int randomIndex = random.nextInt(useCharacters.length());
                char randomchar = useCharacters.charAt(randomIndex);
                password[i] = String.valueOf(randomchar);
            }
            System.out.println(java.util.Arrays.toString(password));
        }
    }
}