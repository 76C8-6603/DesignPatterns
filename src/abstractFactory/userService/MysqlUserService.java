package abstractFactory.userService;

public class MysqlUserService implements UserService {
    @Override
    public void insertUser() {
        System.out.println("mysql用户已插入");
    }

    @Override
    public void getUser() {
        System.out.println("mysql用户已获取");
    }
}
