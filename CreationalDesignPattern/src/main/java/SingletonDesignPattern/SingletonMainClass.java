package SingletonDesignPattern;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.simpleMethod();

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.simpleMethod();
    }
}
