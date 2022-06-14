import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;



public class MultiThreadExecutor {



public static void main(String[] args) {
ExecutorService executorService = Executors.newFixedThreadPool(2);
//ExecutorService executorService2 = Executors.newSingleThreadExecutor();
executorService.execute(() -> {
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

executorService.execute(() -> {
	String dirPath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src";
	try(Stream<Path> paths = Files.list(Path.of(dirPath));)
	{
		paths.forEach(path->System.out.println(path.getFileName()));
		System.out.println(Thread.currentThread());
	}
	catch (IOException e)
	{
		throw new RuntimeException(e);
	}

}
);



//fThread.start();
	MathSeries mSeries = new MathSeries();
	Object [] fib = mSeries.createFibonacci(30).toArray();
	for (Object i : fib)
	{
		System.out.println(Thread.currentThread());
	//System.out.println(i);
	}


}
}