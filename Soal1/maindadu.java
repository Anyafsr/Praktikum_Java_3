/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class maindadu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dadu ddu = new dadu();
        int masukkan = input.nextInt();

        ddu.setInput(masukkan);
        ddu.acakNilai();
    }
}
