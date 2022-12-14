package Uebung9Recursion;

public class PalindromChecker {
    public static void main(String[] args) {

        String text = "Erika feuert nur untreue Fakire.";
        System.out.println(check(text));

    }

    public static boolean check(String palindrom){
        palindrom = palindrom.toLowerCase();
        if (palindrom.isEmpty() || palindrom.length() == 1){
            return true;
        }

        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1)){
            String newPalindrom = palindrom.substring(1,palindrom.length()-1);
            return check(newPalindrom);
        }

        if (!Character.isLetter(palindrom.charAt(0))){
            String newPalindrom = palindrom.substring(1, palindrom.length());
            return check(newPalindrom);
        }
        if (!Character.isLetter(palindrom.charAt(palindrom.length()-1))){
            String newPalindrom = palindrom.substring(0,palindrom.length()-1);
            return check(newPalindrom);
        }

        //ist eigentlich nicht nötig
        //if (palindrom.charAt(0) != palindrom.charAt(palindrom.length()-1)){
        //    return false;
        //}
        return false;
    }
}
