/*import java.util.*;
public class areaoftriange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float area=base*height*.5f;
        System.out.println(area);
    }
    
}
*/
import java.util.*;
public class areaoftriange{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        float pencil=Sc.nextFloat();
        float pen =Sc.nextFloat();
        float book =Sc.nextFloat();
        float total=pencil+pen+book;
        System.out.println( "bill is"+(total));
        //total with 18% tax..
        float newtotal= total+total*0.18f;
        System.out.println("bill ith 18 % tax is"+(newtotal));

    }
}
