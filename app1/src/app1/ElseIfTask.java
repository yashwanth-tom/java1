package app1;

import java.util.Scanner;

public class ElseIfTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String uname, pwd;
        System.out.print("Enter UserName : ");
        uname = in.nextLine();
        System.out.print("Enter Password : ");
        pwd = in.nextLine();

        if (uname.equals("mala") && pwd.equals("1234")) {
            System.out.println("Login Successfully");
            System.out.println("Welcome hr");
        } 
        else if (uname.equals("ram") && pwd.equals("rani")) {
            System.out.println("Login Successfully");
            System.out.println("Welcome GangLeader");
        } 
        else if (uname.equals("em1") && pwd.equals("0000") || uname.equals("em2") && pwd.equals("0000") || uname.equals("em3") && pwd.equals("0000")) {
            System.out.println("Login Successfully");
            System.out.println("Welcome " + uname);
        } 
        else {
            System.out.println("Login Failed");
            System.out.println("UserName and Password Wrong");
        }

    }
}
/*
Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.print("Even Number");

        } else {
            System.out.print("Odd Number");

        }
        if (num % 3 == 0) {
            System.out.println(" Divided by 3");
        } else {
            System.out.println(" not Divid 3");
        }


       System.out.print("Enter b Person Age : ");
        b = in.nextInt();
        System.out.print("Enter c Person Age : ");
        c = in.nextInt();

//        if(a>=b && a>=c)
//        {
//            System.out.println("A High");
//        }
//        else if(b>=c)
//        {
//            System.out.println("B High");
//        }
//        else{
//            System.out.println("C High");
//        }
        if (a >= b && a >= c) {
            System.out.println("A High");
        }
        if (b >= a && b >= c) {
            System.out.println("B High");
        }
        if (c >= b && c >= a) {
            System.out.println("C High");
        }
 */
