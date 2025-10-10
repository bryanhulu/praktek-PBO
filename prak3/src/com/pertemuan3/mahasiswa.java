class mahasiswa {

    String npm; 
    String NamaDepan;
    String NamaBelakang;

    mahasiswa(String npm, String NamaDepan, String NamaBelakang) {
        this.npm = npm;
        this.NamaDepan = NamaDepan;
        this.NamaBelakang = NamaBelakang;
    }


    void belajar() {
        System.out.println(this.npm + " " + this.NamaDepan + " " + this.NamaBelakang + " "  + " sedang belajar.");
    }
    void ujian() {
        System.out.println(this.npm + " " + this.NamaDepan + " " + this.NamaBelakang + " "  + " sedang belajar.");
    }
    public static void main(String[] args) {
        mahasiswa David = new mahasiswa("2109106044", "David", "Antonio");
        mahasiswa Diana = new mahasiswa("2109106044", "Diana", "Nasution");
        David.belajar();
        Diana.belajar();

        David.ujian();
        Diana.ujian();
    }
}