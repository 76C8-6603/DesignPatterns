package ProtoType;

/**
 * Created by tdbry on 2017/7/25.
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExp;

    public Resume(String name){
        this.name = name;
        workExp = new WorkExperience();
    }

    private Resume(WorkExperience workExp) throws CloneNotSupportedException {
        this.workExp = (WorkExperience) workExp.clone();
    }

    public void setPersonalMsg(String sex,String age){
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExp(String companyName,String workYear){
        workExp.setCompanyName(companyName);
        workExp.setWorkYear(workYear);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExp);
        resume.setPersonalMsg(this.sex,this.age);
        resume.setWorkExp(this.workExp.getCompanyName(),this.workExp.getWorkYear());
        return resume;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", workExp=" + workExp.toString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
