import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MultiThread {

	
	public static void main(String[] args) 
	{
		Thread fThread = new Thread(()->
		{
			String filePath = "D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\Test.txt";
			String filePathCopy = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\Copy.txt";
			try
			{
				Files.copy(Path.of(filePath), Path.of(filePathCopy),StandardCopyOption.REPLACE_EXISTING);
				System.out.println(Thread.currentThread());
			}
			
			catch(IOException e)
			{
				throw new RuntimeException(e);
			}
			
		}
		);
		fThread.start();
		MathSeries mSeries = new MathSeries();
		Object [] fib = mSeries.createFibonacci(30).toArray();
		for (Object i : fib)
		{
			System.out.println(Thread.currentThread());
			//System.out.println(i);
		}
		
	}

}
