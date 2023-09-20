
package app1;
import java.util.Scanner;
public class ElseIf {
      public static void main(String[] args)
      {
          Scanner in = new Scanner(System.in);
          //course join C,Java,Python  -> c#,.net,html
          System.out.print("Enter The Course : ");
          String co=in.nextLine();
          if(!(co.equals("c") || co.equals("java") || co.equals("python")) )
          {
              System.out.println("Available");
          }
          else{
              System.out.println("Not Available");
          }
          
          
      }
}
/*
 //else if statement
          Scanner in = new Scanner(System.in);
          
          System.out.println("Enter The Mark : ");
          int mark=in.nextInt();//0-100 -> 87,92,14  1000
        
          if(mark>90 && mark<=100)
          {
              System.out.println("A Grade");
          }
          else if(mark>80 && mark<=90)
          {
              System.out.println("B Grade");
          }
           else if(mark>=50 && mark<=80)
          {
              System.out.println("C Grade");
          }
           else{
               System.out.println("Fail");
           }



//Nested If statement
          Scanner in = new Scanner(System.in);
          System.out.print("Enter Your UserName : ");
          String name=in.nextLine();
          System.out.print("Enter Your Password : ");
          String password=in.nextLine();
          
          //kumar ,743657 ->false -> true 
          //siva,1234@ -true ->false
          //siva,7878798 ->true->false
          if(!(name.equals("siva") || password.equals("1234@")))
          {
              System.out.println("Wrong UserName and Password");
          }
          else{
          if(name.equals("siva") )
          {
              if(password.equals("1234@"))
              {
                
              System.out.println("Login Successfully");
              }
              else{
                  System.out.println("Wrong Password");  
              }
              
          }
          else{
              System.out.println("Wrong Username");
          }
          
          }
*/