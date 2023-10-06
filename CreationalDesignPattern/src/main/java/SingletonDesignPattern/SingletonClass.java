package SingletonDesignPattern;

public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance(){
        return singletonClass;
    }
     public void simpleMethod(){
        System.out.println("Hashcode of the object" + singletonClass);
     }
}
