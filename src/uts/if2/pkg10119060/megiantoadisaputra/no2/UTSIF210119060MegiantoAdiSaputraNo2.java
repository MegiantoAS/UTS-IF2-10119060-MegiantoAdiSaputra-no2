/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119060.megiantoadisaputra.no2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class UTSIF210119060MegiantoAdiSaputraNo2 {

    /**
      @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program UTS NO 2
     */
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int jumlahAmbil;
        System.out.println("=====Program Penarikan Uang=====");
        System.out.printf("Masukan Saldo Awal : ");
        
        Tabungan tabungan = new Tabungan(input.nextInt());
        System.out.printf("Jumlah Uang yang Diambil : ");
        jumlahAmbil = tabungan.ambilUang(input.nextInt());
        System.out.println("Saldo Anda Sekarang : "+jumlahAmbil);
    }
    
}
