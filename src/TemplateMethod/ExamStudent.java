package TemplateMethod;

/**
 * Created by tdbry on 2017/7/26.
 */
public class ExamStudent extends ExamPaper implements Cloneable{
    private String stuName;
    public ExamStudent(String stuName){
        this.stuName = stuName;
        subject1();
        subject2();
        subject3();
    }
    @Override
    public void answer1(String answer) {
        super.answer1(answer);
        System.out.print(stuName + "\n");
    }

    @Override
    public void answer2(String answer) {
        super.answer2(answer);
        System.out.print(stuName + "\n");
    }

    @Override
    public void answer3(String answer) {
        super.answer3(answer);
        System.out.print(stuName + "\n");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
