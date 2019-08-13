import java.util.HashSet;
import java.util.*;

public class RemoveRepeatedWords {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        //System.out.println(input);
        
        for(int i=0;i<input;i++)
        { 
          
           String str=sc.nextLine();
         
        String[] splittedstr=str.split(" ");
        Set<String> s = new HashSet<>();
        String outputstr="";
    
        for(int k=0;k<splittedstr.length;k++)
        {
            
            if(s.add(splittedstr[k].toLowerCase()))
                    {
                outputstr=outputstr+splittedstr[k]+" ";
                    }
        }
        System.out.println(outputstr);
        }
        

    }
}