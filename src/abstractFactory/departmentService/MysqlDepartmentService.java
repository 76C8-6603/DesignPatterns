package abstractFactory.departmentService;

public class MysqlDepartmentService implements DepartmentService{
    @Override
    public void insertDepartment() {
        System.out.println("mysql部门已插入");
    }

    @Override
    public void getDepartment() {
        System.out.println("mysql部门已获取");
    }
}
