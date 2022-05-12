package fileio;

import java.io.File;

//Rename all files in folder: "files" with naming
//   format: "Exercisei_j.txt", to ensure
//    i and j will be 2 digits (through padding 0s)
public class RenameFile {

	public static void main(String[] args) {
		/**Rename 1 of the file**/
		//Rename "Exercise15_1.txt" --> "Exercise15_01.txt"
		//1. File obj --> orginal file
		File orgFile = new File("files/Exercise15_1.txt");
		
		//2. File obj. ---> new file name
		File newFile = new File("files/Exercise15_01.txt");
		
		//3. Rename 
		if(orgFile.renameTo(newFile)) {
			System.out.println(orgFile.getName() + " successully renamed to "+newFile.getName() );
		}
		
		
		/**Rename all the files **/
		File files = new File("files");
		
		File[] childFiles = files.listFiles();
		
		for(File childFile:childFiles) {
			String fileName = childFile.getName();
		}
		
		
		
	}

}
