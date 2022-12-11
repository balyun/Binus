package com.mycompany.tugaskelompok1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TugasKelompok1 {

    public static void main(String[] args) {
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
        System.out.println("Pesanan Anda [batas pesanan 0-10 po]");
        System.out.print("Nasi GOreng Spesial       =");
        Scanner inputPesanan = new Scanner(System.in);
        int pesanan1 = inputPesanan.nextInt();
        System.out.print("Ayam Bakar Spesial        =");
        int pesanan2 = inputPesanan.nextInt();
        System.out.print("Steak Sirloin Spesial     =");
        int pesanan3 = inputPesanan.nextInt();
        System.out.print("Kwetiaw Siram Spesial     =");
        int pesanan4 = inputPesanan.nextInt();
        System.out.print("Kambing Gule Spesial      =");
        int pesanan5 = inputPesanan.nextInt();
        
        System.out.println("\n");   
        System.out.println("Selamat Menikmati Makanan Anda...");
        System.out.println("\n");
        System.out.println("Pembelian :");
        
        
