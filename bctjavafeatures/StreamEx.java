package bctjavafeatures;
import java.util.ArrayList;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> names=new ArrayList<String>();
         names.add("Selva");
         names.add("Kumar");
         names.add("Jejin");
         names.add("Merson");
         int count=0;
         for(String ele:names) {
        	 if(ele.length()<5)
        		 count++;
         }
        	 System.out.println("There are : "+ count+"String is less than 5");
        	 System.out.println("------------------------------------------");
        	 int cou =(int)names.stream().filter(ele->ele.length()<5).count();
        	 System.out.println("There are : "+ cou+"String is less than 5");
         }
	

}
