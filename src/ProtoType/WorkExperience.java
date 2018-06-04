package ProtoType;

/**
 * Created by tdbry on 2017/7/25.
 */
public class WorkExperience implements Cloneable{
    private String companyName;
    private String workYear;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "companyName='" + companyName + '\'' +
                ", workYear='" + workYear + '\'' +
                '}';
    }
}
