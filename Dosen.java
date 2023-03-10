
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Dosen extends Human
{
    //deklarasi Dosen
    protected String NIP;
    protected ArrayList<String> Spidol;
    protected String Laptop;
    protected ArrayList<Mahasiswa> Mahasiswa;

    //constructor
    public Dosen(String name, String gender,String NIP, ArrayList<String> Spidol, String Laptop,ArrayList<Mahasiswa> Mahasiswa)
    {
        super(name,gender);
        this.NIP = NIP;
        this.Spidol = Spidol;
        this.Laptop = Laptop;
        this.Mahasiswa = Mahasiswa;
    }
    
    //void aktivitas dosen
    public void giveMark(ArrayList<Mahasiswa> Mahasiswa,ArrayList<Integer> nilai)
    {
        for (int i=0;i<Mahasiswa.size();i++)
        {
            Mahasiswa.get(i).setNilai(nilai.get(i));
        }
    }
    void giveExercise()
    {
        System.out.println("Given Exercise...");
    }
    void Teaching()
    {
        System.out.println("Teaching...");
    }


    //getter and setter methods
    public String getNIP()
    {
        return this.NIP;
    }

    public ArrayList<String> getSpidol()
    {
        return this.Spidol;
    }

    public String getLaptop()
    {
        return this.Laptop;
    }

}