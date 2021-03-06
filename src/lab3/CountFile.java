package lab3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountFile {

	public static void main(String[] args) {

		try
		{
			int lines=0,chars=0,words=0;
			int code=0;
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\TrainingBasics\\JavaBasics\\src\\lab3\\CountFile.java");
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)
				chars++;
				if(code==32)
				words++;
				if(code==13)
				{
					lines++;
					words++;
				}
			}
			System.out.println("No.of characters = "+chars);
			System.out.println("No.of words = "+(words+1));
			System.out.println("No.of lines = "+(lines+1));
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}

	}

}
