/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js08javaarray;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class Job8Tugas3BukuAlamat {
    public static void main(String[] args) {
        String[][] entry = {{"Florence", "753-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}};
        
        for (int i = 0; i < entry.length; i++){
            System.out.println("Name: " + entry[i][0]);
            System.out.println("Telp.: " + entry[i][1]);
            System.out.println("Address: " + entry[i][2]);
        }
    }
    }
