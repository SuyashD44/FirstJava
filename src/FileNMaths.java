import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileNMaths {

	public static void main(String [] args) 
	{
		MathSeries mSeries = new MathSeries();
		Object [] fib = mSeries.createFibonacci(30).toArray();
		String filePath = "D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\Test.txt";
		String filePathCopy = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\Copy.txt";
		for (Object i : fib)
		{
			System.out.println(i);
		}
		try
		{
			Files.copy(Path.of(filePath), Path.of(filePathCopy),StandardCopyOption.REPLACE_EXISTING);
		}
		
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		//System.out.println(fib);
		// TODO Auto-generated constructor stub
	}

}
