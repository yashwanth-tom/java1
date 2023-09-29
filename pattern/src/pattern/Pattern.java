package pattern;
public class Pattern {

    public static void main(String[] args) {
      
     int len =4;
     int pt=65;
     for(int r=1;r<=len;r++)
     {
         for(int sp=1;sp<=len-r;sp++)
         {
             System.out.print("  ");
         }
         for(int c=1;c<=r+(r-1);c++)
         {
             System.out.print((char)pt+" ");
             pt++;
         }
         System.out.println();
     }
     
     
   
        
        
    }

}
/*
//Basic Pattern
  Scanner in = new Scanner(System.in);
        System.out.print("Enter The Row : ");
        int rowLen = in.nextInt();
        System.out.print("Enter The Col : ");
        int colLen = in.nextInt();
        //Pattern

        for (int r = 1; r <= rowLen; r++) 
        {
            for (int c = 1; c <= colLen; c++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

ex 1 : 
int len=3;
        int pr=1;
        for (int r = 1; r <=len; r++) 
        {
            for (int c = 1; c <=len; c++) 
            {
                System.out.print(pr+" ");
                pr++;
            }
            System.out.println();
        }

       int len=3;
        int pr=1000;
        for (int r = 1; r <=len; r++) 
        {
            for (int c = 1; c <=len; c++) 
            {
                System.out.print((char)pr+" ");
                pr++;
            }
            System.out.println();
        }


//Left angle Triangle  Upward
  int len=25;
        String pr="*";
        for (int r = 1; r <=len; r++) 
        {
            for (int c = 1; c <=r; c++) 
            {
                System.out.print(pr+" ");
               
            }
            System.out.println();
        }


 int len=5;
        String pr="*";
        for (int r = 1; r <=len; r++) 
        {
            for (int c = 1; c <=len-r+1; c++) 
            {
                System.out.print(pr+" ");
               
            }
            System.out.println();
        }

 int len=5;
        int colLen=len;
        String pr="*";
        for (int r = 1; r <=len; r++) 
        {
            for (int c = 1; c <=colLen; c++) 
            {
                System.out.print(pr+" ");
               
            }
            System.out.println();
            colLen--;
        }

 int[] a = {1, 6, 4, 8, 9,5,3,3,5,3,6,23};
        String odd = "[ ", even = "[ ";
        
        for(int val : a)
        {
            if(val%2==0)
            {
                even+=String.valueOf(val)+" ";
            }
            else{
                odd+=String.valueOf(val)+" ";
            }
                     
        }

        odd += "]";
        even += "]";
        System.out.println("odd  : " + odd);
        System.out.println("even : " + even);

int len=4;
      int sp=len-1;
      for(int r=1;r<=len;r++)
      {
          for(int s=1;s<=sp;s++)
          {
              System.out.print("  ");
          }
          
          for(int c=1;c<=r;c++)
          {
              System.out.print("* ");
          }
          System.out.println();
          sp--;
      }

int len=4;
      int sp=0;
      for(int r=1;r<=len;r++)
      {
          for(int s=1;s<=sp;s++)
          {
              System.out.print("  ");
          }
          
          for(int c=1;c<=len-r+1;c++)
          {
              System.out.print("* ");
          }
          System.out.println();
          sp++;
      }
        
    }

  int len=25;
        for(int r=1;r<=len;r++)
        {
            for(int c=1;c<=len;c++)
            {
                if(r==c || r+c==len+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

 int len =5;
     int pr=65;
     for(int r=1;r<=len;r++)
     {
         for(int c=1;c<=len;c++)
         {
             if(c==1 || r==len)
             {
             System.out.print((char)pr+" ");
             pr++;
             }
             else{
                 System.out.print("  ");
             }
         }
         System.out.println();
         
     }
        
*/
