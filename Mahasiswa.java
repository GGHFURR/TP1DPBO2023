
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Mahasiswa extends Human
{
    //deklarasi variabel human
    protected String NIM;
    protected ArrayList<String> Buku;
    protected String Laptop;
    protected int Nilai;

    //constructor
    public Mahasiswa(String name, String gender,String NIM,ArrayList<String> Buku, String Laptop,int Nilai)
    {
        super(name,gender);
        this.NIM = NIM;
        this.Buku = Buku;
        this.Laptop = Laptop;
        this.Nilai = Nilai;
    }

    //getter and setter method

    public String getNIM()
    {
        return this.NIM;
    }

    public ArrayList<String> getBuku()
    {
        return this.Buku;
    }

    public String getLaptop()
    {
        return this.Laptop;
    }
    public void setNilai(int Nilai)
    {
        this.Nilai = Nilai;
    }
    public int getNilai()
    {
        return this.Nilai;
    }
    
}