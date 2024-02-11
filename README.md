# Finalproject-website
# Dokumentasi Pengujian Proyek

## Cakupan/Ungkapan Uji

### Test Suties
1. **Test Suite Login**
    - Test Case 1: Memverifikasi login berhasil dengan kredensial yang valid.
    - Test Case 2: Memverifikasi pesan kesalahan login dengan password salah.
    - Test Case 3 : Memveerifikasi pesan kesalahan login dengan username salah.

2. **Test Suite Register**
    - Test Case 1: Memverifikasi registrasi berhasil dengan kredensial yang valid. 
    - Kasus Uji 2: Memverifikasi registrasi dengan variasi username already exist
    
3. **Test Suite Contact Us**
    - Memverifikasi pengiriman formulir kontak berhasil.
    - Memverifikasi pengiriman formulir kontak berhasil dengan data driven 6 datafiles berbeda.
    - Memverifikasi pengiriman formulir kontak berhasil dengan data driven dan global variable.
    
### Test Suitest Collection
- **Final Project**
  - gabungan dari 3 test suite login, register, dan contact us.

## Pernyataan Kondisional dan Verifikasi
- **Implementasi Pernyataan Kondisional:**
  - IF ELSE: Digunakan dalam Test Case "Login Variation - Password Salah", "Login Varition - Username Salah", dan "Normal - Register Berhasil" untuk memverifikasi apakah formulir dikirim dengan sukses.
  - Switch Case: Digunakan dalam "DD - G Var - Contact Us" untuk menangani skenario contact us yang berbeda.

- **Metode Verifikasi:**
  - Untuk login berhasil : Verifikasi kembali ke homepage. 
  - Untuk login - password salah : Verifikasi pesan "incorrect password"
  - Untuk login - username salah : Verifikasi pesan "incorrect username"
  - Untuk registrasi berhasil: Verifikasi keberadaan pengguna di database.
  - Untuk registrasi username already exist : Verifikasi pesan "username already exist"
  - Untuk pengiriman contact us: Verifikasi pesan keberhasilan.

## Data Driven Testing
- **Data Driven Test Case:**
  - Dalam "Test Suite Contact Us," menguji dengan beberapa set data untuk skenario contact us yang berbeda.

## Variabel
- **Global Variable:**
  - Digunakan pada test suite"Contact Us", digunakan untuk menyimpan data umum di seluruh beberapa kasus uji, seperti URL dan kredensial.
- **Timeout Variable:**
  - Digunakan pada test suite"Register", digunakan untuk mengatasi error yang terjadi ketika pengecekan kondisi elemen username already exist. 

## Integrasi TestOps
- **Berkas yang Diunggah:**
  - Mengunggah skrip pengujian ke TestOps sudah dilakukan.

- **Eksekusi Uji:**
  - Menjalankan "Final Project Website" di TestOps sebanyak tiga kali. 
  - https://drive.google.com/file/d1LewKnTDK7r14-JLwm_Pccwyaex6LRaKN/view?usp=drive_link

## Detail Repositori Git
- **URL Repositori:**
  - https://github.com/zahwaaqila/Finalproject-website.git

- **Detail Commit:**
  - Beberapa commit dengan pesan commit yang jelas.

## Rekaman Video
- **Berkas Rekaman:**
  - https://drive.google.com/drive/folders/1o64Q2OR_tSMkZDJDsdgBWkovELq8vRDU?usp=drive_link


