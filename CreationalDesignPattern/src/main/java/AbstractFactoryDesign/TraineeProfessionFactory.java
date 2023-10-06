package AbstractFactoryDesign;

public class TraineeProfessionFactory extends AbstractFactory {

    public Profession getProfession(String str) {
        if(str == null){
            return null;
        } else if(str.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();
        } else if(str.equalsIgnoreCase("Engineer")) {
            return new TraineeTeacher();
        }
        return null;
    }

}
