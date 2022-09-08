package bctjavafeatures;
import java.util.Arrays;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str[]= {"Sachin","Dhoni","Virat","kohli","Raina"};
         Arrays.sort(str, String::compareToIgnoreCase);
         for(String data:str) {
        	 System.out.println(data);
         }
	}

}
