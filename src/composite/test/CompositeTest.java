package composite.test;

import composite.company.ConcreteCompany;
import composite.company.FinaceDepartment;
import composite.company.HRDepartment;
import composite.model.Composite;
import composite.model.Leaf;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/4 16:28
 * @description
 */
public class CompositeTest {

    @Test
    public void modelTest() {
        Composite root = new Composite("root");
        root.add(new Leaf("rootA"));
        root.add(new Leaf("rootB"));

        Composite childX = new Composite("x");
        childX.add(new Leaf("xa"));
        childX.add(new Leaf("xb"));

        root.add(childX);

        Leaf temporary = new Leaf("temporary");
        root.add(temporary);
        root.remove(temporary);

        root.show("");
    }

    @Test
    public void companyTest() {
        ConcreteCompany mainCompany = new ConcreteCompany("北京总公司");
        mainCompany.add(new HRDepartment("北京人事部"));
        mainCompany.add(new FinaceDepartment("北京财政部"));

        ConcreteCompany shanghaiCompany = new ConcreteCompany("上海分公司");
        shanghaiCompany.add(new HRDepartment("上海人事部"));
        shanghaiCompany.add(new FinaceDepartment("上海财政部"));

        ConcreteCompany pudongCompany = new ConcreteCompany("浦东分公司");
        pudongCompany.add(new HRDepartment("浦东人事部"));
        pudongCompany.add(new FinaceDepartment("浦东财政部"));

        shanghaiCompany.add(pudongCompany);
        mainCompany.add(shanghaiCompany);

        mainCompany.display(null);
        mainCompany.lineOfDuty();
    }
}