package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class JavaPolymorphism {
    public static void main(String[] args) {

        Nationality nationality  = new Nationality("Zimbabwean");
        nationality.displayInfo("GLEN CHIRIDZA","COMPUTER SCIENTIST");

        System.out.println("Another polymorphic call");

        Nationality nationality2  = new Nationality("Australian");
        nationality2.displayInfo("CLIVE CHIRIDZA","BIOCHEMIST");

    }

}


class Professional{

    public Professional(){
    }

    public void displayInfo(String name,String occupation){

        System.out.println(" ");
        System.out.format(
                "I am %s I work as a %s" ,name,occupation
        );
    }

}
class Nationality extends Professional{
    private String myNationality;

    public Nationality(String myNationality) {
        this.myNationality = myNationality;
    }

    @Override
    public void displayInfo(String name,String occupation){
        super.displayInfo(name,occupation);
        System.out.println("I am a "+myNationality);
    }

}

