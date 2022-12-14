package Rekursion;

public class PalindromChecker {

    public static void main(String[] args) {

        String palindrom = "Erika feuert nur untreue Fakire";
        System.out.println(palindrom + " - ist ein Palindrom: " + check(palindrom));
    }
    public static boolean check(String palindrom){
       palindrom = palindrom.toLowerCase();
       char firstChar = palindrom.charAt(0);
       char lastChar = palindrom.charAt(palindrom.length() -1 );

       if (palindrom.length() == 1 || palindrom.length() == 0){
           return true;
       }
       if (!Character.isLetter(firstChar)){
          palindrom = palindrom.substring(1);
          return check(palindrom);
       }
       if (!Character.isLetter(lastChar)){
           palindrom = palindrom.substring(0, palindrom.length() - 1);
           return check(palindrom);
       }

        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1) ){
            palindrom = palindrom.substring(1, palindrom.length() - 1);
            return check(palindrom);
        }
        if (palindrom.charAt(0) != palindrom.charAt(palindrom.length() -1)){
            return false;
        }
        return check(palindrom);
    }
}
