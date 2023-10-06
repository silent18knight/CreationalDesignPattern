package BuilderDesignPattern;

public class EqHomeBuilder implements Builder{
    Home eqHome = new Home();
    @Override
    public void createFloor() {
        this.eqHome.floor = "Wooden Floor";
    }

    @Override
    public void createWalls() {
        this.eqHome.walls = "wooden Walls";

    }

    @Override
    public void createTerrace() {
        this.eqHome.terrace = "wooden Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.eqHome;
    }
}
