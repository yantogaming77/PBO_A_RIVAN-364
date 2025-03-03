import java.util.Scanner; //mengimpor kelas scanner
public class Main //awalan dlm java
{
    public static void main(String[] args) //titik masuk awal di java
    {
        Scanner sc = new Scanner(System.in); //membuat variabel scanner

        System.out.println("Pilih login");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt(); //membaca input pengguna
        sc.nextLine(); //scanner untuk pilihan 1/2

       if (pilihan == 1 ){ //ketika pengguna pilih nomer 1
           System.out.print("Masukkan Username Admin : ");
           String user = sc.nextLine();
           System.out.print("Masukkan Password Admin : ");
           String pass = sc.nextLine();

           String validuser = "admin10";// username yang benar dalam bentuk string
           String validpass = "admin123";

           if (user.equals(validuser)&&pass.equals(validpass)) //apabila username & pass sesuai dengan validuss&pass maka login berhasil
           {
               System.out.println("Login berhasil");
           }
           else {
               System.out.print("Login gagal username atau password salah");//ketika validpass & uss maka gagal
           }
       } else if (pilihan == 2 ) { //untuk pilihan 2
           System.out.print("Masukkan nama : ");
           String name = sc.nextLine(); //menyimpan nilai nama di daialm string
           System.out.print("Masukkan NIM : ");
           String NIM = sc.nextLine();

           String validname = ("Zinedine Rivan");
           String validNIM = ("364");
           if (name.equals(validname) && NIM.equals(validNIM))//jika nama dan nim benar
           {
               System.out.print("Login mahasiswa berhasil");
               System.out.print("Nama : " + name);
               System.out.print("NIM : " + NIM);
           } else {
               System.out.print("Login gagal nama atau NIM salah"); // ketika salah
           }
       } else {
           System.out.print("Pilihan tidak ada."); //ketika pilihan yang dimasukkan tidak sesuai
       }

         sc.close(); //penutup scanner
    }
}