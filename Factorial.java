//Trailing Zeroes in Factorial
public class Factorial {
public static void main(String[] args) {
    int n=25;
    int fact=1;
   int count=0;
  for(int i=5;i<=n;i=i*5)
  {
    count=count+n/i;
  }
    System.out.print(count);
}   
}
