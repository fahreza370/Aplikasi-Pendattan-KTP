
import java.util.Scanner;
public class Rs {
    String namaDE;
    Scanner str=new Scanner(System.in);
    public Scanner in=new Scanner(System.in);
    public void setNamaRs(){
        System.out.print("Masukkan Nama Provinsi: ");
        this.namaDE=str.nextLine();
    }
    public static void main(String[] args) {
        int menu=0,a,z=0,ktp;
        Rs era=new Rs();
        Dataktp[] p=new Dataktp[1024];
        while(menu!=4){
            System.out.print("");
            System.out.println("=========================");
            System.out.println("|          MENU         |");
            System.out.println("=========================");
            System.out.println("|1.INPUT DATA           |");
            System.out.println("|2.UPADATE DATA         |");
            System.out.println("|3.VIEW                 |");
            System.out.println("|4.EXIT                 |");
            System.out.println("=========================");
            System.out.println("Pilihan :");
            menu=era.in.nextInt();
            if(menu==1){
                z++;
                p[z]=new Dataktp();
                p[z].setData();

            }
            else if(menu==2){
                if(z<1)
                    System.out.println("data kosong");
                else{
                    System.out.print("masukkan ktp yang akan di edit : ");
                    ktp=era.in.nextInt();
                    a=0;
                    while(a<z){
                        a++;
                        if(ktp==p[a].getKtp())
                            break;
                    }
                    if(a<=z){
                        p[a].tampil();
                        p[a].setData();
                    }else
                        System.out.println("data tidak ditemukan");
                }
            }
            else if(menu==3){
                if(z<1)
                    System.out.println("data kosong");
                else{
                    a=0;
                    while(a<z){
                        a++;
                        System.out.println("==========="+a+"============");
                        p[a].tampil();
                    }
                }
            }
            else if(menu==4)
                System.out.println("keluar...");
            else
                System.out.println("menu ilegal");
        }
    }
}

