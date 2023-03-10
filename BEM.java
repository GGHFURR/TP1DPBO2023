
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class BEM
{   
    //deklarasi variabel BEM
    protected ArrayList<Mahasiswa> _Listmahasiswa;
    protected ArrayList<Proker> _listProker;


    //constructor
    public BEM(ArrayList<Mahasiswa> _Listmahasiswa,ArrayList<Proker> _listProker)
    {
        this._Listmahasiswa = _Listmahasiswa;
        this._listProker = _listProker;
    }

    //void aktivitas BEM
    public void createProker(Proker Proker)
    {
        _listProker.add(Proker);
    }
    public void DoingProker()
    {
        System.out.println("BEM is Doing Proker...");
    }
    public void Evaluation()
    {   
        int i=0;
        while(!_listProker.get(i).getstatusproker().equals("Selesai") || i >= _listProker.size())
        {
            if(_listProker.get(i).getstatusproker().equals("Selesai"))
            {
                System.out.println("Evaluation....");
            }
            else
            {
                System.out.println("Not Attend the Evaluation cause Proker not finished");
            }
            
            i++;
        }
    }

    //getter for BEM
    public ArrayList<Mahasiswa> getlistmahasiswa()
    {
        return this._Listmahasiswa;
    };
    public ArrayList<Proker> getlistproker()
    {
        return this._listProker;
    };
    
}