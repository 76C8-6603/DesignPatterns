package protoType;

/**
 * Created by tdbry on 2017/7/25.
 */
public class ProtoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume r1 = new Resume("詹姆");
        r1.setWorkExp("凯岩城","20");
        r1.setPersonalMsg("男","20");
        Resume r2 = (Resume)r1.clone();
        r2.setName("琼恩");
        r2.setWorkExp("临冬城","15");
        r2.setPersonalMsg("男","15");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
