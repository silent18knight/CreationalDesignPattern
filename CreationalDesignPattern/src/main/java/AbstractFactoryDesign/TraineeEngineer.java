package AbstractFactoryDesign;

import FactoryDesignPattern.Profession;

public class TraineeEngineer implements Profession {

    @Override
    public void print() {
        System.out.println("In the Trainee Engineer Class");
    }
}
