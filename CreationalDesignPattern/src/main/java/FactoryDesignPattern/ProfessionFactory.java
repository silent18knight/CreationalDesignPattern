package FactoryDesignPattern;

public class ProfessionFactory {

    public Profession getProfession(String str) {
        if(str == null){
            return null;
        } else if(str.equalsIgnoreCase("Teacher")){
            return new Teacher();
        } else if(str.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if(str.equalsIgnoreCase("Student")) {
            return new Student();
        }
        return null;
    }
}
