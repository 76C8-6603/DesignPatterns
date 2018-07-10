package composite.company;

/**
 * @author tianshiming
 * @date 2018/7/10 23:28
 * @description
 */
public class FinaceDepartment extends Company {
    public FinaceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(Company parent) {
        System.out.println(parent.name + "--" + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "$执行财政管理任务");
    }
}
