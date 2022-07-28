package bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private static final String ACCOUNT_REGEX = "^[0-9]{2}-[0][0-9]{9}";

    public Phone(){
    }

    public boolean validate(String arr){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(arr);
        return matcher.matches();
    }
}
