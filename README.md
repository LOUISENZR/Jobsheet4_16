# Jobsheet_4_16

1. Peseudocode Lingkaran
Algoritma: Lingkaran16 
{dibaca jari-jari lingkaran dari piranti masukan. Hitunglah keliling dan luas lingkaran tersebut}

Deklarasi: 
r : int
phi=3.14 : float
keliling, luas : double

Deskripsi: 
1. print “masukkan jari-jari lingkaran: ”
2. read r
3. read phi
4. keliling = 2*phi*r
5. luas = phi*r*r
6. print keliling
7. print luas
--------------------------------------------------------------------------------------
2. Peseudocode Gaji
Algoritma: Gaji16
{dibaca jmlMasuk dan JmlTdkMasuk dari piranti masukakn. Hitunglah TotGaji tersebut}

Deklarasi:
Int : jmlMasuk, JmlTdkMasuk, TotGaaji
Int : gaji=40000, potGaji=25000

Deskripsi:
1. print "Masukan Jumlah Hari Masuk Kerja Anda"
2. read jmlMasuk
3. print "Maukan Jumlah Hari Tidak Masuk Kerja Anda"
4. TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji)
5. print "Gaji yang anda terima adalah" +Gaji
-----------------------------------------------------------------------------------
3. Peseudocode Gaji Modivikasi
Algoritma: Gaji16
{dibaca jmlMasuk dan JmlTdkMasuk dari piranti masukakn. Hitunglah TotGaji tersebut}

Deklarasi:
Int : jmlMasuk, JmlTdkMasuk, TotGaaji
Int : gaji, potGaji

Deskripsi:
1. print "Masukan Jumlah Gaji"
2. read gaji
3. print "Masukan Jumlah Potongan Gaji"
4. read potGaji
5. print "Masukan Jumlah Hari Masuk Kerja Anda"
6. read jmlMasuk
7. print "Maukan Jumlah Hari Tidak Masuk Kerja Anda"
8. read JmlTdkMasuk
9. TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji)
10. print "Gaji yang anda terima adalah" +Gaji
---------------------------------------------------------------------------------
4. Pseudocode Harga Bayar
Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan 
harga barang}

Deklarasi: 
harga, jumlah, jmlHalBuku: int
dis, total, bayar, jmlDis : double
MerkBuku : String

Deskripsi: 
1. print "Masukan Merk Buku"
2. read MerkBuku
1. print "Masukkan harga barang yang dibeli”
2. read harga
3. print " Masukkan Jumlah jumlah barang yang dibeli”
4. read jumlah
3. print "Masukan jumlah diskon"
3. Read dis
5. total = harga *jumlah
6. jmlDis=total*dis
7. bayar=total-jmlDis
8. print “Diskon yang anda dapatkan adalah”
9. print jmlDiskon
10. print "Jumlah yang harus dibayar adalah”
11. print bayar

-------------------------------------------------------------------------------
5. Pseudocode Sistem Mesin ATM
Algoritma: sistemMesinATM

Deklarasi:
1. Saldo Awal = 1000000.0 : double
2. menu (1/2/3/4): int
   1.cek saldo
   2.tarik tunai
   3.setor tunai
   4.keluar

Deskripsi:
1. print "Menu"
2. print "1. Cek Saldo"
3. print "2. Tarik Tunai"
4. print "3. Setor Tunai"
5. print "4. Keluar"
6. print "Pilih menu (1/2/3/4): "
7. read pilihan
8. Kasus 1:
print "saldo anda saat ini: " +saldo awal
read break
9. Kasus 2:
print "masukan jumlah penarikan: "
read tarik tunai
if tarik tunai>saldo
print "saldo tidak mencukupi"
else saldo-=tarikan
print "penarikan berhasil, saldo anda sekarang: " +saldo awal
read break
10. kasus 3
print "Masukan jumlah setoran: "
read setor tunai
compute saldo awal += setoran
print "setoran berhasil, saldo anda sekarang: " +saldo awal
read break
11. kasus 4
print "terima kasih telah menggunakan ATM. Sampai jumpa!"
read keluar
12. if pilihan except (1/2/3/4)
print "pilihan tidak vallid. Silahkan pilih menu yang benar"


