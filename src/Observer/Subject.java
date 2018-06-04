package Observer;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public interface Subject {
    public void notifyObservers() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public String getSubjectState();
    public void setSubjectState(String subjectState);
}
