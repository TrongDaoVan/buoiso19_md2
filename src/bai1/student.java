package bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class student {
   private static final String ACCOUNT_REGEX = "^[C,A,P][0-9]{4}[G-M]$";

   public student(){
   }

   public boolean validate(String arr){
      Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
      Matcher matcher = pattern.matcher(arr);
      return matcher.matches();
   }

}
