import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int max=0;
        
        while(n>0){
            
            int a=n%2;
            
            if(a==1){
                count++;
                if(count > max){
                    max=count;
                }
            }
            else{
                count=0;
            }
            n=n/2;
        }
        System.out.println(max);
    }
}
