/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt02;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        DecimalFormat fmt=new DecimalFormat("#,##0.00");
        Account my = new Account("T454643", "Nguyen Thi Chung", 20000000);
        Account friend = new Account("K457855", "You", 5000000);

        System.out.println("====Thong tin 2 tai khoan ban dau====");
        System.out.println("My Account: [id:" + my.getId() + ", Name:" + my.getName() + ", Balance:" + fmt.format(my.getBalance()) + "]");
        System.out.println("Friend Account: [id:" + friend.getId() + ", Name:" + friend.getName() + ", Balance:" + fmt.format(friend.getBalance()) + "]");
        
        System.out.println("Nap tien vao my account");
        my.credit(2000000);
        System.out.println("Rut tien tu friend account ");
        friend.debit(4000000);
        System.out.println("Chuyen tien tu my account den friend account");
        my.tranferTo(friend, 3000000);

        System.out.println("Sau khi thuc hien giao dich:");
        System.out.println("My Account: [id:" + my.getId() + ", Name:" + my.getName() + ", Balance:" + fmt.format(my.getBalance()) + "]");
        System.out.println("Friend Account: [id:" + friend.getId() + ", Name:" + friend.getName() + ", Balance:" + fmt.format(friend.getBalance()) + "]");
    }

}
