package Gun33.EnumEk;

public enum Aylar {
    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Şubat"),
    MART(3,31,"Mart"),
    NISAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AGUSTOS(8,31,"Ağustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasım"),
    ARALIK(12,31,"Aralık");

    final int ayNo;
    final int gunMiktar;
    final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }
}
