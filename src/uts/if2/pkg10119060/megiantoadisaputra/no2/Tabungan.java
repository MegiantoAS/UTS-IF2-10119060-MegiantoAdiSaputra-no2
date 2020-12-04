/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119060.megiantoadisaputra.no2;

/**
 *
 * @author asus
 */
public class Tabungan {
      private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlahAmbil){
        saldo = saldo-jumlahAmbil;
        return saldo;
    }
}
