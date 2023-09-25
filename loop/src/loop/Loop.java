package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        /*
        5,100,5 -> 75 break, continue 20-35
         */
//        int i = 5;
//        while (i <= 100) {
//
//            if (i >= 20 && i <= 35) {
//                i += 5;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 75) {
//                break;
//            }
//
//            i += 5;
//        }

//int a=[6,7,6,37,23,5,4] -> 4,37 minumum and maximum

    int[] a={1,20,4,37,374,39485,435,3,432,43,34,3,43,4,343,3,42,423,2,343,4,5,43,53,4,3,4,3,43,4,3,4,4,545,4,5};
    long s=1;
    for(int i=0;i<a.length;i++)
    {
        s+=a[i];
    }
   System.out.println("Total = "+s);
    
    
    

    }

}
//while loop 
/*
        initial ;
         while (condition)
        {
         increment or degreement
        }
 */
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }
//        int i=1;
//        while(i<=20)
//        {
//            System.out.println(i);
//            i++;
//        }

// do while loop 
//        int i = 100;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 20);
//for each loop
// int[] ary ={6,7545,5,46,67,76,56};
// for(int i=0;i<ary.length;i++)
// {
//     System.out.println(ary[i]);
// }
//  for(int val:ary)
//  {
//      System.out.println(val);
//  }
/*
   int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <=100);


 Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Enter Value (maximum=100) : ");
        x=in.nextInt();
        
     //break
     for(int i=1;i<=100;i++)
     {
        
         System.out.println("Hello Raja "+i);
          if(i==x)
         {
             break;
         }
     }

        //continue
        for (int i = 1; i <= 10; i++) {
//          if(i==5 || i==9 || i<=3)
//         {
//             continue;
//         }
            if (i >= 3 && i <= 7) {
                continue;
            }
            System.out.println("Hello Raja " + i);

        }
 */
