package BuilderDesignPattern;

public class BuilderDesignMainClass {
    public static void main(String[] args) {
        FloodHomeBuilder floodHomeBuilder = new FloodHomeBuilder();
        EqHomeBuilder eqHomeBuilder = new EqHomeBuilder();
        Director director = new Director(floodHomeBuilder);
        Director director1 = new Director(eqHomeBuilder);
        director.manageRequiredHomeConstruction();
        Home home = director.getCompelexHomeObject();
        director1.manageRequiredHomeConstruction();
        Home home1 = director1.getCompelexHomeObject();

        System.out.println(home.floor);
        System.out.println(home1.floor);
    }
}
