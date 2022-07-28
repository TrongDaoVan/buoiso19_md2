package thuchanh1;

public class main {
    private static EmailExample emailExample;
    public static String[] hople = {"trong@gmail.com", "Bang@gmail.com", "ly@gmail.com"};
    public static String[] khonghople = {"@gmail.com", "mai@gmail", "ly.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String gmail: hople){
            boolean check = emailExample.validate(gmail);
            System.out.println("Email: " + gmail + "Hợp lệ không: " + check);
        }

        for(String gmail: khonghople){
            boolean check = emailExample.validate(gmail);
            System.out.println("Email: " + gmail + "Hợp lệ không: " + check);
        }
    }
}
