import java.util.regex.Pattern;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        // Examine string for totality of uppercase or lowercase characters, then examine for first uppercase character and remaining lowercase substring
        // Assumed that only Strings containing only letters can be examined for case booleans
        if (!Pattern.matches("^[a-zA-Z]+$", myString)) {
            return false;
        } else if (myString.equals(myString.toUpperCase()) || myString.equals(myString.toLowerCase())) {
            return true;
        } else {
            return Character.isUpperCase(myString.charAt(0)) && myString.substring(1).equals(myString.substring(1).toLowerCase());
        }
    }
}

