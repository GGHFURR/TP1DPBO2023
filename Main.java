
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static void main(String [] args)
    {
        //pembuatan list buku yang dimiliki mahasiswa
        ArrayList<String> Buku = new ArrayList<>(Arrays.asList("Harry Potter","Mengapai Langit","Langit Tuhan"));


        //pembuatan data mahasiswa yang dimiliki
        Mahasiswa mhs1 = new Mahasiswa("Resyad","Laki-Laki","190001", Buku, "Asus", 0);
        Mahasiswa mhs2 = new Mahasiswa("Pahri","Laki-Laki","190002", Buku, "HP", 0);
        Mahasiswa mhs3 = new Mahasiswa("Angga","Laki-Laki","190003", Buku, "Omen", 0);
        Mahasiswa mhs4 = new Mahasiswa("Getsbi","Laki-Laki","190004", Buku, "Vivobook", 0);
        Mahasiswa mhs5 = new Mahasiswa("Mila","Perempuan","190005", Buku, "Macbook", 0);

        //memasukkan kepada list mahasiswa
        ArrayList<Mahasiswa> listmahasiswa = new ArrayList<Mahasiswa>(Arrays.asList(mhs1,mhs2,mhs3,mhs4,mhs5));

        //pembuatan data spidol yang dimiliki dosen
        ArrayList<String> Spidol = new ArrayList<>(Arrays.asList("Spidol Merah","Spidol Hitam"));
        //pembuatan data dosen
        Dosen dosen1 = new Dosen("Rose","Perempuan","2106923", Spidol, "Lenovo", listmahasiswa);

        //pembuatan data proker yang dimiliki oleh BEM/English Klub
        Proker proker1 = new Proker("Proker Membagun Negri", "Dimulai");
        Proker proker2 = new Proker("Proker Bekerja Rodi", "Selesai");
        Proker proker3 = new Proker("Pembangunan Masjid Inggris", "Selesai");
        Proker proker4 = new Proker("Bahasa Inggris Slang", "Selesai");

        //Pembuatan mahasiswa yang anggota BEM
        ArrayList<Mahasiswa> listmahasiswaBEM = new ArrayList<Mahasiswa>(Arrays.asList(mhs2));
        //masukkan proker mana saja yang dijadikan untuk bem
        ArrayList<Proker> listprokerBEM = new ArrayList<Proker>(Arrays.asList(proker1,proker2));
        //deklara English club 
        BEM BEM = new BEM(listmahasiswaBEM,listprokerBEM);
        //Pembuatan mahasiswa yang anggota english club 
        ArrayList<Mahasiswa> listmahasiswaKlub = new ArrayList<Mahasiswa>(Arrays.asList(mhs3,mhs4));
        //masukkan proker mana saja yang dijadikan untuk english club
        ArrayList<Proker> listprokerKlub = new ArrayList<Proker>(Arrays.asList(proker3,proker4));

        //deklara english club
        EnglishClub EnglishClub = new EnglishClub(listmahasiswaKlub,listprokerKlub);

        //deklar asisten dosen
        Asisten Asisten = new Asisten(mhs5,dosen1);

//================================================================= Mulai dari sini bakal pengecekan data ========================================//
        System.out.println();
        System.out.println("============== Data Mahasiswa =============="); //pertama data mahasiswa
        for (Mahasiswa Obj :listmahasiswa)
        {
            System.out.println("Nama   : " + Obj.getName());
            System.out.println("Gender : " + Obj.getGender());
            System.out.println("NIM    : " + Obj.getNIM());
            System.out.print("Buku   : ");
            int i = 0;
            for (String Obj2 : Obj.getBuku())
            {   
                if (i == 0)
                {
                    System.out.println(Obj2);
                }
                else
                {
                    System.out.println("         " + Obj2);
                }
                i++;
                
            }
            System.out.println("Laptop : " + Obj.getLaptop());
            System.out.println("+++++++++++++++++++++++++++");
        }

        System.out.println();
        System.out.println("============== Data Dosen ==============");     //kedua data dosen

        System.out.println("Nama   : " + dosen1.getName());
        System.out.println("Gender : " + dosen1.getGender());
        System.out.println("NIM    : " + dosen1.getNIP());
        System.out.print("Spidol : ");
        int i = 0;
        for (String Obj2 : dosen1.getSpidol())
        {   
            if (i == 0)
            {
                System.out.println(Obj2);
            }
            else
            {
                System.out.println("         " + Obj2);
            }
            i++;
                
        }
        System.out.println();
        System.out.println("=========== Data Anggota BEM ===========");  //Ketiga Data Anggota BEM
        for (Mahasiswa Obj : BEM.getlistmahasiswa())
        {
            System.out.println("Nama   : " + Obj.getName());
            System.out.println("Gender : " + Obj.getGender());
            System.out.println("NIM    : " + Obj.getNIM());
            System.out.println("+++++++++++++++++++++++++++");
        }
        System.out.println();
        System.out.println("======= Data Proker BEM =======");
        for (Proker Obj : BEM.getlistproker())
        {
            System.out.println("Nama   : " + Obj.getnamaproker());
            System.out.println("Gender : " + Obj.getstatusproker());
            System.out.println("+++++++++++++++++++++++++++");
        }

        System.out.println();
        System.out.println("======= Data Anggota English Club ======="); //Keempat data anggota english Club
        for (Mahasiswa Obj : EnglishClub.getlistmahasiswa())
        {
            System.out.println("Nama   : " + Obj.getName());
            System.out.println("Gender : " + Obj.getGender());
            System.out.println("NIM    : " + Obj.getNIM());
            System.out.println("+++++++++++++++++++++++++++");
        }
        System.out.println();
        System.out.println("=== Data Proker English Club ==="); 
        for (Proker Obj : EnglishClub.getlistproker())
        {
            System.out.println("Nama   : " + Obj.getnamaproker());
            System.out.println("Gender : " + Obj.getstatusproker());
            System.out.println("+++++++++++++++++++++++++++");
        }
//=========================================================== Disini Mengecek data aktivatas kelas termasuk bonus juga ==========================
        System.out.println();
        System.out.println("Tes Aktivitas Class");
        System.out.println();

        //membuat asisten mengajar
        System.out.print(Asisten.getMahasiswa().getName() + " is " );
        Asisten.Teaching();

        //membuat dosen memberi tugas
        System.out.print("MS." + dosen1.getName() + " is " );
        dosen1.giveExercise();

        //membuat BEM melakukan Proker
        BEM.DoingProker();
        //Membuat BEM melakukan evaluasi tetapi evaluation bersyarat semua proker harus selesai 
        BEM.Evaluation();

        //begitu juga dengan english club
        EnglishClub.DoingProker();
        EnglishClub.Evaluation();


//=========================================== Disini Membuat Dosen memberi Nilai kepada Seluruh Mahasiswa nya =============================
        System.out.println();

        System.out.println("Pemberian Nilai Pada Mahasiswa");
        System.out.println();

        //membuat list nilai untuk di masukkan
        ArrayList<Integer> listnilai= new ArrayList<Integer>(Arrays.asList(70,80,90,100,75));
        dosen1.giveMark(listmahasiswa,listnilai);

        //mengecek data apa sudah ada nilai atau belum, jika belum menghasilkan 0
        for (Mahasiswa Obj :listmahasiswa)
        {
            System.out.println("Nama   : " + Obj.getName());
            System.out.println("Gender : " + Obj.getGender());
            System.out.println("NIM    : " + Obj.getNIM());
            System.out.println("NILai  : " + Obj.getNilai());
            System.out.println("+++++++++++++++++++++++++++");
        }

    }
}