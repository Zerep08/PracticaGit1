/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laweagit;

import java.util.Scanner;

/**
 *
 * @author zerep08
 */
public class LaWeaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radio = 0;
        
        System.out.println("Ingresa el radio del circulo");
        radio = sc.nextInt();
        
        System.out.println("EL area es " + Math.PI*Math.pow(radio, 2));
	
    }
    
}
