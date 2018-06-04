package abstractFactory.factory;

import abstractFactory.departmentService.DepartmentService;
import abstractFactory.departmentService.MysqlDepartmentService;
import abstractFactory.userService.MysqlUserService;
import abstractFactory.userService.UserService;

public class MysqlFactory implements DatabaseFactory {
    @Override
    public DepartmentService getDepartmentService() {
        return new MysqlDepartmentService();
    }

    @Override
    public UserService getUserService() {
        return new MysqlUserService();
    }
}
