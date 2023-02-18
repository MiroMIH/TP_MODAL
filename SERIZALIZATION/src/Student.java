import java.io.*;

public class Student implements Serializable {
	int mat;
	String Name;
	
	public Student(int mat, String Name)
	{
		this.mat=mat;
		this.Name=Name;
	}

}
