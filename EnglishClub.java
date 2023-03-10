
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class EnglishClub
{
    //deklarasi variable english club
    protected ArrayList<Mahasiswa> _Listmahasiswa;
    protected ArrayList<Proker> _listProker;

    //construct
    public EnglishClub(ArrayList<Mahasiswa> _Listmahasiswa,ArrayList<Proker> _listProker)
    {
        this._Listmahasiswa = _Listmahasiswa;
        this._listProker = _listProker;
    }

    //void aktivitas english club
    public void LearnLanguage()
    {
        System.out.println("English Club Learning Languagge...");
    }
    public void createProker(Proker Proker)
    {
        _listProker.add(Proker);
    }
    public void DoingProker()
    {
        System.out.println("English Club is Doing Proker...");
    }
    public void Evaluation()
    {   
        int i=0;
        while(!_listProker.get(i).getstatusproker().equals("Selesai") || i >= _listProker.size())
        {
            if(_listProker.get(i).getstatusproker().equals("Selesai"))
            {
                
            }
            else
            {
                System.out.println("Not Attend the Evaluation cause Proker not finished");
            }
            
            i++;
        }
        if(i==0)
        {
            System.out.println("Evaluation....");
        }
    }

    //getter methods dari english club
    public ArrayList<Mahasiswa> getlistmahasiswa()
    {
        return this._Listmahasiswa;
    };
    public ArrayList<Proker> getlistproker()
    {
        return this._listProker;
    };
    
}