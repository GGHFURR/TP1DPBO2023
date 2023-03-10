
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;



class Human 
{
    //deklarasi variables human
    protected String name;
    protected String gender;

    //constructor 
    public Human(String name, String gender)
    {
        this.name = name;
        this.gender = gender;
    }

    //void aktivitas Human
    public void eat()
    {
        System.out.println("Is eating...");
    }
    public void drink()
    {
        System.out.println("Is drinking...");
    }
    public void sleep()
    {
        System.out.println("Sleeping...");
    }

    //getter methods and setter methods

    public String getName()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
}