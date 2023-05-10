/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BTVN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //BAI 1///////////////////////////////////////////
        System.out.println("MSSV: ");
        String MSSV = scanner.nextLine();
        System.out.println("MSSV la: "+MSSV);
        
        
        System.out.println("Ten: ");
        String Ten = scanner.nextLine();
        System.out.println("XIn chao: "+Ten);
        
        System.out.println("Que: ");
        String Que = scanner.nextLine();
        System.out.println("Que quan: "+Que);
        ///////////Bai 1//////////////////////////////////////
        
        
        
        
        //Bai 2/////////////////////////////////////
        System.out.println("Ten: ");
        String Tenb = scanner.nextLine();
        System.out.println("XIN CHAO: "+Tenb);
        
        System.out.println("Tuoi: ");
        String tuoi = scanner.nextLine();
        System.out.println("Nam nay ban "+tuoi+" tuoi");
        
        
        System.out.println("Nhap dia chi: ");
        String dc = scanner.nextLine();
        System.out.println("Dia chi: "+dc);
        
        System.out.println("Gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Gioi tinh: "+sex);
        
        
        System.out.println("Ky hoc: ");
        String ky = scanner.nextLine();
        System.out.println("Hoc ky: "+ky);
        
        
        System.out.println("Que quan: ");
        String queq = scanner.nextLine();
        System.out.println("Que quan la: "+queq);
        //////////////////Bai 2///////////////////////////////////////
        
        
        //////////////////Bai 3///////////////////////////////////////
        System.out.println("q= ");
        int q = scanner.nextInt();
        System.out.println("w= ");
        int w = scanner.nextInt();
        System.out.println("e= ");
        int e = scanner.nextInt();
        if ( q >= w && q >= e) {
            System.out.println("max la: "+q);
        }
        if ( w >= q && w >= e) {
            System.out.println("max la: "+w);
        }
        if ( e >= q && e >= w) {
            System.out.println("max la: "+e);
        }
        //////////////////Bai 3///////////////////////////////////////
        
        ////////Bai 4///////////////////////////////////
        System.out.println("a= ");
        int a = scanner.nextInt();
        System.out.println("b= ");
        int b = scanner.nextInt();
        int t = a + b;
        int h = a - b;
        int x = a * b;
        float ttt = a / b;
        System.out.println("Tong la: "+t);
        System.out.println("Hieu la: "+h);
        System.out.println("Tich la: "+x);
        System.out.println("Thuong la: "+ttt);
        ////////Bai 4///////////////////////////////////
        
        
        
        
        ////////Bai 5///////////////////////////////////
        System.out.println("Diem toan: ");
        float toan = scanner.nextFloat();
        System.out.println("Diem ly: ");
        float ly = scanner.nextFloat();
        System.out.println("Diem hoa: ");
        float hoa = scanner.nextFloat();
        float tb = (toan + ly + hoa) / 3;
        System.out.println("Diem trung binh: "+tb);
        ////////Bai 5///////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
