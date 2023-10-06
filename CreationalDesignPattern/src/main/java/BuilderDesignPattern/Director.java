package BuilderDesignPattern;

public class Director {
    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Home getCompelexHomeObject(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction(){
        this.builder.createFloor();
        this.builder.createTerrace();
        this.builder.createWalls();
    }
}
