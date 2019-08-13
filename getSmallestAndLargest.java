
import java.util.Hashtable;
import java.util.Scanner;

public class getSmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "a";
        int length=k-1;
        Hashtable hb=new Hashtable<>();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if(s.length()==k)
        {
            smallest=s;
            largest=s;
        }
        else
        {
        for(int i=0;i<s.length()-length;i++)
        {
            String str="";
            for(int j=i;j<i+k;j++)
            {
               str=str+s.charAt(j); 
            }
            if(smallest.compareTo(str)>0)
            {
                smallest=str;
            }
            if(largest.compareTo(str)<0)
            {
                largest=str;
            }
        }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
