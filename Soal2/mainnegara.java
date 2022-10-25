/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class mainnegara {
    public static void main(String[] args) {
        String nama = "", jenis="", nama_pe="";
        int tanggal=0, bulan=0, tahun=0;
        Scanner input = new Scanner(System.in);
        negara ngra = new negara(nama, jenis, nama_pe, tanggal, bulan, tahun);
        LinkedList<negara> llnegara = new LinkedList<negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            negara c = new negara(nama, jenis, nama_pe, tanggal, bulan, tahun);
            c.getData();
            llnegara.add(c);
        }

        for (int i = 0; i < llnegara.size(); i++){
            negara nIndex = llnegara.get(i);
            nIndex.cetak();
    }
  }
}
