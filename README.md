# TUGAS PBO: ABSTRACT CLASS

## 📌 Konsep yang Digunakan:

### 1. Abstract Class
BangunDatar adalah kelas abstrak karena konsep "bangun datar" terlalu umum
dan belum memiliki rumus pasti. Di dalamnya ada metode abstract hitungLuas()
dan hitungKeliling() yang belum memiliki isi kode.

### 2. Inheritance (Pewarisan)
Kelas Persegi, PersegiPanjang, dan Lingkaran mewarisi sifat dan metode
dari kelas BangunDatar menggunakan kata kunci extends.

### 3. Polymorphism
Metode hitungLuas() dan hitungKeliling() namanya sama di semua kelas,
tapi isinya berbeda tergantung jenis bangun datarnya. Saat dipanggil dari
kelas utama, Java otomatis menjalankan versi yang tepat.
