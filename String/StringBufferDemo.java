package String;

public class StringBufferDemo {
    public static void main(String args[])
{
    StringBuffer s1 = new StringBuffer();
    StringBuffer s2 = new StringBuffer(20);
    StringBuffer s3 = new StringBuffer("StringBuffer");
    System.out.println("s3 = " + s3);
    System.out.println(s2.length()); //chứa 0
    System.out.println(s3.length()); //chứa 12
    System.out.println(s1.capacity()); //chứa 16
    System.out.println(s2.capacity()); //chứa 20
    System.out.println(s3.capacity()); //chứa 28
    }
}
