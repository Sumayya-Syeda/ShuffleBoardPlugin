import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import edu.wpi.first.shuffleboard.api.util.Maps;

public class Point2D extends ComplexData<Point2D>{
	private double x;
	private double y;
	
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
//	@Override
//	public Map<String, Object> asMap(){
//		return Maps.<String, Object>builder()
//				.put("x", x)
//				.put("y", y)
//				.build();
//	}
	
	@Override
	public Map<String, Object> asMap(){
		Map<String, Object> map = new HashMap<>();
		map.put("x", this.x);
		map.put("y", this.y);
		return map;
	}
	public Point2D withX(double x) {
		this.x = x;
		return null;
	}
	
	public Point2D withY(double y) {
		this.y = y;
		return null;
	}
	
	
	
	
	
	
}
