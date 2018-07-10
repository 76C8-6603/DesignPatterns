package composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianshiming
 * @date 2018/7/10 23:27
 * @description
 */
public class ConcreteCompany extends Company {
    private List<Company> companies;
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        if (companies == null) {
            companies = new ArrayList<>();
        }
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        if (companies == null) {
            return;
        }
        companies.remove(company);
    }

    @Override
    public void display(Company parent) {
        System.out.println(parent == null ? "" : parent.name + "--" + name);
        for (Company company : companies) {
            company.display(this);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : companies) {
            company.lineOfDuty();
        }
    }
}
