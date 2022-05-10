package exception;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFileIO {

	public static void main(String[] args) {
		
		//Create an file object points to directory
		File fo1 = new File("files");
		
		//Check status
		System.out.println("Is Dir? "+fo1.isDirectory());
		System.out.println("Is File? "+fo1.isFile());
		System.out.println(new Date(fo1.lastModified()));
		
		//Check how many elements of file object?
		if(fo1.isDirectory()) {
			File[] childFiles = fo1.listFiles();
			
			//If no elements in the folder,
			//   insert a new file
			if(childFiles.length==0) {
				System.out.println("The folder "+ fo1.getName()+" is empty");
			
				//Insert a empty file called "1.txt"
				File file1 = new File("files/1.txt");
			
				System.out.println("Is existed? "+file1.exists());
//				try {
//					if(file1.createNewFile()) {
//						System.out.println(file1.getName()+" is created successfully.");
//					}
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
				
			
			
			}
			
			
			//Rename 1.txt --> 65.txt
			File orgFile = new File("files/1.txt");
			File renamedFile = new File("files/65.txt");
			orgFile.renameTo(renamedFile);
		}
		
		
		
		
		
	}

}
