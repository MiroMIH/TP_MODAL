import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Files manipulation");
		
		//DECLARTION OF THE FILE
		File f = new File("C:\\test\\test1.txt");
		//FILE READER AND BUFFERED READER
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		try
		{
			//EACH LINE IN THE TXT FILE
			String Line;
			Line=br.readLine();
			//LOOP OVER ALL LINES 
			while(Line!=null)
			{
				System.out.println(Line);
				Line=br.readLine();
				
			}
			//CLOSE STREAM
			br.close();
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FILE NOT FOUND  : "+e.toString());

		}
		catch(IOException e)
		{
			System.out.println("ERROR WHILE READING THE FILE : "+e.getMessage());
		}
		
		//WRITING TO A FILE
		try
		{
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		String str="MASTER IL";
		bw.newLine();
		bw.write(str);
		
		//CLOSE STREAM
		bw.close();
		fw.close();
		}
		catch(IOException e)
		{
			System.out.println("ERROR WHILE WRITING THE FILE : "+e.getMessage());
		}
		
	}

}
