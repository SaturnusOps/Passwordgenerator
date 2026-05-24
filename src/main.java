import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("How many characters would you like?:");
        int passwordlength = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Would you like Numbers? (yes/no) :");
        String numbersincluded = scanner.nextLine().toLowerCase();
        boolean useNumbers = numbersincluded.equals("yes");
        System.out.print("Would you like Special characters? (yes/no) : ");
        String specialincluded = scanner.nextLine().toLowerCase();
        boolean useSpecialcharacters = specialincluded.equals("yes");
        scanner.close();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!§$%&/()=?{[]}`*+'#-_.:;,<>|^°@€";

        String useCharacters = letters;

        if (useNumbers){
            useCharacters = useCharacters + numbers;
        }
        if (useSpecialcharacters){
            useCharacters = useCharacters + specialChars;
        }

        String[] password = new String[passwordlength];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < passwordlength; i++) {
            int randomIndex = random.nextInt(useCharacters.length());
            char randomchar = useCharacters.charAt(randomIndex);
            password[i] = String.valueOf(randomchar);
        }

        System.out.println(Arrays.toString(password));

    }
}