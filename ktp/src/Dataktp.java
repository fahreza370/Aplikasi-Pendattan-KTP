class Dataktp extends Rs{
    String nama,jk,Warga,tgl,goldar,alamat,RT,kec,lurah,kerja,agama,kawin;
    int ktp;
    public void setData(){
        this.setNamaRs();
        System.out.print("Masukkan Nomer KTP    : ");
        this.ktp=in.nextInt();
        System.out.print("Masukkan Nama         : ");
        this.nama=str.nextLine();
        System.out.print("Tempat/tgl/lahir      : ");
        this.tgl=str.nextLine();
        System.out.print("Golongan darah        : ");
        this.goldar=str.nextLine();
        System.out.print("Jenis Kelamin         : ");
        this.jk=str.nextLine();
        System.out.print("RT/RW                 : ");
        this.RT=str.nextLine();
        System.out.print("Kel/Desa              : ");
        this.lurah=str.nextLine();
        System.out.print("Kecamatan             : ");
        this.kec=str.nextLine();
        System.out.print("Alamat                : ");
        this.alamat=str.nextLine();
        System.out.print("Agama                 : ");
        this.agama=str.nextLine();
        System.out.print("Status Perkawinan     : ");
        this.kawin=str.nextLine();
        System.out.print("Pekerjaan             : ");
        this.kerja=str.nextLine();
        System.out.print("Kewarganegaraan       : ");
        this.Warga=str.nextLine();

    }
    public int getKtp(){
        return this.ktp;
    }
    public void tampil(){
        System.out.println(                    this.namaDE);
        System.out.println("========================================================");
        System.out.println("NIK                  : "+this.ktp);
        System.out.println("Nama                 : "+this.nama);
        System.out.println("Tempat/Tanggal/lahir : "+this.tgl);
        System.out.println("Jenis Kelamin        : "+this.jk+"          Gol Darah"+this.goldar);
        System.out.println("Alamat               : "+this.alamat);
        System.out.println("     RT/RW           : "+this.RT);
        System.out.println("     Kel/Desa        : "+this.lurah);
        System.out.println("     Kecamatan       : "+this.kec);
        System.out.println("Agama                : "+this.agama);
        System.out.println("Status Perkawinan    : "+this.alamat);
        System.out.println("Pekerjaan            : "+this.kerja);
        System.out.println("Kewarganegaraan      : "+this.alamat);
        System.out.println("Berlaku Hingga       : SEUMUR HIDUP");
    }
}