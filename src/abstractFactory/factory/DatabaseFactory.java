package abstractFactory.factory;

import abstractFactory.departmentService.DepartmentService;
import abstractFactory.userService.UserService;

public interface DatabaseFactory {
    DepartmentService getDepartmentService();

    UserService getUserService();
}
