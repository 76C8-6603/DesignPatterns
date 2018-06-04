package decorate;

/**
 * Created by tdbry on 2017/8/2.
 */
public class DataInsert {
    private DataInsert insert;

    public void decorate(DataInsert insert){
        this.insert = insert;
    }

    public void operate(){
        if(this.insert == null){
            System.out.println("数据插入");
            return;
        }
        this.insert.operate();
    }

}
