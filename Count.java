public class Count {
    public static void main(String[] args) {
        int x=8668;
        int num=x;
        int rev=0;
        // int count=0;
        
        while(num>0)
        {    int n=num%10;
             rev =n + rev*10;
             num = num/ 10;
        
        }
       if(rev==x)
       {
        System.out.print("No. is Pallindromne");
       }
       else{
        System.out.print("Not a Pallindrome Number");
       }        
       
    }
}
