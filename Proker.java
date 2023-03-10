
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Proker
{
    //deklarasi variable Proker
    protected String namaproker;
    protected String statusproker;

    //constructor
    public Proker(String namaproker, String statusproker)
    {
        this.namaproker = namaproker;
        this.statusproker = statusproker;
    }

    //getter 

    public String getnamaproker()
    {
        return this.namaproker;
    }
    public String getstatusproker()
    {
        return this.statusproker;
    }
}