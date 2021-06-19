import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank nasabah1 = new Bank();
        nasabah1.name = "Fathulloh";
        nasabah1.nik = "630315260999****";
        nasabah1.alamat = "Martapura";
        nasabah1.telp = "082255538868";
        nasabah1.rek = "BNI 2699969995";
        nasabah1.saldo = 100000000;
        nasabah1.setor = 25000000;
        nasabah1.tarik = 100000;

        SubBank tf1 = new SubBank();
        tf1.name = "Fathulloh";
        tf1.tanggal = new Date();
        tf1.saldo = 100000000;
        tf1.jumlahtf = 300000;
        tf1.biayatf = 6500;

        nasabah1.tampilData();
        nasabah1.cekSaldo();
        nasabah1.setorTunai();
        nasabah1.tarikTunai();
        tf1.dataBank();
        tf1.transfer();
    }
}
