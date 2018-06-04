package Builder;

public class BuilderMain {
    public static void main(String[] args) {

        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();
        Director.construct(builderA);

        builderA.getResult();

        Director.construct(builderB);
        builderB.getResult();
    }
}