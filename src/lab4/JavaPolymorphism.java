package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class JavaPolymorphism {
    public static void main(String[] args) {

        Nationality nationality  = new Nationality("Zimbabwean");
        nationality.displayInfo();

        System.out.println("Another polymorphic call");

        Nationality nationality2  = new Nationality("Australian");
        nationality2.displayInfo();

    }

}


class Professional{

    private String name;
    private String occupation;


    public Professional(){
        this.name = "Glen Chiridza";
        this.occupation = "Computer Scientist";
    }

    public void displayInfo(){
        System.out.println(" ");
        System.out.format(
                "I am %s I work as a %s" ,this.name,this.occupation
        );
    }

}
class Nationality extends Professional{
    private String myNationality;

    public Nationality(String myNationality) {
        this.myNationality = myNationality;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("I am a "+myNationality);
    }

}

