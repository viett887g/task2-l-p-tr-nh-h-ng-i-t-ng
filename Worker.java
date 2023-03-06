
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Worker extends Person implements TaxInterface{
    private String congty;

    public Worker() {
    }

    public Worker(String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcTax(double income) {
        return (income*5/100);
    }
    
}
