package abstractFactory;

import abstractFactory.departmentService.DepartmentService;
import abstractFactory.factory.DatabaseFactory;
import abstractFactory.factory.MysqlFactory;
import abstractFactory.userService.UserService;

public class abstractFactoryMain {
    public static void main(String[] args) {
        DatabaseFactory factory = new MysqlFactory();
        DepartmentService departmentService = factory.getDepartmentService();
        UserService userService = factory.getUserService();
        departmentService.insertDepartment();
        userService.getUser();
    }
}
