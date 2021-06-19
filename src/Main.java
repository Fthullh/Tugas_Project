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

        //Constructor 1
        Bank c1_obj1 = new Bank("Nur Nela","630315261200****","Teluk Selong","083150060942","BNI 2612200011",10000000,1750000,800000);
        c1_obj1.tampilData();
        c1_obj1.cekSaldo();
        c1_obj1.setorTunai();
        c1_obj1.tarikTunai();

        Bank c1_obj2 = new Bank("Lulu","630314120499****","Sekumpul","087817015269","BRI 402801020419532",20000000,15000000,200000);
        c1_obj2.tampilData();
        c1_obj2.cekSaldo();
        c1_obj2.setorTunai();
        c1_obj2.tarikTunai();

        //Constructor 2
        Bank c2_obj1 = new Bank("Irwin","630315121299****","Kamasan","087771846312","BRI 453501025686533",13000000);
        c2_obj1.tampilData();
        c2_obj1.cekSaldo();

        Bank c2_obj2 = new Bank("Jannah","630315130504****","Dalam Pagar Ulu","0895627039069","BCA 5220304312",7000000);
        c2_obj2.tampilData();
        c2_obj2.cekSaldo();

        //Constructor 3
        Bank c3_obj1 = new Bank("Khadijah","630312300899****","Tanjung Rema","082150044855","Mandiri 0700000899992");
        c3_obj1.tampilData();

        Bank c3_obj2 = new Bank("Fahmi","630315070995****","Pekauman","085748274450","Danamon 003621762362");
        c3_obj2.tampilData();
    }
}
