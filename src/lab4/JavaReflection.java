package lab4;

import java.lang.reflect.Method;

/**
 * Created by glenc on Aug 2021
 **/
public class JavaReflection {

    public static void main(String[] args) {

        Animal anim = new Animal();
        Class obj = anim.getClass();

        Method[] methods = obj.getMethods();
        for (Method m : methods){
            System.out.println("Method name: "+m.getName());
            System.out.println("Return types: "+m.getReturnType());
            System.out.println(" ");
        }


    }
}

class Animal{
    String type = "Buffalo";

    public Animal(){
    }
    public void display(){
        System.out.println("Animal type is: "+this.type);
    }

}
