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
}