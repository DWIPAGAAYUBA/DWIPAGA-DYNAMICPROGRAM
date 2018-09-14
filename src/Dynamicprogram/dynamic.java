/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamicprogram;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author MSI
 */
public class dynamic {
     public static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 2, 3, 5, 8, 13, 21, ...dst.\n");
    }
    public static void main(String[] args){
        String identitas = "Dwi paga ayuba / X RPL 2 / 10";
        
        tampilJudul(identitas);
        
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n, hasil);
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
}