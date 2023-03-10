
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


class Asisten
{
    //deklarasi variable asisten
    protected Mahasiswa Mahasiswa;
    protected Dosen Dosen;

    //constructor
    public Asisten(Mahasiswa Mahasiswa,Dosen Dosen)
    {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
    }

    //void aktivitas asisten
    void giveExercise()
    {
        System.out.println("Given Exercise...");
    }
    void Teaching()
    {
        System.out.println("Teaching...");
    }
    
    //getter and setter

    public Mahasiswa getMahasiswa()
    {
        return this.Mahasiswa;
    }
    public Dosen getDosen()
    {
        return this.Dosen;
    }


}