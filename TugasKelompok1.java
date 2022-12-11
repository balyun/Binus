package com.mycompany.tugaskelompok1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TugasKelompok1 {

    public static void main(String[] args) {
        double h1 = 9999.99, h2 = 12345.67, h3 = 21108.40, h4 = 13579.13, h5 = 98765.43;
    String namaPemesan;
        int jumlahOrang, jumlahPesanan;
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Selamat Siang...");
        System.out.print("Pesan untuk berapa orang  :");
        Scanner input = new Scanner (System.in);
        jumlahOrang = input.nextInt();
        System.out.print("Pesanan atas nama         :");
        Scanner input2 = new Scanner (System.in);
        namaPemesan = input2.nextLine();
        
        System.out.println("\n");
        System.out.println("Menu Spesial Hari ini");
        System.out.println("=====================");
        System.out.println("1. Nasi Goreng Spesial            @   Rp.  9999.99");
        System.out.println("2. Ayam Bakar Spesial             @   Rp. 12345.67");
        System.out.println("3. Steak Sirloin Spesial          @   Rp. 21108.40");
        System.out.println("4. Kwetiaw Siram Spesial          @   Rp. 13579.13");
        System.out.println("5. Kambing Guling Spesial         @   Rp. 98765.43");
        
        System.out.println("\n");
        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("Nasi Goreng Spesial       =");
        Scanner inputPesanan = new Scanner(System.in);
        int menu1 = inputPesanan.nextInt();
        System.out.print("Ayam Bakar Spesial        =");
        int menu2 = inputPesanan.nextInt();
        System.out.print("Steak Sirloin Spesial     =");
        int menu3 = inputPesanan.nextInt();
        System.out.print("Kwetiaw Siram Spesial     =");
        int menu4 = inputPesanan.nextInt();
        System.out.print("Kambing Gule Spesial      =");
        int menu5 = inputPesanan.nextInt();
        
        System.out.println("\n");   
        System.out.println("Selamat Menikmati Makanan Anda...");
        System.out.println("\n");
        System.out.println("Pembelian :");
        
         System.out.println("1. Nasi Goreng Spesial " + menu1 + " porsi * " + h1 + " = Rp. " +
df.format(menu1*h1));
 System.out.println("2. Ayam Bakar Spesial " + menu2 + " porsi * " + h2 + " = Rp. " +
df.format(menu2*h2));
 System.out.println("3. Steak Sirloin Spesial " + menu3 + " porsi * " + h3 + " = Rp. " +
df.format(menu3*h3));
 System.out.println("4. Kwetiaw Siram Spesial " + menu4 + " porsi * " + h4 + " = Rp. " +
df.format(menu4*h4));
 System.out.println("5. Kambing Guling Spesial " + menu5 + " porsi * " + h5 + " = Rp. " +
df.format(menu5*h5));

System.out.println("===========================================================+");
 double total = menu1*h1 + menu2*h2 + menu3*h3 + menu4*h4 + menu5*h5;
 System.out.println("Total pembelian = Rp. " + total);
 double diskon = total*10/100;
 System.out.println("Disc. 10% < Masa Promosi > = Rp. " +
df.format(diskon));

System.out.println("===========================================================-");
        
    }
}
        
        
