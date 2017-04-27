
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		//String file_name = "C:\Users\Administrator\Desktop\eclipse\ExData"
		
		try{
			File x = new File ("C:\\Users\\Administrator\\Desktop\\eclipse\\ExData.txt");
			Scanner sc = new Scanner(x);
			String input  ="";
			while(sc.hasNext()){
				input += sc.next()+"\n";
			}
			sc.close();		
			
			String[] firstBlocks = input.split("\n");
			System.out.println(firstBlocks[3]);
//			String people = firstBlocks[0];
//			String animals = firstBlocks[1];
//			String[] secondBlocksPe = people.split("%");
//			String[] secondBlocksAn = animals.split("%");
//			for(int i=0 ; i <= secondBlocksPe.length ; i=i+5){
//				String[] names = people.split("\n");
//				System.out.println(names[1]);
//			}
			
			
			
			
			//String[] names = secondBlocksPe[0, 6, 12];
			//System.out.println(secondBlocks[6]);
//			String gareth = secondBlocksPe[0];
//			String devdetta = secondBlocksPe[1];
//			String elliott = secondBlocksPe[2];
//			
//			String[] secondBlocksAn = animals.split("%");
			
			
			
			
			
			
			
			
			
			
			
			
//			String s1 = sc.next();
//			String[] word = s1.split("\\s");
//			for (String w : word){
//				System.out.println(w);
//			}

		}
			catch(Exception e){
			}
		
	
	}
}
			//String data = sc.next();
			//String[] people = ; 
			//for(String w : data.split("\\s",0))
			//	System.out.print(data);