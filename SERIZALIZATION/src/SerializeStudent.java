import java.io.*;

public class SerializeStudent {

	private static final String FILE_NAME="C:\\test\\test1.ser";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SERIEZLIZATION");
		
		Student s1=new Student(1,"amir");
		Student s2=new Student(2,"loka");
		
		//SERIZLIZATION
		
		try
		{
			FileOutputStream fs=new FileOutputStream(FILE_NAME);
			ObjectOutputStream os=new  ObjectOutputStream(fs);
			
			//Series
			os.writeObject(s1);
			os.writeObject(s2);
			
			os.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		//DERSERLIZATON
		try
		{
		FileInputStream fis=new FileInputStream(FILE_NAME);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Student s=(Student) ois.readObject();
		System.out.println(s.mat+" "+s.Name);
		
		ois.close();
		}
		catch(EOFException ex)
		{
			System.out.println("END OF FILE ");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
