import com.globalpayex.geometry.entities.Square;
import com.globalpayex.geometry.entities.Rectangle;
import com.globalpayex.geometry.entities.Circle;
import com.abc.geometry.ShapeData;
public class ShapeRun 
{
	
	public static void main(String[] args) 
	{
		Square s1 = new Square(7.0f);
		Rectangle r1 = new Rectangle(3.0f,2.0f);
		Circle c1 = new Circle(3.0f);
		
		ShapeData.printShapeData(s1);
		ShapeData.printShapeData(r1);
		ShapeData.printShapeData(c1);
		
	}
	

}
