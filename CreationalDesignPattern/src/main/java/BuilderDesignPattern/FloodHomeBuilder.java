package BuilderDesignPattern;

public class FloodHomeBuilder implements Builder{

    Home floodHome = new Home();
    @Override
    public void createFloor() {
        this.floodHome.floor = "10 feet above Floor";
    }

    @Override
    public void createWalls() {
        this.floodHome.walls = "water proof Walls";

    }

    @Override
    public void createTerrace() {
        this.floodHome.terrace = "waterproof Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodHome;
    }
}
