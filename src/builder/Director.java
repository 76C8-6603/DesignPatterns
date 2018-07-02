package builder;

public class Director {
    public static void  construct(Builder builder){
        builder.buildePartA();
        builder.buildePartB();
    }
}
