package abstractFactory.userService;

public class OracleUserService implements  UserService {
    @Override
    public void insertUser() {
        System.out.println("oracle用户已插入");
    }

    @Override
    public void getUser() {
        System.out.println("oracle用户已获取");
    }
}
