package Coordinate;
import java.util.Map;

import java.util.function.Function;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;


public abstract class Point2DType extends ComplexDataType<Point2D> {
	public static Point2DType Instance;
	//private static final String NAME = "Instance";
	private Point2DType() {
		super("Point2D", Point2D.class);
		
	}
	
	@Override
	public Function<Map<String, Object>, Point2D> fromMap(){
		return map -> new Point2D(
			(double) map.getOrDefault("x", 0.0),
			(double) map.getOrDefault("y", 0.0)
			);
		}
	
	@Override
	public Point2D getDefaultValue() {
		return new Point2D(0,0);
	}
	
	
}
