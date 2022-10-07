/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js08javaarray;
import javax.swing.JOptionPane;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class Job8Tugas2BukuTerbesar {
    public static void main(String[] args) {
        int[] a = new int[10];
        String[] n = new String[10];
        
        int max = 0;
        
        for (int i = 0; i < a.length; i++){
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ": ");
            
            a[i] = Integer.parseInt(n[i]);
            
            if (a[i] > max){
                max = a[i];
            }
        }
        
        String hasil = "Bilangan terbesar adalah " + max;
        JOptionPane.showMessageDialog(null, hasil);
            }
        }
