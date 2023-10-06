package AbstractFactoryDesign;

public class AbstractFactoryMainClass {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);

        Profession profession = abstractFactory.getProfession("Teacher");
        profession.print();
    }
}
