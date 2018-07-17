package chain.oa;

/**
 * @author tianshiming
 * @date 2018/7/17 23:45
 * @description
 */
public class Request {
    private String content;
    private String type;
    private int count;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
