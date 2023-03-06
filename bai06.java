
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class bai06 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        String input = "23-02-2003";
        Date ngaysinh = df.parse(input);
        Person person = new Person("nguyenvanA",1,ngaysinh);
        System.out.println("ho va ten "+person.getHoten()+"gioitinh"+person.getHoten()+"ngaysinh"+person.getNgaysinh());
        
        
        Student sinhvien = new Student();
        sinhvien.setHoten("nguyenvanB");

        sinhvien.setNgaysinh(df.parse("25-04-2003"));
        sinhvien.setGioitinh(1);
        sinhvien.setTruonghoc("Dai hoc ngoai ngu");
        System.out.println("ho va ten "+sinhvien.getHoten()+"gioitinh"+sinhvien.getHoten()+
                "ngaysinh"+sinhvien.getNgaysinh()+"truong dai hoc" +sinhvien.getTruonghoc());
        System.out.println("thue cua sinh vien"+sinhvien.calcTax(2000));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen thi Thuytrang");
        congnhan.setGioitinh(1);
        congnhan.setNgaysinh(df.parse("23-10-2003"));
        congnhan.setCongty("Congty A");
        System.out.println("ho va ten "+congnhan.getHoten()+"gioitinh"+congnhan.getHoten()+
                "ngaysinh"+congnhan.getNgaysinh()+"truong dai hoc" +"cong ty" + congnhan.getCongty());
        System.out.println("thue cua cong nhan"+congnhan.calcTax(5000));
        
        
        
        
        
    
    }
}
