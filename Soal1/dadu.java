/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class dadu {
    public int input;
    public int min = 1;
    public int max = 6;
    int total;

//    Encapsulation
    public void setInput(int input){this.input = input;}

    void acakNilai(){
        LinkedList<Integer> daduu = new LinkedList<Integer>();
        daduu.add(1);daduu.add(2);daduu.add(3);daduu.add(4);daduu.add(5);daduu.add(6);
        for (int i = 0; i < input; i++){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ random_int);
            total += random_int;
        }
        System.out.println("Total Nilai Dadu Keseluruhan " + total);
    }
}
