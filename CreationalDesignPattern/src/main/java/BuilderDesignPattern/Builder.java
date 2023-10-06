package BuilderDesignPattern;

public interface Builder {

    public void createFloor();
    public void createWalls();
    public void createTerrace();

    public Home getComplexHomeObject();
}
