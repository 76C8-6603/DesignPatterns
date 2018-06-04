package abstractFactory.factory;

import abstractFactory.departmentService.DepartmentService;
import abstractFactory.departmentService.OracleDepartmentService;
import abstractFactory.userService.MysqlUserService;
import abstractFactory.userService.UserService;

public class OracleFactory implements DatabaseFactory {
    @Override
    public DepartmentService getDepartmentService() {
        return new OracleDepartmentService();
    }

    @Override
    public UserService getUserService() {
        return new MysqlUserService();
    }
}
