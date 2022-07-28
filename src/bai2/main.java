package bai2;

public class main {
    private static Phone phone = new Phone();
    private static final String[] dung = {"84-0324564346", "72-0346354674","49-0398299898"};
    private static final String[] sai = {"84d-0324564346", "72-0đ346354674","49-93982998987"};

    public static void main(String[] args) {
        phone = new Phone();
        for (String sdt: dung){
            boolean check = phone.validate(sdt);
            System.out.println(sdt + " Có hợp lệ không: " + check);
        }
        for (String sdt: sai){
            boolean check = phone.validate(sdt);
            System.out.println(sdt + " Có hợp lệ không: " + check);
        }
    }
}
