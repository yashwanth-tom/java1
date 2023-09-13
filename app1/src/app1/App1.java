package app1;
import java.util.Scanner;
import java.util.Random;

public class App1 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random ra = new Random();//1-raja-1000,2-rani-500,3-manthiri-300,4-police-200
//        
//        int ram=0,sam=0,pooja=0;
//        
//        while(true)
//        {
//            System.out.print("Enter Your Name (ram/sam/pooja/exit): ");
//        String name=in.nextLine();
//        if(name.equals("exit"))
//        {
//            break;
//        }
//        
//        System.out.println("1-raja-1000\n2-rani-500\n3-manthiri-300\n4-police-200");
//        int val=ra.nextInt(4)+1; //0-5
//        System.out.println(val);
//        
//        switch(val)
//        {
//            case 1:{
//              switch(name)
//              {
//                  case "ram":ram+=1000;break;
//                  case "sam":sam+=1000;break;
//                  case "pooja":pooja+=1000;break;
//              }
//              break;
//            }
//            
//            
//            case 2:{
//              switch(name)
//              {
//                  case "ram":ram+=500;break;
//                  case "sam":sam+=500;break;
//                  case "pooja":pooja+=500;break;
//              }
//              break;
//            }
//            
//            
//            case 3:{
//              switch(name)
//              {
//                  case "ram":ram+=300;break;
//                  case "sam":sam+=300;break;
//                  case "pooja":pooja+=300;break;
//              }
//              break;
//            }     
//             case 4:{
//              switch(name)
//              {
//                  case "ram":ram+=200;break;
//                  case "sam":sam+=200;break;
//                  case "pooja":pooja+=200;break;
//              }
//              break;
//            }
//        }
//        
//        }
//        
//        System.out.println("Ram   : "+ram);
//        System.out.println("Sam   : "+sam);
//        System.out.println("Pooja : "+pooja);
//       
        

//      Random ra = new Random();
//      boolean ch=ra.nextBoolean();
//      if(ch)
//      {
//          System.out.println(ra.nextInt(1)+1);
//      }
//      else{
//          System.out.println((ra.nextInt(1)+1)*-1);
//      }
//     Random ra = new Random();
//     while(true){
//      for(int i=1;i<41;i++)
//      {
//          System.out.print(ra.nextInt(2)+" ");
//      }
//         System.out.println();
//     }


Random ra = new Random();
Scanner in = new Scanner(System.in);
  while(true)
  {
        System.out.println((char)(ra.nextInt(25)+65));

        String ch=in.nextLine();
        
       
  }
    }
    
}
 //If Statement
        /*
        if(condition)
        {
           statements
        }
        
        Example 1
         int num=8;
        if(num>0)
        {
            System.out.println("Positive Number"); 
        }
        
        System.out.println("Thank you");

//IF Else Statement
    
if(condition){
  statements
}
else{
 statements
}
  
Example 2
  Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number : "); 
        int num=in.nextInt();
        if(num>0)
        {
            System.out.println("Positive Number"); 
        }
        else
        {
            System.out.println("Negative Number");
        }
        
        System.out.println("Thank you");

Example 3
Scanner in = new Scanner(System.in);
        System.out.print("Enter your Value (ON/OFF) : "); 
        String val=in.next();
        
        if(val.equals("ON"))
        {
            System.out.println("Light ON");
        }
        else{
            System.out.println("Light OFF");
        }
        

        
*/