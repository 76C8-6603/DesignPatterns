package abstractFactory.departmentService;

public class OracleDepartmentService implements DepartmentService{
    @Override
    public void insertDepartment() {
        System.out.println("oracle部门已插入");
    }

    @Override
    public void getDepartment() {
        System.out.println("oracle部门已获取");
    }
}
