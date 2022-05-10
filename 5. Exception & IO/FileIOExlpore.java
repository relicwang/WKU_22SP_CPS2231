package fileio;

import java.io.File;
import java.util.Date;

public class FileIOExlpore {

	public static void main(String[] args) {
		File files = new File("files");
//		files --> take out all child files
		
		if(files.exists()&&files.isDirectory()) {
			File[] childEles = files.listFiles();
		
			for(File file:childEles) {
				System.out.print(file.getName()+ " ");
				System.out.print(file.length()+ " ");
				System.out.println(new Date(file.lastModified())+ " ");
			}
	
		}
		
		//Original File --> file3 obj
		File file3 = new File("files/test3.txt");
		
		//Target file name --> file5 obj
		File file5 = new File("files/test5.txt");

		file3.renameTo(file5);
	}

}
