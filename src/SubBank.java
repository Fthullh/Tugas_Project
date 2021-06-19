import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class SubBank extends Bank{
    Date tanggal;
    int biayatf;
    int jumlahtf;

    void dataBank(){
        String[] namabank = {"BNI","BRI","BCA","MEGA","MANDIRI","DANAMON","MUAMALAT"};
        String[] kodebank = {"009","002","014","426","008","011","147"};
        System.out.println("Daftar Nama Bank dan Kode nya");
        System.out.println("-----------------------------");
        System.out.println(" | Bank " + namabank[0] + "\t\t:Kode " + kodebank[0] + " |");
        System.out.println(" | Bank " + namabank[1] + "\t\t:Kode " + kodebank[1] + " |");
        System.out.println(" | Bank " + namabank[2] + "\t\t:Kode " + kodebank[2] + " |");
        System.out.println(" | Bank " + namabank[3] + "\t:Kode " + kodebank[3] + " |");
        System.out.println(" | Bank " + namabank[4] + "\t:Kode " + kodebank[4] + " |");
        System.out.println(" | Bank " + namabank[5] + "\t:Kode " + kodebank[5] + " |");
        System.out.println(" | Bank " + namabank[6] + ":Kode " + kodebank[6] + " |");
        System.out.println();
    }

    void transfer(){
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        System.out.printf("Pada hari ini "+tanggal+", "+name+" melakukan transfer ke rekening BRI, sebesar : %s %n" , kurensiIndonesia.format(jumlahtf) + ", dikenakan biaya " +biayatf);
        saldo = saldo - jumlahtf - biayatf;
        System.out.printf("Sisa saldo "+name+" sebesar : %s %n", kurensiIndonesia.format(saldo));
        System.out.println();
    }
}

