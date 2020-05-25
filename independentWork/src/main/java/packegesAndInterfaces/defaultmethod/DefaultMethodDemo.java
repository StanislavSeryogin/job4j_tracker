package packegesAndInterfaces.defaultmethod;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        int uID = MyIF.getUniversalID();

        System.out.println("ID user: " + obj.getUserID());
        System.out.println("ID admin: " + obj.getAdminID());
        System.out.println("ID universal: " + uID);
    }
}
