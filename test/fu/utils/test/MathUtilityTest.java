/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.utils.test;

import org.junit.Test;
import static org.junit.Assert.*;
import se140060.util.example.MathUtility;

/**
 *
 * @author Administrator
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        // minh se test cac tinh huong xai ham getFactorial() o day
        // tinh huong la tham so dua vao: duong, am ,duong trong khoang 0..20
        // tinh huong xai ham, test ham goi la test cases
        // thung ta co tinh huong thanh cong va that bai
        // thanh cong: dua vao value hop le 0..20
        //that bai : dua vao am, >20, bi an don
        // ham phai bat cac tinh huong nay, va gio ta test thu coi ham xu li dung ko
        
        
    }
    
    @Test // bien ham nay thanh public static voi main
    //quy tac dat ten ham cho viec test phan mem: rat nhieu quy tac
    // nhung noi chung ten ham se bao gom ngu nghia ket qua tra ve, trinh trang test
    // khongo giong quy tac dat ten ham khi viet app
    //minh dang viet code de test app
    
    //minh muon test ham tra ve ngon neu dua tham so ngon
    public void getFactorial_RunsWell_IfvalidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        // check coi co dung la goi ham 5! co tra ve 120 hay ko
        //co = xanh, ko=do?
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
    }
    //mac dinh code test dong lap voi code chinh
    // doc lap voi qua trinh clean build , tuc la code xanh hay do?
    // mien la ko sai cu phap
    //ban luon dong goi build ra dc file .jar wwar(chap xanh do)
    
    //hop logic thi mau xanh, tuc lam ham chuan thi moi nen ra dc .jar, .war
    // vay ta can co 1 cai gai xanh do vao quy trinh build .jar .war
    // cach khac: neu code test dang mau do thi disable cai nut bam clean & build
}
