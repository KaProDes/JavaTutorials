public class PatternPrinting
{ 
    static void printStars(int n) 
    { 
        int i, j; 
        for(i=0; i<n; i++) 
        {   
            for(j=0; j<=i; j++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
    }
   
 /*
 Above snippet gives pattern : 
   
* 
* * 
* * * 
* * * * 
* * * * *
   
 */
 
 static void printNums(int n) 
    { 
        int i, j,num; 
        for(i=0; i<n; i++) 
        { 
            num=1; 
            for(j=0; j<=i; j++) 
            { 
                System.out.print(num+ " "); 
                num++; 
            } 
            System.out.println(); 
        } 
    } 
    /*
    Above method gives pattern : 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
    
    */
   
   //Driver class
   public static void main(String args[]){
    printStars(5);
    printNums(5)
   }
   
 }
