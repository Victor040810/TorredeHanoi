/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class SolTorresDeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("numero de discos na torre de hanoi? ");
        int n= stdin.nextInt();
        
        TorresdeHanoi t = new TorresdeHanoi();
        
        t.moverDiscos(n, 'A','C', 'B');
        t.escreveTotalMovimentos();
    }
    
}
