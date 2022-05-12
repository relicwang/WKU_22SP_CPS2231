package classobject;

import java.io.File;
import java.io.IOException;

public class GenerateFiles {

	public static void main(String[] args) {
		/**Create 1 file**/
		//Create a file in folder "files"
		//  named: "Exercise1_2.txt"
		//1.  Create a file object points 
		//    to the path towards our new file
		File file1 = new File("files/Exercise1_2.txt");
		
		//2. Create the file in corresponding disk location
		if(!file1.exists())	{
			
			try {
				
				if(file1.createNewFile()) {
					System.out.println(file1.getName()+ " is successfully created.");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		
		/**Create a group of files**/
		//Create a file in folder "files"
	    //  named: "Exercise1_j.txt" 
	    //   (where j in [1,25])
		
		//1. We should generate all
		//    filenames
		
		for(int j=1;j<=25;j++) {
			
			String fileName= "files/Exercise1_"+j+".txt";
		
			File file = new File(fileName);
		
			try {
				if(file.createNewFile()) {
					System.out.println(file.getName()+ " is successfully created.");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		/**Create a group of files**/
		//Create a file in folder "files"
	    //  named: "Exercisei_j.txt" 
	    //   (where i in [1,15], j in [1,25])
		
		
	}

}
