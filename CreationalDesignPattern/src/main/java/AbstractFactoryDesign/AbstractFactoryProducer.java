package AbstractFactoryDesign;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(Boolean isTrainee){
        if(isTrainee) {
            return new TraineeProfessionFactory();
        } else {
            return new ProfessionFactory();
        }
    }
}
