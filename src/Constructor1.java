public class Constructor1 {

    int a = 347;
    int b = 799;

    public Constructor1() {
        System.out.println("What is the sum of a & b? ");
    }

    public static void main(String[] args) {
        Constructor1 c=new Constructor1();
        System.out.println("The answer is : " + (c.a + c.b));
    }
}
