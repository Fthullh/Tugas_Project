import java.text.NumberFormat;
import java.util.Locale;

public class Bank {
    String name;
    String nik;
    String alamat;
    String telp;
    String rek;
    int saldo;
    int setor;
    int tarik;

    public Bank() {
    }

    public Bank(String name, String nik, String alamat, String telp, String rek, int saldo, int setor, int tarik) {
        System.out.println("~~~~~~~~~~~~ Constructor 1 ~~~~~~~~~~~");
        this.name = name;
        this.nik = nik;
        this.alamat = alamat;
        this.telp = telp;
        this.rek = rek;
        this.saldo = saldo;
        this.setor = setor;
        this.tarik = tarik;
    }

    public Bank(String name, String nik, String alamat, String telp, String rek, int saldo) {
        System.out.println("~~~~~~~~~~~~ Constructor 2 ~~~~~~~~~~~");
        this.name = name;
        this.nik = nik;
        this.alamat = alamat;
        this.telp = telp;
        this.rek = rek;
        this.saldo = saldo;
    }

    public Bank(String name, String nik, String alamat, String telp, String rek) {
        System.out.println("~~~~~~~~~~~~ Constructor 3 ~~~~~~~~~~~");
        this.name = name;
        this.nik = nik;
        this.alamat = alamat;
        this.telp = telp;
        this.rek = rek;
    }

    void tampilData(){
        System.out.println("Nama\t\t\t:" + this.name);
        System.out.println("NIK\t\t\t\t:" + this.nik);
        System.out.println("Alamat\t\t\t:" + this.alamat);
        System.out.println("Telepon\t\t\t:" + this.telp);
        System.out.println("Rekening\t\t:" + this.rek);
        System.out.println();
    }

    void cekSaldo(){
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        System.out.printf("Saldo awal " +name+ " sebesar : %s %n", kurensiIndonesia.format(saldo));
        System.out.println();
    }

    void setorTunai(){
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        System.out.printf(name+ " menyetorkan uang sebesar : %s %n", kurensiIndonesia.format(setor));
        saldo = saldo + setor;
        System.out.printf("Total saldo "+name+" sebesar : %s %n", kurensiIndonesia.format(saldo));
        System.out.println();
    }

    void tarikTunai(){
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        System.out.printf(name+" menarik uang sebesar : %s %n", kurensiIndonesia.format(tarik));
        saldo = saldo - tarik;
        System.out.printf("Total saldo "+name+" sebesar : %s %n", kurensiIndonesia.format(saldo));
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getRek() {
        return rek;
    }

    public void setRek(String rek) {
        this.rek = rek;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public int getTarik() {
        return tarik;
    }

    public void setTarik(int tarik) {
        this.tarik = tarik;
    }
}