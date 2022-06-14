import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class JavaFiles 
{
	

	public JavaFiles() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		
		String filePath = "D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop";
		
		//check whether file exists
		System.out.println(Files.exists(Path.of(filePath)));
		String dirPath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src";
		System.out.println(Files.isRegularFile(Path.of(dirPath)));
		System.out.println(Files.isDirectory(Path.of(dirPath)));
		/*Stream<Path> paths = null;
		try
		{
			paths = Files.list(Path.of(dirPath));
		}
		
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		
		paths.forEach(path->System.out.println(path.getFileName()));
		
		paths.close();*/
		
		//to make the paths close automatically
		// as the Stream uses the Autoclose interface
/*		
		try(Stream<Path> paths = Files.list(Path.of(dirPath));)
		{
			paths.forEach(path->System.out.println(path.getFileName()));
			
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
*/			
		
		//Print all files at all depths
		/*try(Stream<Path> recursivePaths = Files.walk(Path.of(dirPath));)
		{
			recursivePaths.forEach(path->System.out.println(path.getFileName()));
			
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		*/
		
		try(Stream<Path> recursivePaths = Files.walk(Path.of(dirPath));)
		{
		recursivePaths.filter(path->Files.isRegularFile(path))
					  .forEach(path->System.out.println(path.getFileName()));
			
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		
		
		
		
		
		
	}

}
