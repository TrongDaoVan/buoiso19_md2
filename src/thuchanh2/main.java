package thuchanh2;

public class main {
    private static AccountExample accountExample;

    public static final String[] hople = {"1234567", "avfd123_", "fkej_____", "________"};
    public static final String[] khonghople = {"123", "ABCĐ123_", "**_____", ".___"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for(String xem: hople){
            boolean check = accountExample.validate(xem);
            System.out.println(xem + "Có hợp lệ không: " + check);
        }

        for(String xem: khonghople) {
            boolean check = accountExample.validate(xem);
            System.out.println(xem + "Có hợp lệ không: " + check);
        }
    }
}
