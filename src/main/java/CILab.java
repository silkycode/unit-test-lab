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
        String capitalized = myString.toUpperCase();
        if (myString == capitalized) {
            return true;
        }
        return false;
    }

}

