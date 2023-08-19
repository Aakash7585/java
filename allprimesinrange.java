import java.util.*;
public class allprimesinrange {
    public static boolean isprime(int i){
        if(i==2){
            return true;

        }
        else{
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void inrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
            System.out.print(i+" ");
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range");
        int n=sc.nextInt();
        inrange(n);
    }
    
}
