import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class ReadFiles {
	
	
	
	public static void main(String[] args) 
	{
		String filePath = "D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\Test.txt";
		String filePathCopy = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\Copy.txt";
		try
		{
			Files.copy(Path.of(filePath), Path.of(filePathCopy),StandardCopyOption.REPLACE_EXISTING);
		}
		
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		/*try(Stream<String> lines = Files.lines(Path.of(filePath));)
		{
			lines.forEach(line->System.out.println(line));
			
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}*/
	}

	public ReadFiles() {
		// TODO Auto-generated constructor stub
	}

}
