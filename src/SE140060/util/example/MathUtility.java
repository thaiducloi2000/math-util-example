/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se140060.util.example;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MathUtility {
    public static final double PI=3.1415;
    //ham tinh n giai thua. n>=0 && n<=0
    //neu qua 20 tran` kieu long
    //0!=1; 1!=1=1;n!=1.2.3.4...n
    public static long getFactorial(int n){
        
        if(n==0||n==1) return 1;
        if(n<0||n>20) {
            throw new IllegalArgumentException("N must be in 0-20");
            //nguoi dung nhap vao n !=(0,20) thi thong bao n khongo hop le
        }        
//        long result=1;
//        for(int i=2;i<=n;i++){
//            result *=i;
//        }
//        return result;
            return n*getFactorial(n-1);
    }
    
    public static void main(String[] args) {
        /* Code viet raa thi Developer phair test trc 
        co vai hinh thuc test code khac nhau 
        1.TDD ,Test Driven Development
        Viet Dan khung cua ham getFactorial(int n)
        sau do dung ham test()
        chay thu coi xanh do, do? nghia la error,xanh nghia la on
        cu lien tuc xanh do trong qua trinh code
        va sua code, nguoi ta goi la lap trinh theo thoa man vec test,TDD
        2.sout(ham + data) de coi ket qua ra sao, co dung nhu minh ky vong no phai tra ve nhu the ko-> xem ket qua test=eye
        3.JOptionPane cua ben javaDesktop de popup ket qua len man hinh, van xem = eye
        4. viet 1 trang web go ham xu li...,hao suc qua ta choi 1 va 2*/
        
        int n;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Please Enter N: (N much be in 0-20)");
            n=Integer.parseInt(sc.nextLine());
            System.out.println("The Factorial of N : "+ getFactorial(n));
            
         //e: nem ve ngoai le IllegalArgumentException
        } catch (NumberFormatException e) {
            System.out.println("N must be a number.");
        }
       // catch(IllegalArgumentException e){
      //      System.out.println("");
      //  }
            
    }
}
