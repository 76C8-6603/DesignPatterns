package Observer;

/**
 * @author tianshiming
 * @description
 * @date 2018/6/4 22:25
 */
public class GodOfWarObserver {
    public void boy() {
        System.out.printf("Boy!Follow me!\n");
    }

    public void boy(String msg) {
        System.out.printf(msg+"\n");
    }
}
