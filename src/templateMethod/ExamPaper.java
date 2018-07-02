package templateMethod;

/**
 * Created by tdbry on 2017/7/26.
 */
public class ExamPaper {

    public void subject1(){
        System.out.println("考试第一题：A,B,C,D");
    }
    public void subject2(){
        System.out.println("考试第二题：A,B,C,D");
    }
    public void subject3(){
        System.out.println("考试第三题：A,B,C,D");
    }
    public void answer1(String answer){
        System.out.print("第一题答案为：" + answer + "；答题者：");
    }
    public void answer2(String answer){
        System.out.print("第二题答案为：" + answer + "；答题者：");
    }
    public void answer3(String answer){
        System.out.print("第三题答案为：" + answer + "；答题者：");
    }
}
