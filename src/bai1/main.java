package bai1;

public class main {
    private static student student1 = new student();
    private static String[] dung = {"C0123M", "A9999K", "P8888H"};
    private static String[] sai = {"C012M", "Dqq123K", "A66668888H", "A9999GH"};

    public static void main(String[] args) {
        student1 = new student();
        for(String ten: dung){
            boolean check = student1.validate(ten);
            System.out.println(ten + " Có hợp lệ không: " + check);
        }

        for(String ten: sai){
            boolean check = student1.validate(ten);
            System.out.println(ten + " Có hợp lệ không: " + check);
        }
    }
}
